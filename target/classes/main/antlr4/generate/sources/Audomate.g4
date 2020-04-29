grammar Audomate;

prog
:
|	testing EOF
;

testing
:
| expr
| expr ' ' testing
| expr ' and ' testing
| ' ' expr ' ' testing
;
expr
:
|	math
|	beep
|	conditional
|	primitive
|   creation
|	machine
|	commands
|	lists
;

lists
:
|'make a list ' name=WORD ' with ' block=testing
|getindex
;

getindex
:
|'index of ' name=WORD ' from ' index=expr
|'the ' index=expr ' ' WORD ' from ' name=WORD
;

commands:
|printing
;

printing:
|'say ' expr
;

math
:
	| type='add' ' ' left=expr ' and ' right=expr
	| type='add' ' ' left=expr ' + ' right=expr
	| type='at' ' ' left=expr ' and ' right=expr
	| type='at' ' ' left=expr ' + ' right=expr
	| type='multiply' ' ' left=expr ' by ' right=expr
	| type='multiply' ' ' left=expr ' and ' right=expr
	| type='x' ' ' left=expr ' by ' right=expr
	| type='x' ' ' left=expr ' and ' right=expr
	| type='divide' ' ' left=expr ' by ' right=expr
	| type='subtract' ' ' left=expr ' from ' right=expr
;

primitive
:
|Word
|Number
;



beep
:
|'beep'
;

conditional:
|'if ' left=expr ' is ' op='less' ' than ' right=expr ' do ' block=expr
|'if ' left=expr ' is ' op='greater' ' than ' right=expr ' do ' block=expr
|'if ' left=expr ' ' op='do' ' ' block=expr
|'if ' left=expr ' ' op='do' ' ' block=expr ' else ' block2=expr 
|loops
|inequality
;

loops:
|type='do' ' ' block=testing ' ' left=testing ' times'
|type='while' ' ' left=testing ' do ' block=testing
;

inequality:
|'the number ' left=expr ' is ' op='less' ' than ' right=expr
|'the number ' left=expr ' is ' op='greater' ' than ' right=expr
|'the number ' left=expr ' is ' op='equal' ' to ' right=expr
|'the number ' left=expr ' is ' op='less' ' than or ' isEqual='equal' ' to ' right=expr
|'the number ' left=expr ' is ' op='greater' ' than or ' isEqual='equal' ' to ' right=expr
;

creation:
|'the ' type='value' ' of ' name=WORD ' is ' block=testing
|'the ' type='function' ' ' name=WORD ' is ' block=testing
|name=WORD
|op='describe' ' ' name=WORD
;

machine:
|addPart
|doTask
|createTask
;

createTask:
|task=WORD ' is ' action=WORD ' ' part=WORD 
|task=WORD ' is ' action=WORD ' ' part=WORD ' ' var=expr
|task=WORD ' is ' action=WORD ' ' part=WORD ' ' var=expr ' times'
;

doTask:
|'run ' task=WORD
;


addPart:
|'an ' part=WORD ' is part of the machine'
|'a ' part=WORD ' is part of the machine'
;

Number
:
	REAL
	| INT
;

fragment
REAL
:
	[0-9]* '.' [0-9]+
;

INT
 : '0'
 | [1-9] [0-9]*
 ;

fragment
ALL
:
	[a-zA-Z]
;

WORD
:
	ALL+
;