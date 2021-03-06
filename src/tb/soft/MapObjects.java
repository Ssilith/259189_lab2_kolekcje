package tb.soft;

import java.util.*;

public class MapObjects {
    static Map<Person, Integer> hashMap = new HashMap<>();
    static Map<Person, Integer> treeMap = new TreeMap<>();

    static void addHashMElement(Person person){
        hashMap.put(person, null);
    }

    static void addTreeMElement(Person person){
        treeMap.put(person, null);
    }

    static void removeHashMElement(String name, String lastname, int dateofbirth){

        for(Person person : hashMap.keySet()){
            if(person.getFirstName().equals(name) && person.getLastName().equals(lastname) && person.getBirthYear() == dateofbirth)
                hashMap.remove(person);
            else
                System.out.println("Nie istnieje obiekt o podanych parametrach");
        }
    }

    static void removeTreeMElement(String name, String lastname, int dateofbirth){
        for(Person person : treeMap.keySet()){
            if(person.getFirstName().equals(name) && person.getLastName().equals(lastname) && person.getBirthYear() == dateofbirth)
                treeMap.remove(person);
            else
                System.out.println("Nie istnieje obiekt o podanych parametrach");
        }
    }

    static void displayHashMList(){
        for(Person person : hashMap.keySet()){
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getBirthYear() + " " + person.getJob());
        }
    }

    static void displayTreeMList(){
        for(Person person : treeMap.keySet()){
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getBirthYear() + " " + person.getJob());
        }
    }
}