public class Patient  extends  Person implements BarcodeStategy{

    public Patient(String name, String phone, int age) {
        super(name, phone, age);
    }
    @Override
    public String toString() {
        return super.getName();
    }

    public int hashCodePatient() {
        return super.getName().hashCode()+super.getPhone().hashCode()+super.getAge();
    }

    @Override
    public String getBarcode() {
        return String.valueOf(hashCodePatient());
    }
}
