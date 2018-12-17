public class GameCharactor  {
    private Wallet wallet;
    private String items;
    private double qty;

    public GameCharactor(Wallet wallet){
    }
    public void setActivityForItem(ItemAble item){
        item.activity(items,qty);
    }



}

