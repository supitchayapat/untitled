public class Cashier {
    private double amount;
    private double payment;
    public Cashier(){
        amount = 0;
        payment = 0;

    }
    public void recodePurchase(double amount){
        this.amount = this.amount+amount;

    }

    private double recodeTaxPurchase(){
        double tax = getAmount()+(getAmount()*0.075);
        System.out.println(tax);
        return tax;

    }



    public void enterPayMent(double amount){
        this.payment = amount;


    }
    public double getTax(){
        return recodeTaxPurchase();
    }

    public double getAmount() {
        return amount;
    }

    public double getPayment() {
        return payment;
    }

    public double giveChange(){
        double change = getPayment()- recodeTaxPurchase();

        return change;


    }
}
