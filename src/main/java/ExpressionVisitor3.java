package main.java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.language.Soundex;

import generate.sources.*;

// REMEMBER that when you do variables, treat them the same as how you look up numbers in visitExpr
public class ExpressionVisitor3 extends AudomateBaseVisitor<String> implements AudomateVisitor<String> {

	public Map<String, AudomateParser.TestingContext> vars = new HashMap<String, AudomateParser.TestingContext>();
	public Map<String, String> tasks = new HashMap<String, String>();
	public ArrayList<String> parts = new ArrayList<String>();
	public String machineIP;

	public ExpressionVisitor3(Map<String, AudomateParser.TestingContext> temp, Map<String, String> tasks,
			ArrayList<String> variables, String ip) {
		this.vars = temp;
		this.tasks = tasks;
		this.parts = variables;
		this.machineIP = ip;
	}

	public String visitProg(AudomateParser.ProgContext ctx) {
		return visitTesting(ctx.testing());
	}

	public String visitTesting(AudomateParser.TestingContext ctx) {
		if (ctx.testing() != null) {
			visitTesting(ctx.testing());
		}
		return visitExpr(ctx.expr());
	}

	public String visitExpr(AudomateParser.ExprContext ctx) {

		if (ctx.math() != null) {
			return visitMath(ctx.math());
		} else if (ctx.beep() != null) {
			return "boop";
		} else if (ctx.conditional() != null) {
			return visitConditional(ctx.conditional());
		} else if (ctx.primitive() != null) {
			return ctx.primitive().getText();
		} else if (ctx.creation() != null) {
			return visitCreation(ctx.creation());
		} else if (ctx.machine() != null) {
			return visitMachine(ctx.machine());
		} else if (ctx.commands() != null) {
			return visitCommands(ctx.commands());
		} else if (ctx.lists() != null) {
			return visitLists(ctx.lists());
		}
		return "nope";
	}

	public String visitLists(AudomateParser.ListsContext ctx) {
		if (ctx.getindex() != null) {
			return visitGetindex(ctx.getindex());
		}

		System.out.println("test");
		String name = new Soundex().encode(ctx.name.getText());

		vars.put(name, ctx.block);
		return "Saved " + ctx.name.getText() + " as " + vars.get(name).getText();
	}

	public String visitGetindex(AudomateParser.GetindexContext ctx) {
		System.out.println("index");
		String name = new Soundex().encode(ctx.name.getText());
		String list = vars.get(name).getText();
		String[] array = list.split(" ");
		String result = array[Math.round(Float.valueOf(visitExpr(ctx.index)))];
		
		return visitTesting(new ToTree(result).toContext());
	}

	public String visitCreation(AudomateParser.CreationContext ctx) {
		String name = new Soundex().encode(ctx.name.getText());
		if (ctx.op != null) {
			return ctx.name.getText() + " is " + vars.get(name).getText();
		}
		if (ctx.block != null) {
			// System.out.println(visitExpr(ctx.block));
			if (ctx.type.getText().equals("value")) {
				String temp = new ToTree(visitTesting(ctx.block)).toContext().getText();
				System.out.println(temp);
				vars.put(name, new ToTree(visitTesting(ctx.block)).toContext());
				return "Saved " + ctx.name.getText() + " as " + vars.get(name).getText();
			} else if (ctx.type.getText().equals("function")) {
				vars.put(name, new ToTree(ctx.block.getText()).toContext());
				return "Saved " + ctx.name.getText() + " as " + vars.get(name).getText();
			}
		} else {

			return visitTesting(vars.get(name));
		}
		return visitTesting(vars.get(name));
	}

	public String visitMachine(AudomateParser.MachineContext ctx) {
		if (ctx.doTask() != null) {
			return visitDoTask(ctx.doTask());
		}
		return visitAddPart(ctx.addPart());
	}

	public String visitCommands(AudomateParser.CommandsContext ctx) {
		if (ctx.printing() != null) {
			return visitPrinting(ctx.printing());
		}
		return "nope2";
	}

	public String visitPrinting(AudomateParser.PrintingContext ctx) {
		return ctx.expr().getText();
	}

	public String visitAddPart(AudomateParser.AddPartContext ctx) {
		parts.add(ctx.part.getText());
		return parts.toString();
	}

