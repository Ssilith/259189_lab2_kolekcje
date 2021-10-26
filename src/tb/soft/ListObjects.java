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

    static void removeArrayElement(int index){
        arrayList.remove(index);
    }

    static void removeLinkedElement(int index){
        linkedList.remove(index);
    }

    static void displayArrayList(){
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i).getFirstName() + " " + arrayList.get(i).getLastName() + " " + arrayList.get(i).getBirthYear() + " " + arrayList.get(i).getJob());
        }
    }

    static void displayLinkedList(){
        for(int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i).getFirstName() + " " + linkedList.get(i).getLastName() + " " + linkedList.get(i).getBirthYear() + " " + linkedList.get(i).getJob());
        }
    }
}
