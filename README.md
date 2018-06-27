# Stex
Stex is an abstract machine and consists of a compiler and a VM. It is written in Java 8 and uses Maven 3.

# Build instructions

First you need to generate the sources (ANTLR generates the source files from the grammar g4 file). Afterwards you can build the whole project
```
mvn generate-sources
mvn install
```

# Try it out
The built stex artifact is located in stex-interpreter/target/stex-interpreter-<version>-jar-with-dependencies.jar. You can run it with --help to get the available options.
 - -c <outfile>: Compile the given source files (.stex) as arguments into an stex executabel (.stexc)
 - -r: Run the source file (.stex) or stex executable (.stexc)
 - -t: Track the execution time in ms
  
 

# Stex Language
 - If you want to make a source file executable, there needs to be function declared with the name main and with exectly one funcion argument. Ussualy it is called args and it when executing the main function, it is initialized as array with all the proccess arguments.
 - The Syntax is case sensitiv
 - Each variable is declared with 'var' and they are handled "as is", so you can give the variable var1 the value 1 and in the next expression you can assign it a String value
 - Each expression ends with a ';'

### Sample file 
```
main(args) {
    /* This is a comment */
    try{
        var input = int(sysread(args));
        var res = fib(input);
        sysprint(res);
    }
    catch(e){
        syserr(e.msg);
        return 1;
    }
}

fib(n) {
    if (n < 1) {
        var ex = {msg = "Only positive numbers > 0 are allowed"};
        throw ex;
    }
    if (n > 2) {
        return fib(n-1) + fib(n-2);
    }
    return 1;
}
```
 
 # Operations
 ## Arithmetic
  - +: Adds numbers, or adds elements to lists or extends strings
  - -: Subtracts numbers or removes elements from lists or removes substrings
  - *: Multiplicate
  - /: Divison
  - %: Modulo
 
## Logical
 - ==: left operand equals right operand. strict equal (needs to be same datatype)
 - !=: left operand not equals right operand
 - \>: left operand bigger than right operand. compares lists sizes, string sizes, number values
 - <: left operand smaller than right operand. compares lists sizes, string sizes, number values
 - and: only for bool types
 - or: only for bool types
 - not: only for bool types
 - in: checks if the left operand is in the right operand. right operand must be an array or a string

## Built-In Functions
 - sysread(): reads from the stdin the next line (max. 1024 chars)
 - sysprint(arg): prints the arg to stdout (without a new line)
 - syserr(arg): prints the arg to stderr (without a new line)
 - size(arg): returns the length of arg if arg is an array or a string
 - type(arg): returns the integer value of the datatype of arg
 - int(arg): converts arg to an integer if possible
 - float(arg): converts arg to a float if possible
 - bool(arg): converts arg to a bool if possible
 - string(arg): makes the string presentation of arg

