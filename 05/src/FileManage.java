import java.io.*;

public class FileManage {
    private Medicine medicine;
    private BarcodeManage barcodeManage;

    public FileManage() {
        barcodeManage = new BarcodeManage();
    }

    public void credObject() throws FileNotFoundException {
        FileReader fileReader = new FileReader("05/medicine.txt");
        BufferedReader fileReaders = new BufferedReader(fileReader);
        try {
            String object;
            while ((object = fileReaders.readLine()) != null) {
                String[] spilt = object.split(",");
                String name = spilt[0];
                int qty = Integer.valueOf(spilt[1].replace(".", ""));
                String unit = spilt[2];
                medicine = new Medicine(name, qty, unit);
                barcodeManage.addInformation(medicine);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(barcodeManage.returnData());



    }
}
