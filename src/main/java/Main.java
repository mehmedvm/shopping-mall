import mall.bestbuy.ElectronicDevice;
import mall.bestbuy.Laptop;
import mall.bestbuy.SmartPhone;
import mall.bestbuy.TV;

import mall.interfaces.IPay;
import mall.lowes.Drill;
import mall.lowes.Hammer;
import mall.lowes.Hardware;
import mall.lowes.Screwdriver;

import mall.toys_r_us.Lego;
import mall.toys_r_us.Magnatile;
import mall.toys_r_us.Toy;
import mall.toys_r_us.ToyCar;
import person.Person;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.file.*;


public class Main {
    ////Class Fields
    private static final Scanner scanner = new Scanner(System.in);
    //private static final ElectronicDevice electronicdevice1 = new ElectronicDevice();
    private static final Path filePath = Paths.get("C:\\java-Training\\java-projects\\shopping-mall\\shopping-mall\\src\\main\\resources\\register.txt");
    private static Person person1 = new Person();
    //private static ShoppingCartMap shoppingCart1 = new ShoppingCartMap();
    private static HashMap<String, Integer> shoppingCartB = new HashMap<String, Integer>();
    private static List<String> shoppingCartL = new ArrayList<>();
    private static HashSet<String> shoppingCartT = new HashSet<>();

    // Electronic Devices:
    private static final Laptop laptop1 = new Laptop("Laptop","Dell","Latitude100", 500,"Q-Keyboard",true);
    private static final TV tv1 = new TV("TV","Samsung", "UltraTV123", 300,true,true);
    private static final SmartPhone smartphone1 = new SmartPhone("Smart Phone","Apple","iPhone12",700,"Verizon",true);
    //Hardware:
    private static final Hammer hammer1 = new Hammer("Hammer", "Stanley", "H1", 15, "Brown", 10);
    private static final Screwdriver screwdriver1 = new Screwdriver("Screwdriver", "Stanley", "S1", 5,"phillips", 15);
    private static final Drill drill1 = new Drill("Drill", "Stanley", "D1", 100, 20, "Green");
    //Toys:
    private static final Lego lego1 = new Lego("Lego","Lego", "Lego", 20, "5+", 50);
    private static final ToyCar toycar1 = new ToyCar("Toy Car","Fischer", "TC1",5,4,"White",10);
    private static final Magnatile magnatile1 = new Magnatile("Magnatile", "Magnatile", "MT1", 25, "7+", "Blue", 33);



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

        //Read from the file
        System.out.println("\nCalling the read a file method...");
        readFromAFile(person1);

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
            //Files.writeString(filePath, person1.getFirstName() + "\n");
            Files.writeString(filePath, person1.getFirstName() + "," + "\n");
            Files.writeString(filePath, person1.getLastName() + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, String.valueOf(person1.getAge()) + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, person1.getUsedID() + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, person1.getPassword() + "," + "\n", StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Read from a file
    public static void readFromAFile(Person person1) {
    try {
        String tempFile = Files.readString(filePath);
        String[] tempArray = tempFile.split(",");
        System.out.println("File created for: " + tempArray[0]);
        System.out.println("User name: " + tempArray[3]);

    }
    catch (Exception e) {
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
                    // Add the laptop to shopping cart that is HashMap
                    shoppingCartB.put(laptop1.getName(),laptop1.getPrice());
                    System.out.println("Shopping Cart Items: " + shoppingCartB);
                    break;
                case 2:
                    System.out.println("You selected TV to add to cart");
                    // Add the TV to shopping cart
                    shoppingCartB.put(tv1.getName(),tv1.getPrice());
                    System.out.println("Shopping Cart Items: " + shoppingCartB);
                    break;
                case 3:
                    System.out.println("You selected Smart Phone to add to cart");
                    // Add the Smart Phone to shopping cart
                    shoppingCartB.put(smartphone1.getName(),smartphone1.getPrice());
                    System.out.println("Shopping Cart Items: " + shoppingCartB);
                    break;
                case 4:
                    System.out.println("You selected to go to shopping cart");
                    //List shopping cart items and with payment option
                    System.out.println("Shopping Cart Items: " + shoppingCartB);
                    IPay ipayBestBuy = new ElectronicDevice();
                    ipayBestBuy.pay();
                    scanner.next();
                    shoppingCartB.clear();
                    break;

                    case 5:
                    System.out.println("You selected to Exit to Main Menu");
                    // Exit
                    whileCheck = false;
                    break;
                default:
                    System.out.println("Please pick between 1-5");

            }
        }
    }

