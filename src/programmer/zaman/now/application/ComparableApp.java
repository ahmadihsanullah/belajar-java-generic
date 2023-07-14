package programmer.zaman.now.application;

import programmer.zaman.now.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Ahmad", "Bogor"),
                new Person("Zaki", "Jasinga"),
                new Person("Budi", "Cianjur"),
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
