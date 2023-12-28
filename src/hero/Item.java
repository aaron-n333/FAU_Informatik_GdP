package hero;

public class Item {
    //Attribute
    private String itemName;
    private int itemDamage;
    private int itemID;
    private static int itemIDCounter = 0;

    //Getter
    public String getItemName () {
        return itemName;
    }

    public int getItemDamage () {
        return itemDamage;
    }

    public int getItemID () {
        return itemID;
    }

    //Konstruktor
    public Item (String itemNameK, int itemDamageK) {
        this.itemName = itemNameK;

        if (itemDamageK <= 0 && itemDamageK >= 100) {
            itemDamageK = (int) Math.random();
            this.itemDamage = itemDamageK;
        } else {
            this.itemDamage = itemDamageK;
        }

        this.itemID = itemIDCounter;
        itemIDCounter++;
    }

    public void printInfo() {
        System.out.println("Item: " + itemName);
        System.out.println("Item Damage: " + itemDamage);
        System.out.println("Item ID: " + itemID);
    }


}
