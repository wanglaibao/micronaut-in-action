#   ANNOTATION PROCESSING 101
First, I am going to explain to you what annotation processing is, 

what you can do with that powerful tool and finally what you cannot do with it.
 
In a second step we will implement a simple annotation processor step by step.

### The Basics of annotation processing

* Annotation processing is a tool build in javac for scanning and processing annotations at compile time.

    We can register our own annotation processor for certain annotations.
    
    Annotation processing is already available since Java 5 but a useable API is available since Java 6.
    
    An annotation processor for a certain annotation takes java code (or compiled byte code) as input and generate files (usually .java files) as output. 
    What does that exactly means? We can generate java code! The generated java code is in a generated .java file. 
    So We can not manipulate an existing java class for instance adding a method. 
    The generated java file will be compiled by javac as any other hand written java source file.
    
    
### AbstractProcessor
    