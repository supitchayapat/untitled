public class CountProductQuantity implements CountProductStategy {
    @Override
    public int count(Product ob) {
        return ob.getQuantity();
    }
}
