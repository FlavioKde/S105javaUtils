# README - Save Directory Listing to a TXT File

## Description
This program lists the contents of a directory in alphabetical order and saves the result
in a `.txt` file instead of displaying it on the screen.

## Compilation Instructions
To compile the necessary Java classes and generate the `.class` files in the
`target/classes` directory, use the following command:

PS C:\Users\Admin\IdeaProjects\S105javaUtils>
javac -d target/classes src/main/java/level1/exercise3/dataClass/ListDirectoryWriteTxt.java
src/main/java/level1/exercise3/logic/ArgumentValidatorWriteTxt.java
src/main/java/level1/exercise3/logic/ManagementDirectoryWriteTxt.java
src/main/java/level1/exercise3/logic/TxtWriterDirectory.java
src/main/java/level1/exercise3/mainManager/MainDirectoryWriteTxt.java


## Execution Instructions
To execute the main class (`MainDirectoryWriteTxt`), specify the classpath
(`target/classes`) and pass the directory path as an argument:

PS C:\Users\Admin\IdeaProjects\S105javaUtils>
java -cp target/classes level1.exercise2.mainManager.MainDirectoryTree src


This command will list the contents of the `src/main/java` directory in
alphabetical order and save the result in a `.txt` file.

## Example of Terminal Commands

PS C:\Users\Admin\IdeaProjects\S105javaUtils> cd src/main/java/level1/exercise3/txt
PS C:\Users\Admin\IdeaProjects\S105javaUtils\src\main\java\level1\exercise3\txt>
echo "Terminal commands"> readme.txt


## Notes
- Ensure the specified directory exists and is accessible.
- The program will save the output to a `.txt` file instead of displaying it on the screen.
- Modify the directory path argument as needed for different locations.




