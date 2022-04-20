package person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Person {
    //Fields
    private String firstName;
    private String lastName;
    private int age;
    private HashSet<String> usedID;
    private String password;

    //Default Constructor
    public Person() {
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    //Parametirized Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, HashSet<String> usedID, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.usedID = usedID;
        this.password = password;
    }


    //Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HashSet<String> getUsedID() {
        return usedID;
    }

    public void setUsedID(HashSet<String> usedID) {
        this.usedID = usedID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //To String
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", usedID=" + usedID +
                '}';
    }


}