	public String visitMath(AudomateParser.MathContext ctx) {
		if (ctx.type.getText().equals("add")) {
			/**
			 * visitExpr is done to recursively get the numerical value of the expression;
			 * i.e., if you only checked for the value of ctx.left.getText you couldn't do
			 * 'add add 1 and 2 and add 2 and 4' because 'add 1 and 2' is an expression that
			 * can't translate to a number without being resolved first.
			 **/
			return "" + (Float.valueOf(visitExpr(ctx.left)) + Float.valueOf(visitExpr(ctx.right)));
		} else if (ctx.type.getText().equals("multiply") || ctx.type.getText().equals("x")) {
			return "" + (Float.valueOf(visitExpr(ctx.left)) * Float.valueOf(visitExpr(ctx.right)));
		} else if (ctx.type.getText().equals("subtract")) {
			return "" + (Float.valueOf(visitExpr(ctx.right)) - Float.valueOf(visitExpr(ctx.left)));
		} else if (ctx.type.getText().equals("divide")) {
			return "" + (Float.valueOf(visitExpr(ctx.left)) / Float.valueOf(visitExpr(ctx.right)));
		}
		return "If you're seeing this, the math didn't happen";
	}

	public String visitConditional(AudomateParser.ConditionalContext ctx) {
		if (ctx.loops() != null) {
			return visitLoops(ctx.loops());
		}
		if (ctx.inequality() != null) {
			return visitInequality(ctx.inequality());
		}
		if (Boolean.valueOf(visitTesting(ctx.left))) {
			return visitTesting(ctx.block);
		} else if (ctx.op != null) {
			return visitTesting(ctx.block2);
		} else {
			return "false";
		}
	}

	public String visitLoops(AudomateParser.LoopsContext ctx) {
		/**
		 * Loops is part of the conditional parser (a parser within a parser) Like how
		 * expr checks if condition is null, condition checks if loops is null. I assume
		 * like the other methods, loops SHOULD return a visitExpr.
		 * 
		 * If i'm going to have a while loop update a variable while inside it, the
		 * 'update' call should be within the block. The whole block is put into
		 * visitExpr.
		 */
		if (ctx.type.getText().equals("while")) {
			while (Boolean.valueOf(visitTesting(ctx.left))) {
				System.out.println(visitTesting(ctx.block));
				// visitExpr(ctx.block);
			}
			/**
			 * Maybe confusing, but 'do' signifies a for loop. Can't fit the word 'for'
			 * elegantly in natural speak Left should always be a number, but I set it as an
			 * expr in the grammar because a number can be an expr anyways, and if it was
			 * set as a number from the get go i couldn't translate an expression to a
			 * number (i.e., if you had a var apple is 4, it would try to cast the phrase
			 * 'apple is 4' as as a number otherwise)
			 * 
			 * Possibly further confusing, but 'left' doesn't actually appear left of the
			 * block like it does in the while loop. I kept the naming conventions the same
			 * for consistency
			 */
		} else if (ctx.type.getText().equals("do")) {
			for (float i = 0; i < Float.valueOf(visitTesting(ctx.left)); i++) {
				System.out.println(visitTesting(ctx.block));

				// visitExpr(ctx.block);
			}
		}
		return "Loop finished";
	}

	public String visitInequality(AudomateParser.InequalityContext ctx) {
		if (ctx.op.getText().equals("less")) {
			if (Float.valueOf(visitExpr(ctx.left)) < Float.valueOf(visitExpr(ctx.right))) {
				return "true";
			}
		} else if (ctx.op.getText().equals("greater")) {
			if (Float.valueOf(visitExpr(ctx.left)) > Float.valueOf(visitExpr(ctx.right))) {
				return "true";
			}
		}
		return "false";
	}

	public String visitDoTask(AudomateParser.DoTaskContext ctx) {
		try {
			String list = ctx.task.getText();
			String[] array = list.split(" ");
			for (String str : array) {
				Socket sock = new Socket(machineIP, 8080);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				OutputStream output = sock.getOutputStream();
				DataOutputStream dataOut = new DataOutputStream(output);

				dataOut.writeUTF(str);

				dataOut.flush();
				dataOut.close();
				sock.close();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Task completed";
	}

}
