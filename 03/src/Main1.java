public class Main1 {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        cashier.recodePurchase(10);
        cashier.recodePurchase(25);
        cashier.getTax();
        cashier.enterPayMent(50);
        System.out.println(cashier.giveChange());

    }
}
