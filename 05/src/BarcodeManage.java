import java.util.ArrayList;
import java.util.HashMap;

public class BarcodeManage {
    private HashMap<String, String> hashInformation;
    private StringBuffer strData;
    private BarcodeStategy barcodeStategy;
    private ArrayList<BarcodeManage> barcodeManages;

    public BarcodeManage() {
        hashInformation = new HashMap<>();
        strData = new StringBuffer();
        barcodeManages = new ArrayList<>();
    }

    public void addInformation(BarcodeStategy barcodeStategy) {
        hashInformation.put(barcodeStategy.getBarcode(), barcodeStategy.getName());
    }

    public void removeInformation(String barcode) throws NoDataException {
        if (hashInformation.containsKey(barcode)) {
            hashInformation.remove(barcode);
        } else {
            throw new NoDataException("No Information in data ");
        }
    }

    public StringBuffer returnData() {

        for (String strs : hashInformation.keySet()) {
            strData = strData.append(strs + "" + "" + hashInformation.get(strs)+"\n");
        }
        return strData;
    }



    public ArrayList nameFilter(NameChaker nameChaker){
        boolean check = nameChaker.check(barcodeStategy);
        if (check){
            barcodeManages.add((BarcodeManage) barcodeStategy);


        }
        return barcodeManages;


    }

}
