import java.text.DecimalFormat;

public class Medicine implements BarcodeStategy {
    private String name,unit;
    private  int qty;
    public Medicine(String name , int qty  , String unit){
        this.name = name;
        this.unit = unit;
        this.qty = qty;

    }

    @Override
    public String toString() {
        return  name+"       "+qty+"     "+unit;
    }

    public int hashCodeMesicine() {
        int code = name.hashCode()+unit.hashCode();
        int qtys = Integer.valueOf(String.valueOf(qty).replace(".",""));
        return code+qtys;
    }

    @Override
    public String getName() {
        return name+"       "+qty+"     "+unit;
    }

    @Override
    public String getBarcode() {
        return String.valueOf(hashCodeMesicine());
    }
}
