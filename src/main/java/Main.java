import mall.ShoppingCart;
import mall.ShoppingCartMap;
import mall.bestbuy.Laptop;
import mall.bestbuy.SmartPhone;
import mall.bestbuy.TV;
import person.Person;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.file.*;


public class Main {
    //Class Fields
    private static final Scanner scanner = new Scanner(System.in);
//    private static final ElectronicDevices electronicdevice = new ElectronicDevices(40,"Samsung","Yes");
    private static final Laptop laptop1 = new Laptop("Dell","Latitude100", 500,"Q-Keyboard",true);
    private static final TV tv1 = new TV("Samsung", "UltraTV123", 300,true,true);
    private static final SmartPhone smartphone1 = new SmartPhone("Apple","iPhone12",700,"Verizon",true);
    private static final Path filePath = Paths.get("C:\\java-Training\\java-projects\\shopping-mall\\register.txt");
    private static Person person1 = new Person();
    //private static ShoppingCartMap shoppingCart1 = new ShoppingCartMap();
    private static HashMap<String, Integer> shoppingCartB = new HashMap<String, Integer>();
    private static List<String> shoppingCartL = new ArrayList<>();
    private static HashSet<String> shoppingCartT = new HashSet<>();

    //MAIN Method
    public static void main(String[] args) {

        //Welcome
        System.out.println("Welcome to Acme Shopping Mall!");

        //Register
        register();

        //MainManu (1-BestBuy / 2-Lowes / 3- ToysRUs
        mainMenu();

    }

