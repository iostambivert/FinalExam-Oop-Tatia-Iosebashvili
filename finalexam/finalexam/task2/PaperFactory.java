package finalexam.task2;

import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    public void addPerson(Person p) {
        staff.add(p);
    }

    public boolean deletePerson(Person p) {
        return staff.remove(p);

    }

    public List<Person> getStaff() {
        return new ArrayList<>(staff); // Return a copy of the list to avoid external modification
    }

    public Person findPersonByPersonalNumber(String personalNumber) {
        for (Person person : staff) {
            if (person.getPersonalNumber().equals(personalNumber)) {
                return person;
            }
        }
        return null;
    }

    public void printAllStaff() {
        for (Person person : staff) {
            System.out.println(person);
        }
    }

    @Override
    public String toString() {
        return "PaperFactory{" +
                "staff=" + staff +
                '}';
    }

}
