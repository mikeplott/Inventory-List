import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by michaelplott on 9/19/16.
 */
public class InventoryList {

    static HashMap<String, User> users = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Please enter your username");
        String username = scanner.nextLine();
        if (users.get(username) == null) {
            System.out.println();
            System.out.println("User does not exist, would you like to create an account? Press y or n");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("/exit")) {
                System.exit(0);
            }
            if (!choice.equalsIgnoreCase("y")) {
                System.out.println("returning to user login");
                main(args);
            }
            System.out.println();
            System.out.println("Please enter a password");
            String pass = scanner.nextLine();
            User user = new User();
            user.name = username;
            user.password = pass;
            user.items = new ArrayList<Item>();
            users.put(username, user);
            }
            if (users.get(username) != null) {
                    System.out.println();
                    System.out.println("Please enter your password");
                    String userPass = scanner.nextLine();
            if (!userPass.equalsIgnoreCase(users.get(username).password)) {
                System.out.println();
                System.out.println("Invalid password, returning you to user login");
                main(args);
            }
            if (userPass.equalsIgnoreCase(users.get(username).password)) {
                User user = users.get(username);
                boolean keepRunning = true;
                System.out.println();
                System.out.println("Welcome " + username);
                    while (keepRunning) {
                        System.out.println();
                        System.out.println("1: Create a new item");
                        System.out.println("2: Remove an item");
                        System.out.println("3: Update item quantity");
                        System.out.println("4: Display inventory");
                        System.out.println("5: Log out");
                        String userChoice = scanner.nextLine();
                        boolean makeSelection = true;
                        while (makeSelection) {
                            if (userChoice.equalsIgnoreCase("1")) {
                                System.out.println();
                                System.out.println("Please enter name of the item");
                                String userItem = scanner.nextLine();
                                System.out.println();
                                System.out.println("How many?");
                                String userItemQuantity = scanner.nextLine();
                                Item item = new Item(userItem, Integer.parseInt(userItemQuantity));
                                item.itemName = userItem;
                                item.itemQuantity = Integer.parseInt(userItemQuantity);
                                user.items.add(item);
                                makeSelection = false;
                            } else if (userChoice.equalsIgnoreCase("2")) {
                                System.out.println();
                                user.displayList(user);
                                System.out.println();
                                System.out.println("What item would you like to remove? Enter a number");
                                String itemIndex = scanner.nextLine();
                                System.out.println();
                                System.out.println("Are you sure you would like to remove the item? Press y or n");
                                String userChoice2 = scanner.nextLine();
                                if (userChoice2.equalsIgnoreCase("y")) {
                                    user.items.remove(Integer.parseInt(itemIndex) - 1);
                                    makeSelection = false;
                                } else {
                                    makeSelection = false;
                                }
                            } else if (userChoice.equalsIgnoreCase("3")) {
                                System.out.println();
                                user.displayList(user);
                                {
                                }
                                System.out.println("What item would you like to update? Enter a number");
                                String itemIndex2 = scanner.nextLine();
                                Item currentItem = user.items.get(Integer.parseInt(itemIndex2) - 1);
                                System.out.println();
                                System.out.println("What would you like the quantity to be?");
                                System.out.println();
                                String userItem3 = scanner.nextLine();
                                currentItem.itemQuantity = Integer.parseInt(userItem3);
                                user.displayList(user);
                                makeSelection = false;
                            } else if (userChoice.equalsIgnoreCase("4")) {
                                System.out.println();
                                user.displayList(user);
                                {
                                    makeSelection = false;
                                }
                            } else if (userChoice.equalsIgnoreCase("5")) {
                                main(args);
                            } else if (userChoice.equalsIgnoreCase("/exit")) {
                                System.exit(0);
                            } else {
                                System.out.println("Invalid entry");
                                makeSelection = false;
                            }
                        }
                    }
                }
            }
            else {
                System.out.println("Invalid password, returning you to user login");
                main(args);
        }
    }
}



