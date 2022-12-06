package optional;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Integer quantity = coffee.getSugar().getQuantity();
        System.out.println(quantity);
    }
}
