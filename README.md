# Assignment S108

## General info:

**Project description**:
This project implements functionality to transform, filter and sort collections using lambda functions, 
as well as using functional interfaces to define reusable behaviors. 

**Technologies**: Backend Java

**Prerequisites:**
* **Maven**: Required to download external dependencies (JUnit and AssertJ for testing)

**Installation and Compilation**:
1. Clone repository:
   https://github.com/bmestres/tascaS108.git
2. Navigate to the project root directory:
`cd tascaS108`
3. Resolve dependencies and compile the project using Maven:
`mvn clean compile`

## Level 1:
Use of lambda expressions and the Streams API to work with collections. Filtering, transforming and sorting data. 
Use of Functional Interfaces allow you to encapsulate behaviors.

### Exercise 1:
**Description:** Method that, given a list of strings, returns a list of all strings containing the letter 'o'. 
Finally, we print result in console.

**Execution:**
java -cp target/classes nivell01.exercise01.Main

### Exercise 2:
**Description:** Method that, given a list of strings, returns a list of all strings containing the letter 'o'.
and also have more than 5 letters. Finally, print result.

**Execution:**
java -cp target/classes nivell01.exercise02.Main

### Exercise 3:
**Description:** Method that creates a list with the names of the months of the year. 
Prints all list items with a lambda.

**Execution:**
java -cp target/classes nivell01.exercise03.Main

### Exercise 4:
**Description:**
Method that performs the same action of the previous point,
using method reference.

**Execution:**
java -cp target/classes nivell01.exercise04.Main

### Exercise 5:
**Description:**
Creates a Functional Interface with a method called getPiValue() that must return a double. 
From main() of the main class, instance the interface and assign the value 3.1415 to it. 
Invokes the getPiValue() method and prints the result.

**Execution:**
java -cp target/classes nivell01.exercise05.Main

### Exercise 6:
**Description:**
Creates a list with numbers and text strings and sorts the 
list with the shortest to longest strings.

**Execution**
java -cp target/classes nivell01.exercise06.Main

### Exercise 7:
**Description:**
Using the same list of the previous program, sorts it backwards, from longer to shorter chain.

**Execution**
java -cp target/classes nivell01.exercise07.Main

### Exercise 8:
**Description:**
Creates a Functional Interface containing a method reverse(). This method receives and returns a String. 
In main() of the main class, it injects the interface created by a lambda the body of the method, so that it returns the same string 
it receives as a parameter but in reverse. Invokes the interface instance by passing a string and checks if the result is correct.

**Execution**
java -cp target/classes nivell01.exercise08.Main

## Level 2:
Use of lambda expressions in more specific conditions, combined operations and direct modifications of the elements. 
Creation of functional interfaces to represent arithmetic operations as reusable functions, approaching the functional paradigm.

### Exercise 1:
**Description**
Creates a list of strings with proper names. A method that returns a list of all strings starting with 
the letter 'A' (uppercase) and have exactly 3 letters. Print result.

**Execution**
java -cp target/classes nivell02.exercise01.Main

### Exercise 2:
**Description**
Creates a method that returns a CS string, based on a list of Integers. 
Each even number is preceded by letter “e”, if the number is odd, gets preceded by the letter “o”.

**Execution**
java -cp target/classes nivell02.exercise02.Main

### Exercise 3:
**Description**
Creates a Functional Interface containing a method operation().
Injects the interface created by a lambda, the body of the method, so that the operation can be transformed with a sum, a subtraction, a multiplication and a division.

**Execution**
java -cp target/classes nivell02.exercise03.Main

### Exercise 4:
**Description**

Creates a list containing some strings of text and numbers. Then, sorts it alphabetically by the first character, 
strings that contain an "e" first and the rest of the strings later,
Mmdifyes all items in the list that have an 'a' by a ‘4’, 
and finally, shows only numeric items.

**Execution**
java -cp target/classes nivell02.exercise04.Main


