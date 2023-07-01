import java.util.ArrayList;

public class Initializer {
    public static void main(String[] args) throws CloneNotSupportedException {
        ComputerShop shop1 = new ComputerShop();
        shop1.setShop("Colombo");
        shop1.initializedComputers();

        System.out.println(shop1);

        ComputerShop shop2 = shop1.clone();
        shop2.setShop("Kandy");

        shop1.setComputers(new ArrayList<>());
        System.out.println(shop2);
    }
}