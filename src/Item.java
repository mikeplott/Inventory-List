/**
 * Created by michaelplott on 9/19/16.
 */
public class Item {

    String itemName;
    String category;
    int itemQuantity;

    Item () {

    }

    public Item(String itemName, String category ,int itemQuantity) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.category = category;
    }

    static Item createItem (String userItem) {
        Item item2;
        if (userItem.equalsIgnoreCase("bow") ||
                userItem.equalsIgnoreCase("gun") ||
                userItem.equalsIgnoreCase("Crossbow")) {
            System.out.println("How many?");
            int myQuantity = Integer.parseInt(InventoryList.scanner.nextLine());
            String myCategory = "Ranged";
            item2 = new Ranged();
            item2.itemName = userItem;
            item2.itemQuantity = myQuantity;
            item2.category = myCategory;
            return item2;
        }
        else if (userItem.equalsIgnoreCase("Leather Armor") ||
                userItem.equalsIgnoreCase("Plate Armor") ||
                userItem.equalsIgnoreCase("mail armor")) {
            System.out.println("How many?");
            int myQuantity = Integer.parseInt(InventoryList.scanner.nextLine());
            String myCategory = "Armor";
            item2 = new Armor();
            item2.itemName = userItem;
            item2.category = myCategory;
            item2.itemQuantity = myQuantity;
            return item2;
        }
        else if (userItem.equalsIgnoreCase("Sword") ||
                userItem.equalsIgnoreCase("Mace") ||
                userItem.equalsIgnoreCase("Staff") ||
                userItem.equalsIgnoreCase("axe") ||
                userItem.equalsIgnoreCase("hammer")) {
            System.out.println("How Many?");
            int myQuantity = Integer.parseInt(InventoryList.scanner.nextLine());
            String myCategory = "Melee";
            item2 = new Melee();
            item2.itemQuantity = myQuantity;
            item2.category = myCategory;
            item2.itemName = userItem;
            return item2;

        }
        else if (userItem.equalsIgnoreCase("Potion") ||
                userItem.equalsIgnoreCase("Food") ||
                userItem.equalsIgnoreCase("Bandage") ||
                userItem.equalsIgnoreCase("Water") ||
                userItem.equalsIgnoreCase("Beer") ||
                userItem.equalsIgnoreCase("Wine")) {
            System.out.println("How many?");
            int myQuantity = Integer.parseInt(InventoryList.scanner.nextLine());
            String myCategory = "Consumable";
            item2 = new Consumable();
            item2.itemName = userItem;
            item2.itemQuantity = myQuantity;
            item2.category = myCategory;
            return item2;
        }
        else if (userItem.equalsIgnoreCase("Ring") ||
                userItem.equalsIgnoreCase("Amulet") ||
                userItem.equalsIgnoreCase("Cloak") ||
                userItem.equalsIgnoreCase("Boots")) {
            System.out.println("How many?");
            int myQuantity = Integer.parseInt(InventoryList.scanner.nextLine());
            String myCategory = "Artifact";
            item2 = new Artifact();
            item2.itemName = userItem;
            item2.itemQuantity = myQuantity;
            item2.category = myCategory;
            return item2;
        }
        else if (!userItem.equalsIgnoreCase("Leather Armor") ||
                !userItem.equalsIgnoreCase("Plate Armor") ||
                !userItem.equalsIgnoreCase("mail armor") ||
                !userItem.equalsIgnoreCase("bow") ||
                !userItem.equalsIgnoreCase("gun") ||
                !userItem.equalsIgnoreCase("Crossbow") ||
                !userItem.equalsIgnoreCase("Sword") ||
                !userItem.equalsIgnoreCase("Mace") ||
                !userItem.equalsIgnoreCase("Staff") ||
                !userItem.equalsIgnoreCase("axe") ||
                !userItem.equalsIgnoreCase("hammer") ||
                !userItem.equalsIgnoreCase("Potion") ||
                !userItem.equalsIgnoreCase("Food") ||
                !userItem.equalsIgnoreCase("Bandage") ||
                !userItem.equalsIgnoreCase("Water") ||
                !userItem.equalsIgnoreCase("Beer") ||
                !userItem.equalsIgnoreCase("Wine") ||
                !userItem.equalsIgnoreCase("Ring") ||
                !userItem.equalsIgnoreCase("Amulet") ||
                !userItem.equalsIgnoreCase("Cloak") ||
                !userItem.equalsIgnoreCase("Boots")) {
                    System.out.println("Invalid item, please try again");
                    String tryAgain = InventoryList.scanner.nextLine();
                    item2 = createItem(tryAgain);
        }
        else {
            item2 = new Item();
        }
        return item2;
    }
    @Override
    public String toString() {
        return itemName;
    }
}
