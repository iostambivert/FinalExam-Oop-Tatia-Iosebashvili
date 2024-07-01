package finalexam.task3;


import java.io.IOException;

public class FactoryTester {
    public static void main(String[] args) {

        PaperFactory factory = new PaperFactory();

        // Add some people to the factory
        factory.addPerson(new Person("Tatia", "Iosebashvili", "12345"));
        factory.addPerson(new Person("Nikoloz", "Eriashvili", "67890"));
        factory.addPerson(new Person("Giorgi", "Lebanidze", "54321"));

        System.out.println("Initial staff list:");
        System.out.println(factory);


        factory.saveToFile();

        factory = new PaperFactory();
        System.out.println("\nFactory after clearing:");
        System.out.println(factory);

        factory.loadFromFile();
    }
}
