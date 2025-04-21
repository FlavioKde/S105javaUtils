package level1.exercise5.mainManager;

import level1.exercise5.classData.Person;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class MainPerson {

    public static void main(String[] args) {
        Person person = new Person("Carlos",35);

        try
            ( FileOutputStream archive = new FileOutputStream("person.ser");
              ObjectOutputStream exit = new ObjectOutputStream(archive)){
                exit.writeObject(person);
            System.out.println("object serialized successfully");
            }catch (IOException e){
            System.out.println("Erro: "+e.getMessage());

        }
    }
}
