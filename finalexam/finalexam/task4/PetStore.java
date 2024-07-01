package finalexam.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PetStore implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<Pet> pets;

    public PetStore(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
        this.pets = new ArrayList<>();
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public boolean removePet(String name, String type) {
        Iterator<Pet> iterator = pets.iterator();
        while (iterator.hasNext()) {
            Pet pet = iterator.next();
            if (pet.getName().equals(name) && pet.getType().equals(type)) {
                iterator.remove();
                return true; // Pet found and removed
            }
        }
        return false; // Pet not found
    }

    @Override
    public String toString() {
        return "PetStore{address='" + address + "', vatNumber='" + vatNumber + "', pets=" + pets + '}';
    }
}
