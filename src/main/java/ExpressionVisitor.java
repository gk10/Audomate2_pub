package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.language.Soundex;

import generate.sources.*;

// REMEMBER that when you do variables, treat them the same as how you look up numbers in visitExpr
public class ExpressionVisitor extends AudomateBaseVisitor<String> implements AudomateVisitor<String> {

	public Map<String, AudomateParser.ExprContext> vars = new HashMap<String, AudomateParser.ExprContext>();
	public Map<String, String> tasks = new HashMap<String, String>();
	public ArrayList<String> parts = new ArrayList<String>();

	public ExpressionVisitor(Map<String, AudomateParser.ExprContext> temp, Map<String, String> tasks,
			ArrayList<String> variables) {
		this.vars = temp;
		this.tasks = tasks;
		this.parts = variables;
	}

	public String visitProg(AudomateParser.ProgContext ctx) {
		return visitTesting(ctx.testing());
	}

	public String visitTesting(AudomateParser.TestingContext ctx) {
		for (int i = 0; i < ctx.expr().size() - 1; i++) {
			visitExpr(ctx.expr().get(i));
		}
		return visitExpr(ctx.expr().get(ctx.expr().size() - 1));
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
		} else if(ctx.commands()!=null) {
			return visitCommands(ctx.commands());
		}
		return "nope";
	}

	public String visitCreation(AudomateParser.CreationContext ctx) {
		if (ctx.block != null) {
			//System.out.println(visitExpr(ctx.block));
			
			
			vars.put(ctx.name.getText(), ctx.block);
			return vars.toString();
		} else {
			
			return visitExpr(vars.get(ctx.name.getText()));
		}
	}

	public String visitMachine(AudomateParser.MachineContext ctx) {

		return visitAddPart(ctx.addPart());
	}
	
	public String visitCommands(AudomateParser.CommandsContext ctx) {
		if(ctx.printing()!=null) {
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
		} else if (ctx.type.getText().equals("multiply")) {
			return "" + (Float.valueOf(visitExpr(ctx.left)) * Float.valueOf(visitExpr(ctx.right)));
		} else if (ctx.type.getText().equals("subtract")) {
			return "" + (Float.valueOf(visitExpr(ctx.right)) - Float.valueOf(visitExpr(ctx.left)));
		} else if (ctx.type.getText().equals("divide")) {
			return "" + (Float.valueOf(visitExpr(ctx.left)) / Float.valueOf(visitExpr(ctx.right)));
		}
		return "If you're seeing this, the math didn't happen";
	}

	/*
	 * EVENTUALLY i'll disregard the if statements in favor of switches
	 */
	public String visitConditional(AudomateParser.ConditionalContext ctx) {
		if (ctx.loops() != null) {
			return visitLoops(ctx.loops());
		}
		if (ctx.inequality() != null) {
			return visitInequality(ctx.inequality());
		}
		if (ctx.op.getText().equals("less")) {
			if (Float.valueOf(visitExpr(ctx.left)) < Float.valueOf(visitExpr(ctx.right))) {
				return visitExpr(ctx.block);
			}
		} else if (ctx.op.getText().equals("greater")) {
			if (Float.valueOf(visitExpr(ctx.left)) > Float.valueOf(visitExpr(ctx.right))) {
				return visitExpr(ctx.block);
			}
			/**
			 * The catch all if statement: Whatever gets checked here
			 * (Boolean.valueOf(visitExpr(ctx.left))) HAS to return a "true" or "false"
			 * response If it passes, then run the block
			 */
		} else if (ctx.op.getText().equals("do")) {
			System.out.println("here");

			if (Boolean.valueOf(visitExpr(ctx.left))) {
				return visitExpr(ctx.block);
			}
		}
		return "false";

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
			while (Boolean.valueOf(visitExpr(ctx.left))) {
				System.out.println(visitExpr(ctx.block));
				//visitExpr(ctx.block);
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
			for (float i = 0; i < Float.valueOf(visitExpr(ctx.left)); i++) {
				System.out.println(visitExpr(ctx.block));

				//visitExpr(ctx.block);
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
			if (Float.valueOf(ctx.left.getText()) > Float.valueOf(ctx.right.getText())) {
				return "true";
			}
		}
		return "false";
	}

}
