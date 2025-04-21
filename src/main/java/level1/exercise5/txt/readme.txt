# README - Serialize and Deserialize a Java Object

## Description
This program serializes a Java object into a `.ser` file and then deserializes it to
retrieve and display its data.

## Compilation Instructions
To compile the necessary Java classes and generate the `.class` files in the
`target/classes` directory, use the following command:

javac -d target/classes
\ src/main/java/level1/exercise5/classData/Person.java
\ src/main/java/level1/exercise5/mainManager/DeserializePerson.java
\ src/main/java/level1/exercise5/mainManager/MainPerson.java


## Execution Instructions

### **1. Serialize the Object**
To serialize the object, execute the following command:

java -cp target/classes level1.exercise5.mainManager.MainPerson


Expected output:
Object serialized successfully.

A file named `person.ser` will be created containing the serialized object.

### **2. Deserialize the Object**
To deserialize and retrieve the object, execute:

java -cp target/classes level1.exercise5.mainManager.DeserializePerson


Expected output:

Object deserialized successfully. Name: Carlos Age: 35


## Common Errors
- **File Not Found (`person.ser`)**: If you encounter an error like:
Error during deserialization: person.ser (The system cannot find the file specified)

Ensure that the serialization step was executed first and that `person.ser` exists in
the expected directory.

## Notes
- Make sure that the Java classes implement `Serializable` for proper serialization.
- The program serializes an object and stores it as a `.ser` file, then retrieves it via deserialization.
- Modify the file paths as needed based on your environment.
















