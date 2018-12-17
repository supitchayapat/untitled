import java.io.FileNotFoundException;

public class MainReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        BarcodeManage barcodeManage = new BarcodeManage();
        CheckerSpace checkerSpace = new CheckerSpace();
        Doctor doctor1 = new Doctor("tiger", "0877676");
        Doctor doctor2 = new Doctor("pat", "0990");
        Doctor doctor3 = new Doctor("iu", "090909");
        doctor3.setNameType("Human");
        Medicine medicine = new Medicine("iy", 23, "mg");
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
        FileManage fileManage = new FileManage();
        fileManage.credObject();
        System.out.println(barcodeManage.returnData());
        barcodeManage.nameFilter(checkerSpace);
        checkerSpace.check(doctor1);
        checkerSpace.check(doctor2);
        checkerSpace.check(doctor3);


    }
}
