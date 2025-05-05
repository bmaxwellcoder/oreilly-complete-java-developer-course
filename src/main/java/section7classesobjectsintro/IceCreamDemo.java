package section7classesobjectsintro;

public class IceCreamDemo {

    public static void main(String[] args) {

        IceCream myIC = new IceCream("Chocolate", 3, 1);

        IceCream yourIC = new IceCream("Strawberry", 2, 1);

        myIC.addTopping("nuts");
        myIC.addTopping("cherries");

        yourIC.addTopping("sprinkles");

        printIC(myIC);
        printIC(yourIC);
    }

    public static void printIC(IceCream iceCream) {
        System.out.println(iceCream.getName());
        System.out.println("Cost: $" + iceCream.getCost());
        System.out.println("Topped with: ");
        iceCream.printToppings();
        System.out.println();
    }
}
