public class Physical {
    private String gendar , typeColor , colorHair,skinColor;
    private double height;

    public Physical(String gender,double height,String typeColor,String colorForEye,String skinColor){
        this.gendar =gender;
        this.typeColor = colorForEye;
        this.colorHair= typeColor;
        this.skinColor = skinColor;
        this.height = height;
    }

    public String getGendar() {
        return gendar;
    }

    public String getTypeColor() {
        return typeColor;
    }

    public String getColorHair() {
        return colorHair;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public double getHeight() {
        return height;
    }
}
