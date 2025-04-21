📂 Java File Management & Encryption - README
📄 Project Description
This project involves handling directories, reading files, serializing objects, and encrypting files using AES encryption. It follows structured levels of execution with increasing complexity.

🔹 Key Features:
✔ List directory contents alphabetically ✔ Recursively scan directory trees ✔ Store file information in a TXT file ✔ Read TXT file contents and display them ✔ Serialize and deserialize Java objects ✔ Encrypt and decrypt files using AES encryption

💻 Technologies Used
✔ Java 17+ ✔ Apache Commons Configuration (optional) ✔ Java Properties files for configuration ✔ Java Crypto APIs (javax.crypto, org.apache.commons.crypto)

📋 Requirements
✔ Eclipse or IntelliJ for development ✔ Relative paths instead of absolute paths ✔ Use File.separator for compatibility across operating systems

🛠️ Installation & Setup
1️⃣ Clone the repository:
bash
git clone <repository-url>
2️⃣ Navigate to the project directory:
bash
cd Java-File-Management
3️⃣ Ensure the correct directory structure:
text
src/main/java/
src/main/resources/
target/classes/
4️⃣ Install dependencies (if using Maven or Gradle):
bash
mvn install
# OR
gradle build
▶️ Execution Instructions
Each exercise corresponds to a different level. Execute them as described below:

🔹 Level 1: File & Directory Operations
✔ List a directory alphabetically:

bash
java -cp target/classes level1.exercise1.mainManager.MainDirectory "relative/path/to/directory"
✔ Recursively list directory tree:

bash
java -cp target/classes level1.exercise2.mainManager.MainTreeDirectory "relative/path/to/directory"
✔ Save directory listing to TXT file:

bash
java -cp target/classes level1.exercise3.mainManager.MainSaveDirectory "relative/path/to/directory"
✔ Read and display a TXT file's contents:

bash
java -cp target/classes level1.exercise4.mainManager.MainReadTxt "relative/path/to/file.txt"
✔ Serialize and deserialize a Java object:

bash
java -cp target/classes level1.exercise5.mainManager.MainSerialization
🔹 Level 2: Configuration-Based Execution
✔ Execute file listing using a configuration file:

bash
java -cp target/classes level2.exercise1.mainManager.MainConfig "config.properties"
✔ Sample config.properties file:

text
directory.to.read=src/main/java
output.file.name=directoryList.txt
output.file.directory=src/main/java/level2/exercise1/txt
🔹 Level 3: File Encryption & Decryption
✔ Encrypt a file using AES encryption:

bash
java -cp target/classes level3.exercise1.mainManager.MainEncryptDecrypt
✔ Ensure files exist before execution:

text
src/main/java/level2/exercise1/txt/readme.txt
✔ Generated encrypted & decrypted files:

text
archivo_encrypted.aes
archivo_decrypted.txt
key.bin
iv.bin
🌐 Deployment
✔ Prepare the environment before execution ✔ Ensure necessary files exist in the expected paths ✔ Keep encryption keys securely stored

🤝 Contributions
Contributions are welcome! Follow these steps to contribute:

1️⃣ Fork the repository
2️⃣ Create a new branch:
bash
git checkout -b feature/NewFunctionality
3️⃣ Make changes and commit:
bash
git commit -m "Add new functionality"
4️⃣ Push changes to your branch:
bash
git push origin feature/NewFunctionality
5️⃣ Submit a pull request
📌 Notes:
✔ Ensure the input file exists before running encryption ✔ Always test changes before pushing to production ✔ Follow GitHub best practices when submitting contributions

🚀 Happy coding! ✨





📌 Notes:

✔ Ensure the input file exists before running encryption. ✔ Always test changes before pushing to production. ✔ Follow GitHub best practices when submitting contributions.

🚀 Happy coding! ✨
