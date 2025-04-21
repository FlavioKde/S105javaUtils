# README - List Directory Alphabetically

## Description
This program lists the contents of a directory in alphabetical order.
The directory to be listed is received as a parameter during execution.

## Compilation Instructions
To compile the necessary Java classes and generate the `.class` files in the
`target/classes` directory, use the following command:

javac -d target/classes
\ src/main/java/level1/exercise1/logic/ArgumentValidator.java
\ src/main/java/level1/exercise1/mainManager/MainDirectory.java
\ src/main/java/level1/exercise1/logic/ManagementDirectory.java
\ src/main/java/level1/exercise1/dataClass/ListDirectory.java

## Execution Instructions
To execute the main class (`MainDirectory`), specify the classpath (`target/classes`)
and pass the directory path as an argument:

java -cp target/classes level1.exercise1.mainManager.MainDirectory "../../../Admin"


This command will list the contents of the `Admin` directory in alphabetical order.

## Notes
- Ensure that the provided directory exists and is accessible.
- The program will list all files and subdirectories alphabetically.
- Modify the directory path argument as needed for different locations.
























