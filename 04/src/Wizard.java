public class Wizard extends Persons  {

    public Wizard(Biographical biographical, Physical physical) {
        super(biographical, physical,new Magical());
    }
}
