public class InStrument implements BarcodeStategy {
    private String detail;
    public InStrument(String detail){
        this.detail = detail;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int hashCodeInstrument() {
        return detail.hashCode();
    }

    @Override
    public String getName() {
        return detail;
    }

    @Override
    public String getBarcode() {
        return String.valueOf(hashCodeInstrument());
    }
}
