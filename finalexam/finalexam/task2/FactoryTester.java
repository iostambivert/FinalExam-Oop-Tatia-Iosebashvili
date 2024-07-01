package finalexam.task2;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory paperFactory = new PaperFactory();

        Person employee1 = new Person("Tatia", "Iosebashvili", "12345");
        Person employee2 = new Person("Nikoloz", "Eriashvili", "67890");
        Person employee3 = new Person("Giorgi", "Lebanidze", "54321");

        paperFactory.addPerson(employee1);
        paperFactory.addPerson(employee2);
        paperFactory.addPerson(employee3);

        System.out.println("All staff:");
        paperFactory.printAllStaff();

        System.out.println("\nFinding employee with personal number '67890':");
        Person foundEmployee = paperFactory.findPersonByPersonalNumber("67890");
        if (foundEmployee != null) {
            System.out.println("Found: " + foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting employee 'Jane Smith':");
        boolean isDeleted = paperFactory.deletePerson(employee2);
        if (isDeleted) {
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nAll staff after deletion:");
        paperFactory.printAllStaff();
    }
}
