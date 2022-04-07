import person.Person;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;

import java.nio.file.*;


public class ShoppingMallMain {
    //Class Fields
//    private static final ShoppingMall shoppingMall = new ShoppingMall("BestBuy Arlington", "123 Wilson Blvd.");
    private static final Scanner scanner = new Scanner(System.in);
//    private static final ElectronicDevices electronicdevice = new ElectronicDevices(40,"Samsung","Yes");
//    private static final Laptop laptop1 = new Laptop("Q-Keyboard",true,"Yes");
//    private static final TV tv1 = new TV(true,true);
//    private static final SmartPhone smartphone1 = new SmartPhone("Verizon","Yes",true);
    private static final Path filePath = Paths.get("C:\\java-Training\\java-projects\\shopping-mall\\register.txt");


    //MAIN Method
    public static void main(String[] args) {

        //Welcome
        System.out.println("Welcome to Acme Shopping Mall!");

        //Register
        register();



    }


    //Register
    public static void register() {
        System.out.println("Let's get you registered");
        System.out.println("Please enter your first name: ");
            String firstName = scanner.next();
        System.out.println("Please enter your last name: ");
            String lastName = scanner.next();
        System.out.println("Please enter your age: ");
            int age = scanner.nextInt();
        System.out.println("Please enter your userID: ");
        HashSet<String> userID = new HashSet<>();
            userID.add(scanner.next());
        System.out.println("Please enter your password: ");
        String password = scanner.next();
        Person person1 = new Person(firstName, lastName, age,userID, password);
        //bestbuy.setVisitor(person1);


        //Create file
        //if (createdFilePath != null) {
        if (Files.exists(filePath)) {
            System.out.println("File already exists");
        } else {
            System.out.println("\nCalling the create a file method.");
            createAFile();
        }

        //Update the file with the registered person
        System.out.println("\nCalling the update a file method.");
        //writeToAFile(firstName,lastName,age,userID,password);
        writeToAFile(person1);
    }



    //Creating file
    public static void createAFile() {
        try {
            Files.createFile(filePath);
            System.out.println("File created: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Write to a file
    public static void writeToAFile(Person person1)  {
        try {
            Files.writeString(filePath, person1.getFirstName() + "\n");
            Files.writeString(filePath, person1.getLastName() + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, String.valueOf(person1.getAge()) + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, person1.getUsedID() + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, person1.getPassword() + "\n", StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
