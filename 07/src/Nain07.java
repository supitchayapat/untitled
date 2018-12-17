public class Nain07 {
    public static void main(String[] args) {


        Store store = new Store();
        store.addProduct("Big Java", 300, 5);
        store.addProduct("Da Vinci Code", 120, 0);
        store.addProduct("Python 101", 200, 10);
        System.out.println(store.countProductStategy(new CountAllProduct()));
        System.out.println(store.countProductStategy(new CountProductInStock()));
        System.out.println(store.countProductStategy(new CountProductQuantity()));
    }
    }
