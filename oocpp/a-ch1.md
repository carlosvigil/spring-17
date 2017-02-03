Carlos Vigil

Dr. Luarasi

OOC++

January 25, 2017

## Questions: Programs and Programming Languages

1. What is an algorithm?

	A set of well thought out instructions to accomplish a specific task.

2. Why were computer languages invented?

	To give “life” to computers. Normally, a computer doesn’t do anything but with a program it can, and those programs are written in a computer language.

3. What is the difference between a high-level language and a low-level language?

	High-level languages are easily human readable with knowledge of the syntax, but inefficient for computer processing; low-level languages are more difficult to read by humans, but easy to parse by computers and hardware.

4. What does portability mean?

	Portability means that the object is easy to move from one place to another. This could be written code or hardware in space. _When it can be compiled in another system._ 

5. Explain the operations carried out by the preprocessor, compiler, and linker.

	The preprocessor takes directives from source and converts them into statements in the same code.

	The compiler converts that source code into machine code.

	Then, the linker connects hardware code to the machine code to produce an executable.

6. Explain what is stored in a source file, an object file, and an executable file.

	Source code contains human readable content and instructions. The object file has groups of machine code that will later link to different parts of the system. And the executable file has made all the proper connections to run the program.

7. What is an integrated development environment?

	An IDE bring together many functions that developers use to create programs, and puts it into a single executable with a friendly UI.

## Questions: What is a Program Made of?

1. Describe the difference between a key word and a programmer-defined identifier

	A keyword is recognized by the preprocessor and compiler at build time to carry out specific actions key to the language’s methodology. Programmer-defined identifiers are used to represent variables and functions to easily call on them in the future or to simply make the code more readable to humans.

2. Describe the difference between operators and punctuation symbols.

	Punctuation symbols usually help to make code readable for both humans and compilers. Punctuations like semicolons let both parties know that a statement has ended. Operators are symbols used to signify the use of a function like addition or comparison.

3. Describe the difference between a program line and a statement.

	A line is simple a downward movement of the text, like in a typewriter, to help with readability of the code and styling. A statement is a directive or collection of information that is clearly separated from other groups of instructions or information.

4. Why are variables called “variable”?

	The word variable means not consistent or subject to change. That’s why variables are named so.

5. What happens to a variable’s current contents when a new value is stored there?

	The current contents are replaced by the new value entered.

6. What must take place in a program before a variable is used?

	The type of variable, and that a variable is being defined, must be communicated through the code to the computer. This is called variable definition.

7. What are the three primary activities of a program

	A program typically gathers data, processes the input and communicates it back to the user.

## Questions: The Programming Process

1. What four items should identify when defining what a program is to do?

	Declare a purpose, gather input, process the information, and provide an output.

2. What does it mean to “visualize a program running”? What is the value of such an activity?

	It is a brief overview of the usage flow. You can identify issues or requirements from mentally running the program.

3. What is a hierarchy chart?

	A subdividing of the problems the program is to solve. From the main purpose to minor issues in the usage of the program.

4. Describe the process of desk-checking.

	A sketching of the programming logic

5. Describe what a compiler does with a program’s source code.
6. What is a run-time error?
7. Is a syntax error (such as misspelling a key word) found by compiler or when the program is running?
8. What is the purpose of testing a program with sample data or input?
9. **Briefly describe the difference between procedural and object-oriented programming.**

## Algorithm Workbench

Draw hierarchy charts or flowcharts that depict the programs described below.

### 30. Available credits

The following steps should be followed in a program that calculates a customer’s available credit:

1. Display the message “Enter the customer’s maximum credit.”

2. Wait for the user to enter the customer’s maximum credit.

3. Display the message “Enter the amount of credit used by the customer’s.”

4. Wait for the user to enter the customer’s credit used.

5. Subtract the used credit from the maximum credit to get the customer’s available credit.
/1-1.png

### 31. Sales Tax

Design a hierarchy chart or flowchart for a program that calculates the total of a retail sale. The program should ask the user for:

- The retail price of the item being purchased

- The sales tax rate

	Once these items have been entered, the program should calculate and display:

- The sales tax for the purchase

- The total of the sale

### 32. Account Balance

Design a hierarchy chart or flowchart for a program that calculates the current balance in a saving account. The program must ask the user for:

- The starting balance

- The total dollar amount of deposits made

- The total dollar amount of withdrawals made

- The monthly interest rate

	Once the program calculates the current balance, it should be displayed on the screen.

## Predict the Result

Questions 33-35 are programs expressed as English statements. What would each display on the screen if they were actual programs?

```
33. The variable x starts with the value 0.

The variable y starts with the value 5.

Add 1 to x.

Add 1 to y.

Add x and y, and store the result in y.

Display the value in y on the screen. 
```

```
34. The variable j starts with the value 10.

The variable k starts with the value 2.

The variable l starts with the value 4.

Store the value of j times k in j.

Store the value of k times l in l.

Add j and l, and store the result in k.

Display the value in k on the screen.
```

```
35. The variable a starts with the value 1.

The variable b starts with the value 10.

The variable c starts with the value 100.

The variable x starts with the value 0.

Store the value of c times 3 in x.

Add the value of b times 6 to the value already in x.

Add the value of a times 5 to the value already in x.

Display the value in x on the screen.
```

## Find the Error

The following pseudocode algorithm has an error. The program is supposed to ask the user for the length and width of a rectangular room, and then display the room’s area. The program must multiply the width by the length in order to determine the area. Find the error.

	area = width * length
	Display “What is the room’s width?”.
	Input width
	Display “What is the room’s length?”.
	Input length
	Display area