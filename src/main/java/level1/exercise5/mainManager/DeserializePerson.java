package level1.exercise5.mainManager;

import level1.exercise5.classData.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePerson {

    public static void main(String[] args) {
        try(FileInputStream archiveInput = new FileInputStream("person.ser");
            ObjectInputStream entry = new ObjectInputStream(archiveInput)){

            Person deserializedPerson = (Person) entry.readObject();
            System.out.println("Object deserialized successfully.");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error during deserialization: "+e.getMessage());
        }
    }
}