#### Project structure:
``` text
.
├── README.md
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── nivell01
│   │   │   │   ├── exercise01
│   │   │   │   │   ├── ListPrinter.java
│   │   │   │   │   ├── Main.java
│   │   │   │   │   ├── StringFilterer.java
│   │   │   │   │   └── StringsList.java
│   │   │   │   ├── exercise02
│   │   │   │   │   ├── ListPrinter.java
│   │   │   │   │   ├── Main.java
│   │   │   │   │   └── StringFilterer.java
│   │   │   │   ├── exercise03
│   │   │   │   │   ├── ListPrinter.java
│   │   │   │   │   ├── Main.java
│   │   │   │   │   └── Months.java
│   │   │   │   ├── exercise04
│   │   │   │   │   ├── ListPrinter.java
│   │   │   │   │   ├── Main.java
│   │   │   │   │   └── Months.java
│   │   │   │   ├── exercise05
│   │   │   │   │   ├── Main.java
│   │   │   │   │   └── ValueSupplier.java
│   │   │   │   ├── exercise06
│   │   │   │   │   ├── Main.java
│   │   │   │   │   └── StringsSort.java
│   │   │   │   ├── exercise07
│   │   │   │   │   ├── Main.java
│   │   │   │   │   └── StringsSortReverse.java
│   │   │   │   └── exercise08
│   │   │   │       ├── Main.java
│   │   │   │       ├── Text.java
│   │   │   │       └── TextFormat.java
│   │   │   └── nivell02
│   │   │       ├── exercise01
│   │   │       │   ├── ListPrinter.java
│   │   │       │   ├── Main.java
│   │   │       │   └── ProperNameFilter.java
│   │   │       ├── exercise02
│   │   │       │   ├── CSVBuilder.java
│   │   │       │   └── Main.java
│   │   │       ├── exercise03
│   │   │       │   ├── Main.java
│   │   │       │   ├── Numbers.java
│   │   │       │   └── OperationsPerformer.java
│   │   │       └── exercise04
│   │   │           ├── Main.java
│   │   │           └── MixedList.java
│   │   └── resources
│   └── test
│       └── java
│           ├── nivell01
│           │   ├── exercise01
│           │   │   └── ListOfStringsTest.java
│           │   ├── exercise02
│           │   │   └── ListOfStringsTest.java
│           │   ├── exercise05
│           │   │   └── ValueSupplierTest.java
│           │   ├── exercise06
│           │   │   └── StringSortTest.java
│           │   ├── exercise07
│           │   │   └── StringSortReverseTest.java
│           │   └── exercise08
│           │       └── StringInReverseTest.java
│           └── nivell02
│               ├── exercise01
│               │   └── properNameFilterTest.java
│               └── exercise02
│                   └── CSVBuilderTest.java
└── target
    ├── classes
    │   ├── nivell01
    │   │   ├── exercise01
    │   │   │   ├── ListPrinter.class
    │   │   │   ├── Main.class
    │   │   │   ├── StringFilterer.class
    │   │   │   └── StringsList.class
    │   │   ├── exercise02
    │   │   │   ├── ListPrinter.class
    │   │   │   ├── Main.class
    │   │   │   └── StringFilterer.class
    │   │   ├── exercise03
    │   │   │   ├── ListPrinter.class
    │   │   │   ├── Main.class
    │   │   │   └── Months.class
    │   │   ├── exercise04
    │   │   │   ├── ListPrinter.class
    │   │   │   ├── Main.class
    │   │   │   └── Months.class
    │   │   ├── exercise05
    │   │   │   ├── Main.class
    │   │   │   └── ValueSupplier.class
    │   │   ├── exercise06
    │   │   │   ├── Main.class
    │   │   │   └── StringsSort.class
    │   │   ├── exercise07
    │   │   │   ├── Main.class
    │   │   │   └── StringsSortReverse.class
    │   │   └── exercise08
    │   │       ├── Main.class
    │   │       ├── Text.class
    │   │       └── TextFormat.class
    │   └── nivell02
    │       ├── exercise01
    │       │   ├── ListPrinter.class
    │       │   ├── Main.class
    │       │   └── ProperNameFilter.class
    │       ├── exercise02
    │       │   ├── CSVBuilder.class
    │       │   └── Main.class
    │       ├── exercise03
    │       │   ├── Main.class
    │       │   └── Numbers.class
    │       └── exercise04
    │           ├── Main.class
    │           └── MixedList.class
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    └── test-classes
        ├── nivell01
        │   ├── exercise01
        │   │   └── ListOfStringsTest.class
        │   ├── exercise02
        │   │   └── ListOfStringsTest.class
        │   ├── exercise05
        │   │   └── ValueSupplierTest.class
        │   ├── exercise06
        │   │   └── StringSortTest.class
        │   ├── exercise07
        │   │   └── StringSortReverseTest.class
        │   └── exercise08
        │       └── StringInReverseTest.class
        └── nivell02
            ├── exercise01
            │   └── properNameFilterTest.class
            └── exercise02
                └── CSVBuilderTest.class
```