# README - Recursive Directory Listing

## Description
This program lists the contents of a directory and its subdirectories recursively,
displaying them in alphabetical order within each level. Additionally, it indicates
whether each entry is a **directory (D)** or **file (F)** and shows the last modified
date of each item.

## Compilation Instructions
To compile the necessary Java classes and generate the `.class` files in the
`target/classes` directory, use the following command:


PS C:\Users\Admin\IdeaProjects\S105javaUtils> cd src/main/java/level1/exercise2/txt
PS C:\Users\Admin\IdeaProjects\S105javaUtils\src\main\java\level1\exercise2\txt>
echo "Terminal commands"> readme.txt

javac -d target/classes
/src/main/java/level1/exercise2/dataClass/ListDirectoryTree.java
/src/main/java/level1/exercise2/logic/ArgumentValidatorTree.java
/src/main/java/level1/exercise2/logic/ManagementDirectoryTree.java
/src/main/java/level1/exercise2/mainManager/MainDirectoryTree.java


## Execution Instructions
To execute the main class (`MainDirectoryTree`), specify the classpath (`target/classes`)
and pass the directory path as an argument:

java -cp target/classes level1.exercise2.mainManager.MainDirectoryTree src


This command will list the contents of the `src` directory recursively in
alphabetical order, indicating whether each entry is a directory or a file,
along with its last modified date.

## Example Output


[D] main - Last Modified: 08-04-2025 12:11:02
[D] java - Last Modified: 08-04-2025 12:14:09
[D] level1 - Last Modified: 08-04-2025 12:13:39
[D] exercise1 - Last Modified: 09-04-2025 10:33:26
[D] dataClass - Last Modified: 09-04-2025 20:46:53
[F] ListDirectory.java - Last Modified: 09-04-2025 20:46:53
[D] logic - Last Modified: 09-04-2025 22:11:00
[F] ArgumentValidator.java - Last Modified: 09-04-2025 22:11:00
[F] ManagementDirectory.java - Last Modified: 09-04-2025 21:38:02
[D] mainManager - Last Modified: 09-04-2025 22:12:07
[F] MainDirectory.java - Last Modified: 09-04-2025 22:12:07
[D] txt - Last Modified: 09-04-2025 23:46:51
[F] readme.txt - Last Modified: 09-04-2025 23:46:51
[D] exercise2 - Last Modified: 10-04-2025 10:41:12
[D] dataClass - Last Modified: 10-04-2025 17:44:33
[F] ListDirectoryTree.java - Last Modified: 10-04-2025 17:44:33
[D] logic - Last Modified: 10-04-2025 17:48:24
[F] ArgumentValidatorTree.java - Last Modified: 10-04-2025 10:58:41
[F] ManagementDirectoryTree.java - Last Modified: 10-04-2025 17:48:24
[D] mainManager - Last Modified: 10-04-2025 17:24:59
[F] MainDirectoryTree.java - Last Modified: 10-04-2025 17:24:59
[D] txt - Last Modified: 10-04-2025 10:43:57
[F] readme2.txt - Last Modified: 09-04-2025 23:46:51
[D] exercise3 - Last Modified: 08-04-2025 12:13:21
The directory is empty
[D] exercise4 - Last Modified: 08-04-2025 12:13:30
The directory is empty
[D] exercise5 - Last Modified: 08-04-2025 12:13:39
The directory is empty
[D] level2 - Last Modified: 08-04-2025 12:14:21
[D] exercise1 - Last Modified: 08-04-2025 12:14:21
The directory is empty
[D] example - Last Modified: 08-04-2025 12:10:58
[F] Main.java - Last Modified: 08-04-2025 12:10:58
[D] resources - Last Modified: 08-04-2025 12:11:02
The directory is empty
