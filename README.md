# 📂 JAVA FILE MANAGEMENT & ENCRYPTION

## 📄 PROJECT DESCRIPTION

This project involves handling directories, reading files, serializing objects, and encrypting/decrypting files using the AES encryption algorithm. It is structured in progressive levels of complexity.

### 🔹 KEY FEATURES

- ✔ List directory contents alphabetically  
- ✔ Recursively scan directory trees  
- ✔ Save file information to a `.txt` file  
- ✔ Read and display `.txt` file contents  
- ✔ Serialize and deserialize Java objects  
- ✔ Encrypt and decrypt files using AES  

---

## 💻 TECHNOLOGIES USED

- ✔ Java 17 or higher  
- ✔ Apache Commons Configuration (optional)  
- ✔ Java Properties files for configuration  
- ✔ Java Crypto APIs (`javax.crypto`, `org.apache.commons.crypto`)
- ✔ Maven

---

## 📋 REQUIREMENTS

- ✔ Eclipse, IntelliJ, or any compatible Java IDE  
- ✔ Use **relative paths** instead of absolute paths  
- ✔ Use `File.separator` for cross-platform compatibility  

---

## 🛠️ INSTALLATION & SETUP

1️⃣ Clone the repository:

```bash
git clone <https://github.com/FlavioKde/S105javaUtils.git>
2️⃣ Navigate to the project directory:

bash
Copiar
Editar
cd Java-File-Management
3️⃣ Ensure the directory structure is correct:

css
Copiar
Editar
src/main/java/
src/main/resources/
target/classes/
4️⃣ Install dependencies (if using Maven or Gradle):

bash
Copiar
Editar
# Using Maven
mvn install

# OR using Gradle
gradle build
▶️ EXECUTION INSTRUCTIONS
🔹 LEVEL 1: FILE & DIRECTORY OPERATIONS
✔ List directory contents alphabetically:

bash
Copiar
Editar
java -cp target/classes level1.exercise1.mainManager.MainDirectory "relative/path/to/directory"
✔ Recursively list directory tree:

bash
Copiar
Editar
java -cp target/classes level1.exercise2.mainManager.MainTreeDirectory "relative/path/to/directory"
✔ Save directory listing to a .txt file:

bash
Copiar
Editar
java -cp target/classes level1.exercise3.mainManager.MainSaveDirectory "relative/path/to/directory"
✔ Read and display a .txt file:

bash
Copiar
Editar
java -cp target/classes level1.exercise4.mainManager.MainReadTxt "relative/path/to/file.txt"
✔ Serialize and deserialize a Java object:

bash
Copiar
Editar
java -cp target/classes level1.exercise5.mainManager.MainSerialization
🔹 LEVEL 2: CONFIGURATION-BASED EXECUTION
✔ Execute using a .properties config file:

bash
Copiar
Editar
java -cp target/classes level2.exercise1.mainManager.MainConfig "config.properties"
✔ Sample config.properties file:

ini
Copiar
Editar
directory.to.read=src/main/java
output.file.name=directoryList.txt
output.file.directory=src/main/java/level2/exercise1/txt
🔹 LEVEL 3: FILE ENCRYPTION & DECRYPTION
✔ Encrypt and decrypt a file using AES encryption:

bash
Copiar
Editar
java -cp target/classes level3.exercise1.mainManager.MainEncryptDecrypt
✔ Ensure input files exist before execution:

bash
Copiar
Editar
src/main/java/level2/exercise1/txt/readme.txt
✔ Output files generated:

python
Copiar
Editar
archivo_encrypted.aes
archivo_decrypted.txt
key.bin
iv.bin
🌐 DEPLOYMENT
✔ Prepare your environment before running

✔ Ensure all input files are present in the correct locations

✔ Store encryption keys securely and never hardcode them

🤝 CONTRIBUTIONS
Contributions are welcome! Follow these steps:

1️⃣ Fork the repository
2️⃣ Create a new branch:

bash
Copiar
Editar
git checkout -b feature/NewFunctionality
3️⃣ Make your changes and commit them:

bash
Copiar
Editar
git commit -m "Add new functionality"
4️⃣ Push your changes:

bash
Copiar
Editar
git push origin feature/NewFunctionality
5️⃣ Submit a pull request

📌 NOTES
✔ Always ensure the input file exists before encryption

✔ Test your code thoroughly before pushing

✔ Follow GitHub contribution best practices

🚀 HAPPY CODING! ✨

