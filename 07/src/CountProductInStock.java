public class CountProductInStock implements CountProductStategy{
    @Override
    public int count(Product ob) {
        if (ob.getQuantity() > 0){
            return 1;
        }
        return 0;
    }
}
