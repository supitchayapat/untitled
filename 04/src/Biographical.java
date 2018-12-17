public class Biographical {
    private String name , birthOfDate, bloodType,staus;
    public Biographical(String name,String birthOfDate,String bloodType,String status){
        this.name = name;
        this.birthOfDate = birthOfDate;
        this.bloodType = bloodType;
        this.staus = status;

    }


    public String getName() {
        return name;
    }

    public String getBirthOfDate() {
        return birthOfDate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getStaus() {
        return staus;
    }
}
