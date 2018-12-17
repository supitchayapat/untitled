public class Doctor extends Person implements BarcodeStategy {
    private String nameType;

    public Doctor(String name, String phone) {
        super(name, phone);
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    @Override
    public String toString() {
        return super.getName();
    }

    public int hashCodeDoctor() {
       return  super.getName().hashCode() + super.getPhone().hashCode() + nameType.hashCode();

    }

    @Override
    public String getBarcode() {
        return String.valueOf(String.valueOf(hashCodeDoctor()));
    }
}
