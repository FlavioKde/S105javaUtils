📂 Java File Encryption & Decryption - Command Line Instructions ====================================================

This project encrypts and decrypts .txt files using AES encryption. It generates a key and initialization vector (IV) and saves them for secure decryption.

✔ Requirements:

Java 17+ (or compatible version)

Simple Java setup (no Maven required)

Directory: src/main/java/level3/exercise1/

🛠️ Compilation Steps (From Project Root)

1️⃣ Open a terminal or command prompt

2️⃣ Compile all Java files and output them to the target/classes directory:

bash
javac -d target/classes src/main/java/level3/exercise1/dataClass/EncryptDecrypt.java src/main/java/level3/exercise1/mainManager/MainEncryptDecrypt.java
🧪 Run the Encryption & Decryption Process

3️⃣ Run the main class to encrypt readme.txt (ensure file exists in correct path):

bash
java -cp target/classes level3.exercise1.mainManager.MainEncryptDecrypt
📁 File Handling

This program works with the following files:

🔹 Input file to encrypt:

text
src/main/java/level2/exercise1/txt/readme.txt
🔹 Generated encrypted file:

text
file_encrypted.aes
🔹 Decrypted file (should match original text):

text
file_decrypted.txt
🔹 Key file (stores AES key):

text
key.bin
🔹 IV file (stores encryption initialization vector):

text
iv.bin
📌 Notes:

✔ Ensure the input file exists before running encryption. ✔ The program will generate the key and IV automatically and save them. ✔ Make sure the decryption works by comparing archivo_decrypted.txt with the original file.

Enjoy encrypting & decrypting! 😄🚀