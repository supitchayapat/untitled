public class MainInfor {
    public static void main(String[] args) {
        BarcodeManage barcodeManage = new BarcodeManage();
        Doctor doctor1 = new Doctor("tiger", "0877676");
        Doctor doctor2 = new Doctor("pat", "0990");
        Doctor doctor3 = new Doctor("iu", "090909");
        Medicine medicine = new Medicine("iy", 23, "mg");
        doctor3.setNameType("Human");
        barcodeManage.addInformation(medicine);
        doctor1.setNameType("child");
        doctor2.setNameType("People");
        barcodeManage.addInformation(doctor1);
        barcodeManage.addInformation(doctor2);
        try {
            barcodeManage.removeInformation("nanana");
        } catch (NoDataException e) {
            e.printStackTrace();
        }

        System.out.println(barcodeManage.returnData());
        System.out.println();

    }
}
