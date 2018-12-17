import java.util.ArrayList;
import java.util.List;

abstract class Persons{
    private SetHoursrAble setHoursrAble;
    private MagicalBehavior magicalBehavior;
    private Biographical bio;
    private Physical phy;

    public Persons(Biographical biographical,Physical physical,MagicalBehavior magicalBehavior) {
        this.bio = biographical;
        this.phy = physical;
        this.setHoursrAble = setHoursrAble;
        this.magicalBehavior = magicalBehavior;
//    }
//    public Persons(Biographical biographical, Physical physical, NotMagical magical){
//        this.bio = biographical;
//        this.phy = physical;
//    }

    }




}