    /////////////Register///////////////////////////////////////
    public static void register() {
        System.out.println("Let's get you registered");
        System.out.print("Please enter your first name: ");
            String firstName = scanner.next();
        System.out.print("Please enter your last name: ");
            String lastName = scanner.next();
        System.out.print("Please enter your age: ");
            int age = scanner.nextInt();
        System.out.print("Please enter your userID: ");
        HashSet<String> userID = new HashSet<>();
            userID.add(scanner.next());
        System.out.print("Please enter your password: ");
        String password = scanner.next();
        person1 = new Person(firstName, lastName, age,userID, password);
        //bestbuy.setVisitor(person1);


        //Create file
        //if (createdFilePath != null) {
        if (Files.exists(filePath)) {
            System.out.println("\nFile already exists.");
        } else {
            System.out.println("\nCalling the create a file method...");
            createAFile();
        }

        //Update the file with the registered person
        System.out.println("\nCalling the update a file method...");
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

    //////////////MAIN MENU///////////////////////////////////////
    //Main Menu ... to choose 1- BestBuy / 2 - Lowes / 3- ToysRUs
    public static void mainMenu() {
        while (true) {
            switch (pickStore()) {
                case 1:
                    System.out.println("You are viewing BestBuy Electronic Devices");
                    selectFromBestBuy();
                    break;
                case 2:
                    System.out.println("You are viewing Lowes Hardware");
                    selectFromLowes();
                    break;
                case 3:
                    System.out.println("You are viewing ToysRUs Toys");
                    selectFromToysrus();
                    break;
                case 4:
                    System.out.println("Thank you " + person1.getFirstName() + " for visiting the mall!");
                    System.exit(0);
                default:
                    System.out.println("Please pick between 1-4");

            }
        }
    }

    public static int pickStore() {
        System.out.println("""
        \nMAIN MENU
        Please pick a Store to view from the list below:
        1. Best Buy
        2. Lowes
        3. ToysRUs
        4. Exit
        """);
        return scanner.nextInt();
    }

///////////////// Best Buy ////////////////////////
    public static void selectFromBestBuy() {
    boolean whileCheck = true;  //to be able to break from while oop at option 4
        while (whileCheck) {
            switch (pickElectronicDevice()) {
                case 1:
                    System.out.println("You selected Laptop to add to cart");
                    // Add the laptop to shopping cart
                    shoppingCartB.put("Laptop",500);
                    System.out.println("Shopping Cart Items: " + shoppingCartB);
                    break;
                case 2:
                    System.out.println("You selected TV to add to cart");
                    // Add the TV to shopping cart
                    shoppingCartB.put("TV",300);
                    System.out.println("Shopping Cart Items: " + shoppingCartB);
                    break;
                case 3:
                    System.out.println("You selected Smart Phone to add to cart");
                    // Add the TSmart Phone to shopping cart
                    shoppingCartB.put("Smart Phone",700);
                    System.out.println("Shopping Cart Items: " + shoppingCartB);
                    break;
                case 4:
                    System.out.println("You selected to Exit to Main Menu");
                    // Exit
                    whileCheck = false;
                    break;
                default:
                    System.out.println("Please pick between 1-4");

            }
        }
    }

    public static int pickElectronicDevice() {
        System.out.println("""
        \nPlease pick an item from the list below to add to your shopping cart:
        1. Laptop (HP/Q-Keyboard/Touchscreen) for $500
        2. TV (Samsung/Has Remote/Has HDMI) for $300
        3. Smart Phone (Apple/Verizon/Has Cover) for $700
        4. Exit        
        """);
        return scanner.nextInt();
    }


    ///////////////// Lowes ////////////////////////
    public static void selectFromLowes() {
        boolean whileCheck = true;  //to be able to break from while oop at option 4
        while (whileCheck) {
            switch (pickHardware()) {
                case 1:
                    System.out.println("You selected Hammer to add to cart");
                    // Add the Hammer to shopping cart
                    shoppingCartL.add("Hammer");
                    shoppingCartL.add("$15");
                    System.out.println("Shopping Cart Items: " + shoppingCartL);
                    break;
                case 2:
                    System.out.println("You selected Screwdriver to add to cart");
                    // Add the Screwdriver to shopping cart
                    shoppingCartL.add("Screwdriver");
                    shoppingCartL.add("$5");
                    System.out.println("Shopping Cart Items: " + shoppingCartL);
                    break;
                case 3:
                    System.out.println("You selected Drill to add to cart");
                    // Add the Drill to shopping cart
                    shoppingCartL.add("Drill");
                    shoppingCartL.add("$100");
                    System.out.println("Shopping Cart Items: " + shoppingCartL);
                    break;
                case 4:
                    System.out.println("You selected to Exit to Main Menu");
                    // Exit
                    whileCheck = false;
                    break;
                default:
                    System.out.println("Please pick between 1-4");

            }
        }
    }

    public static int pickHardware() {
        System.out.println("""
        \nPlease pick a hardware item from the list below to add to your shopping cart:
        1. Hammer for $15
        2. Screwdriver for $5
        3. Drill $100
        4. Exit
        """);
        return scanner.nextInt();
    }

    ///////////////// ToysRUs ////////////////////////
    public static void selectFromToysrus() {
        boolean whileCheck = true;  //to be able to break from while oop at option 4
        while (whileCheck) {
            switch (pickToy()) {
                case 1:
                    System.out.println("You selected Lego to add to cart");
                    // Add the Lego to shopping cart
                    shoppingCartT.add("Lego - $20");
                    System.out.println("Shopping Cart Items: " + shoppingCartT);
                    break;
                case 2:
                    System.out.println("You selected Toy Car to add to cart");
                    // Add the Toy Car to shopping cart
                    shoppingCartT.add("Toy car - $5");
                    System.out.println("Shopping Cart Items: " + shoppingCartT);
                    break;
                case 3:
                    System.out.println("You selected Magnatile to add to cart");
                    // Add the Magnatile to shopping cart
                    shoppingCartT.add("Magnatile - $25");
                    System.out.println("Shopping Cart Items: " + shoppingCartT);
                    break;
                case 4:
                    System.out.println("You selected to Exit to Main Menu");
                    // Exit
                    whileCheck = false;
                    break;
                default:
                    System.out.println("Please pick between 1-4");

            }
        }
    }

    public static int pickToy() {
        System.out.println("""
        \nPlease pick a toy item from the list below to add to your shopping cart:
        1. Lego for $20
        2. Toy Car for $5
        3. Magnatile for $25
        4. Exit
        """);
        return scanner.nextInt();
    }



}