    public static int pickElectronicDevice() {
        System.out.println("""
        \nPlease pick an item from the list below to add to your shopping cart:
        1. Laptop (HP/Q-Keyboard/Touchscreen) for $500
        2. TV (Samsung/Has Remote/Has HDMI) for $300
        3. Smart Phone (Apple/Verizon/Has Cover) for $700
        4. Pay the shopping cart items
        5. Exit
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
                    shoppingCartL.add(hammer1.getName());
                    shoppingCartL.add(String.valueOf(hammer1.getPrice()));
                    System.out.println("Shopping Cart Items: " + shoppingCartL);
                    break;
                case 2:
                    System.out.println("You selected Screwdriver to add to cart");
                    // Add the Screwdriver to shopping cart
                    shoppingCartL.add(screwdriver1.getName());
                    shoppingCartL.add(String.valueOf(screwdriver1.getPrice()));
                    System.out.println("Shopping Cart Items: " + shoppingCartL);
                    break;
                case 3:
                    System.out.println("You selected Drill to add to cart");
                    // Add the Drill to shopping cart
                    shoppingCartL.add(drill1.getName());
                    shoppingCartL.add(String.valueOf(drill1.getPrice()));
                    System.out.println("Shopping Cart Items: " + shoppingCartL);
                    break;
                case 4:
                    System.out.println("You selected to go to shopping cart");
                    //List shopping cart items and with payment option
                    System.out.println("Shopping Cart Items: " + shoppingCartL);
                    IPay ipayLowes = new Hardware();
                    ipayLowes.pay();
                    scanner.next();
                    shoppingCartL.clear();
                    break;
                case 5:
                    System.out.println("You selected to Exit to Main Menu");
                    // Exit
                    whileCheck = false;
                    break;
                default:
                    System.out.println("Please pick between 1-5");

            }
        }
    }

    public static int pickHardware() {
        System.out.println("""
        \nPlease pick a hardware item from the list below to add to your shopping cart:
        1. Hammer for $15
        2. Screwdriver for $5
        3. Drill $100
        4. Pay the shopping cart items
        5. Exit
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
                    shoppingCartT.add(lego1.getName() + ": $ " + String.valueOf(lego1.getPrice()));
                    System.out.println("Shopping Cart Items: " + shoppingCartT);
                    break;
                case 2:
                    System.out.println("You selected Toy Car to add to cart");
                    // Add the Toy Car to shopping cart
                    shoppingCartT.add(toycar1.getName() + ": $ " + String.valueOf(toycar1.getPrice()));
                    System.out.println("Shopping Cart Items: " + shoppingCartT);
                    break;
                case 3:
                    System.out.println("You selected Magnatile to add to cart");
                    // Add the Magnatile to shopping cart
                    shoppingCartT.add(magnatile1.getName() + ": $ " + String.valueOf(magnatile1.getPrice()));
                    System.out.println("Shopping Cart Items: " + shoppingCartT);
                    break;
                case 4:
                    System.out.println("You selected to go to shopping cart");
                    //List shopping cart items and with payment option
                    System.out.println("Shopping Cart Items: " + shoppingCartT);
                    IPay ipayToysrus = new Toy();
                    ipayToysrus.pay();
                    scanner.next();
                    shoppingCartT.clear();
                    break;
                case 5:
                    System.out.println("You selected to Exit to Main Menu");
                    // Exit
                    whileCheck = false;
                    break;
                default:
                    System.out.println("Please pick between 1-5");

            }
        }
    }

    public static int pickToy() {
        System.out.println("""
        \nPlease pick a toy item from the list below to add to your shopping cart:
        1. Lego for $20
        2. Toy Car for $5
        3. Magnatile for $25
        4. Pay the shopping cart items
        5. Exit
        """);
        return scanner.nextInt();
    }


}
