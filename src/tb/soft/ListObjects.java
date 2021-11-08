package tb.soft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListObjects {

    static List<Person> arrayList = new ArrayList<>();
    static List<Person> linkedList = new LinkedList<>();

    static void addArrayElement(Person person){
        arrayList.add(person);
    }

    static void addLinkedElement(Person person){
        linkedList.add(person);
    }

    static void removeArrayElement(Person person){
        arrayList.remove(person);
    }

    static void removeLinkedElement(int index){
        linkedList.remove(index);
    }

    static void displayArrayList(){
        for (Person person : arrayList) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getBirthYear() + " " + person.getJob());
        }
    }

    static void displayLinkedList(){
        for (Person person : linkedList) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getBirthYear() + " " + person.getJob());
        }
    }
}
