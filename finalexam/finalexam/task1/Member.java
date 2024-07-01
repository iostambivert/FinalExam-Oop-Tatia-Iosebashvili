package finalexam.task1;

public class Member {
    private String name;
    private int age;
    private String membershipId;

    // Constructor
    public Member(String name, int age, String membershipId) {
        this.name = name;
        this.age = age;
        this.membershipId = membershipId;
    }


    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    // Method to display member information
    public void displayInfo() {
        System.out.println("Member Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership ID: " + membershipId);
    }

    // Method to check membership status
    public boolean isMembershipActive() {
        // Assume some logic to determine if the membership is active
        // For simplicity, return true
        return true;
    }
}

