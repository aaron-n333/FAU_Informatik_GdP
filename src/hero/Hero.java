package hero;

public class Hero {
    //Attribute
    private String name;
    private int health;
    private int damage;
    private Item[] inventory;
    private int inventorySize;

    //Getter & Setter
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setName(String nameInput) {
        if (nameInput == "") {
            System.out.println("Der eingegebene Name ist ungültig, ein Name muss aus mindestens 1 Zeichen bestehen.");
        }
        else {
            this.name = nameInput;
        }
    }

    //Konstruktor
    public Hero(String nameK, int healthK, int damageK) {
        this.name = nameK;
        this.health = healthK;
        this.damage = damageK;

        this.inventory = new Item[6];
    }

    //Konstruktor überladen: individuelle Taschengröße
    public Hero(String nameK, int healthK, int damageK, int inventorySizeK) {
        this.name = nameK;
        this.health = healthK;
        this.damage = damageK;

        if (inventorySize < 1 || inventorySize > 15) {
            System.out.println ("Eingegebene Taschengröße ist zu klein/groß. Die Größe muss im Bereich von inklusive 1 bis 15 liegen.");
        } else {
            this.inventorySize = inventorySizeK;
            this.inventory = new Item[inventorySizeK];
        }
    }

    //printInfo
    public void printInfo() {
        System.out.println("Hero: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Damage: " + this.damage);
    }

    //insertItem
    public boolean insertItem(Item item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                this.inventory[i] = item;
                System.out.println ("Item " + item.getItemName() + " wurde erfolgreich an Stelle " + i + " im Inventory hinzugefügt.");
                return true;
            }
        }
        return false;
    }

    //printEquipment
    public void printEquipment() {
        System.out.println("Equipment for '" + name + "':");
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                System.out.print("* ");
                inventory[i].printInfo();
            }
        }
    }

    //getEquippedDamage
    public int getEquippedDamage() {
        int damageSum = this.getDamage();
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                damageSum += inventory[i].getItemDamage();
            }
        }
        return damageSum;
    }

    public void attackEquipped(Hero targetHero) {
        if (targetHero == null) {
            return;
        }
        targetHero.health -= this.getEquippedDamage();
    }

    //Fähigkeiten

}


