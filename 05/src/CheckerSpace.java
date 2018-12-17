public class CheckerSpace implements NameChaker {
    @Override
    public boolean check(BarcodeStategy barcodeStategy) {
        return barcodeStategy.getName().contains(" ");
    }
}
