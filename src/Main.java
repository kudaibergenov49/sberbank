import task2.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("a","b",5);
        Person person2 = new Person("a","b",5);
        Person person3 = new Person("a","v",5);
        Person person4 = new Person("c","b",5);
        Person person5 = new Person("a","b",5);
        Person person6 = new Person("a","b",5);
        System.out.println(person.equals(person2));
        System.out.println(person.equals(person3));
        System.out.println(person.equals(person4));
    }
}
