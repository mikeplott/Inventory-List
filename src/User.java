import java.util.ArrayList;

/**
 * Created by michaelplott on 9/19/16.
 */
public class User {

    String name;
    String password;
    ArrayList<Item> items;

    void displayList(User user) {
        for(int i = 0; i < user.items.size(); i++) {
            System.out.println("["+ (i+1) +"]" + " " + user.items.get(i).itemName +" " + user.items.get(i).itemQuantity);
        }
    }
}
