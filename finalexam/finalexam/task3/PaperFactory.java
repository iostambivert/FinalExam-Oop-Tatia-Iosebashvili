package finalexam.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();
    private final String saveFilePath;

    // Constructor that sets the file path
    public PaperFactory() {
        this.saveFilePath = "finalexam" + File.separator + "task3" + File.separator + "staff.txt";
    }

    // Method to add a person to the staff list
    public void addPerson(Person p) {
        if (p == null) {
            throw new IllegalArgumentException("Person cannot be null.");
        }
        staff.add(p);
    }

    // Method to delete a person from the staff list
    public boolean deletePerson(Person p) {
        return staff.remove(p);
    }

    // Method to find a person by their personal number
    public Person findPersonByPersonalNumber(String personalNumber) {
        for (Person person : staff) {
            if (person.getPersonalNumber().equals(personalNumber)) {
                return person;
            }
        }
        return null;
    }

    // Method to list all persons in the staff
    public List<Person> listAllStaff() {
        return new ArrayList<>(staff);
    }

    // Method to save the staff list to a file
    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(saveFilePath)))) {
            for (Person person : staff) {
                writer.println(person.getName() + "," + person.getSurname() + "," + person.getPersonalNumber());
            }
            System.out.println("Staff list saved to " + saveFilePath);
        } catch (IOException e) {
            System.err.println("Error saving to file: " + e.getMessage());
        }
    }

    // Method to load the staff list from a file
    public void loadFromFile() {
        staff.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(saveFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    String surname = parts[1];
                    String personalNumber = parts[2];
                    staff.add(new Person(name, surname, personalNumber));
                }
            }
            System.out.println("Factory loaded from file:");
            System.out.println(this);
        } catch (IOException e) {
            System.err.println("Error loading from file: " + e.getMessage());
        }
    }

    // Overriding the toString() method to provide a string representation of the PaperFactory
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaperFactory Staff:\n");
        for (Person person : staff) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }
}
