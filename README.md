# FOM - Java kellerkind.codes
This repository is used to check in thigs that i learnd in the university

**Usage**

This is a maven project. I will not explain how haven works just the commands you have to fire in your console.

_Structure_
- A place where you can place your classes you will find under: **src/main/codes.kellerkind**.
- For every exercise there is an extra folder under /exercises similar to /exercises/ex7 
- The main class just instantiates the given exercise and executes it
~~~~ 
> The main class is a good starting point the get knowledge about the arcitecture 
~~~~

_Add Exercises_
If you want to add an exercise then do the following:
- add a subfolder under src/main/java/codes/kellerkind/exercises/ similar to ex7
- create a class that will contain the logic of the exercise
- extend your class from Exercise.java (See: src\main\java\codes\kellerkind\exercises\Exercise.java)
- override the method executeExercise() similar to the HelloWorld example in the ex7 package

Almost everything is done now. The only thing you still have to do is that the Main class knows the new Exercise class.
To make that the Main class gets in touch with the new Exercise do the following:
- Open the Main class (See: src\main\java\codes\kellerkind\Main.java)
- Find the inner enum "ParamToClassMapping"
- Add a new value for the mapping similar to the 'HELLOWORLD("HelloWorld")' -> to make it easy to find it should be the same name as your class

That's it -> you just have to compile and execute the application (See next steps)


_Compile_
As we use maven to compile every resource you can do the following:
- Open a command line by pressing: CRTL + R > type 'cmd' > press enter
- navigate to the folder where the pom.xml is placed. In other word the root folder (See: \FOM\pom.xml)
- type mvn clean install
- If you did not do any mistake then there will not be any error shown and it says: "BUILD SUCCESS"
- If not fix it :)

Cool you were build the first time with mvn (maven). You just have to execute everything and see if it works (See next step)

_Execution_
Our class files are now packed in a jar file. It is like a package with every .java and every .class file
To run our application you can do the following steps:
- go to folder /FOM/target (Note: this folder is just there if you did the steps under _Compile_)
- execute java -jar FOM-0.0.0.jar {YourMappedExercise}
- {YourMappedExercise} is the String you mapped in the Main.ParamToClassMapping enum 
