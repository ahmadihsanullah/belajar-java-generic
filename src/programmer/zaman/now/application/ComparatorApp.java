package programmer.zaman.now.application;

import programmer.zaman.now.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Ahmad", "Bogor"),
                new Person("Zaki", "Jasinga"),
                new Person("Budi", "Cianjur"),
        };

        Comparator<Person> comparator = new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println( Arrays.toString(people) );
    }
}
