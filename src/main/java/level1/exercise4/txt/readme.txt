# README - Read and Display TXT File Contents

## Description
This program reads any `.txt` file within a specified directory and displays its
contents on the console.

## Compilation Instructions
To compile the necessary Java classes and generate the `.class` files in the
`target/classes` directory, use the following command:

javac -d target/classes
\ src/main/java/level1/exercise4/dataClass/ListDirectoryReadTxt.java
\ src/main/java/level1/exercise4/logic/ArgumentValidatorReadTxt.java
\ src/main/java/level1/exercise4/logic/ManagementDirectoryReadTxt.java


## Execution Instructions
To execute the main class (`MainDirectoryReadTxt`), specify the classpath
(`target/classes`) and pass the directory path containing `.txt` files as an argument:

java -cp target/classes level1.exercise4.mainManager.MainDirectoryReadTxt
"src/main/java/level1/exercise4/txt"


This command will search for `.txt` files within the specified directory and display
their contents on the console.

## Example of Terminal Commands
PS C:\Users\Admin\IdeaProjects\S105javaUtils>
java -cp target/classes level1.exercise4.mainManager.MainDirectoryReadTxt
"C:\Users\Admin\Documents"

Expected output:

Mi música
Mis imágenes
Mis vídeos
PassMark
shell-lesson-data
Visual Studio 2022
WindowsPowerShell


Reading a `.txt` file:
PS C:\Users\Admin\IdeaProjects\S105javaUtils>
java -cp target/classes level1.exercise4.mainManager.MainDirectoryReadTxt
"src/main/java/level1/exercise4/txt"

Expected output:
readme.txt Terminal commands


## Notes
- Ensure the specified directory contains `.txt` files before executing the program.
- The program will search for `.txt` files in the provided directory and display their content.
- Modify the directory path argument as needed for different locations.
















