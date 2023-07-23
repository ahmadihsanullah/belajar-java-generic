package ComparatorAndComparable;

import java.util.*;

public class ComparatorApp {
    public static class Student implements Comparable<Student> {
        int age;
        String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            return this.getAge() > o.getAge() ? 1 : -1;
        }
    }

    public static void main(String[] args) {

        //anonymus function
        Comparator<Student> comparator = ( o1,  o2) -> o1.getAge() > o2.getAge() ? 1 : -1;

        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(28, "Ahmad"));
        studs.add(new Student(20, "Bani"));
        studs.add(new Student(38, "Ihsan"));
        studs.add(new Student(21, "Nul"));

        Collections.sort(studs);
        for(Student student : studs){
            System.out.println(student);
        }

    }
}
