grammar Audomate;

prog
:
|	testing EOF
;

testing
:
| expr
| expr ' ' expr
| ' ' expr ' ' expr
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
	| type='multiply' ' ' left=expr ' by ' right=expr
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
|type='do' ' ' block=expr ' ' left=expr ' times'
|type='while' ' ' left=expr ' do ' block=expr
;

inequality:
|'the number ' left=expr ' is ' op='less' ' than ' right=expr
|'the number ' left=expr ' is ' op='greater' ' than ' right=expr
|'the number ' left=expr ' is ' op='less' ' than or ' isEqual='equal' ' to ' right=expr
|'the number ' left=expr ' is ' op='greater' ' than or ' isEqual='equal' ' to ' right=expr
;

creation:
|name=WORD ' is ' block=expr
|name=WORD
;

machine:
addPart
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