package person;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Adam");
        Person person2 = new Person("Adam", "Ingram",41);
        System.out.printf("Welcome %s to Object-Oriented Programming!",person2.getFirstName());

        Set userID = new HashSet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Name:");
        userID.add(scanner.next());

//        userID.add("user1");
//        userID.add("user2");
//        userID.add("user2");

        System.out.println(userID);


    }

}
