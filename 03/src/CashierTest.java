import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {
    @Test
    public void test_PossitiveGiveChange(){
        Cashier cashier = new Cashier();
        cashier.recodePurchase(10);
        cashier.recodePurchase(25);

        cashier.enterPayMent(50);
        System.out.println(cashier.getTax());
        assertEquals(12.375,cashier.giveChange());


    }

}