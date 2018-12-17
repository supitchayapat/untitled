public class NameLenghtChecker implements NameChaker {
    @Override
    public boolean check(BarcodeStategy ob) {
        int count = ob.getName().length();
        return count<15;
    }
}
