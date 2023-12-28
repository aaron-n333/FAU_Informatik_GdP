package hero;

public class Test {
    public static void main(String[] args) {
        Hero JohnCena = new Hero("John Cena", 100, 50);
        JohnCena.printInfo();

        System.out.println("");

        Hero TheRock = new Hero("The Rock", 100, 50);
        TheRock.printInfo();

        System.out.println("");

        Item BingChilling = new Item("Bing Chilling", 69);

        System.out.println("");

        Item HeBeCooking = new Item("Can you smell what The Rock is cooking?", 50);

        System.out.println("");

        Arena.fight(JohnCena, TheRock);
    }
}
