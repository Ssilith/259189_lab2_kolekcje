package tb.soft;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetObjects{

    static Set<Person> hashSet = new HashSet<>();
    static Set<Person> treeSet = new TreeSet<>();

    static void addHashSElement(Person person){
        hashSet.add(person);
    }

    static void addTreeSElement(Person person){
        treeSet.add(person);
    }

    static void removeHashSElement(String name, String lastname, int dateofbirth){
        for(Person person : hashSet){
            if(person.getFirstName().equals(name) && person.getLastName().equals(lastname) && person.getBirthYear() == dateofbirth)
                hashSet.remove(person);
        }
    }

    static void removeTreeSElement(String name, String lastname, int dateofbirth){
        for(Person person : treeSet){
            if(person.getFirstName().equals(name) && person.getLastName().equals(lastname) && person.getBirthYear() == dateofbirth)
                treeSet.remove(person);
        }
    }

    static void displayHashSList(){
        for(Person person : hashSet){
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getBirthYear() + " " + person.getJob());
        }
    }

    static void displayTreeSList(){
        for(Person person : treeSet){
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getBirthYear() + " " + person.getJob());
        }
    }
}
