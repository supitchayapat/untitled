public class Vocabulary {
    private String partOfSpeed;
    private String meanIng;
    private String example;
    private String word;

    public Vocabulary(String mean,String partOfSpeed, String exm){
        this.meanIng = mean;
        this.partOfSpeed =partOfSpeed;
        this.example = exm;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPartOfSpeed() {
        return partOfSpeed;
    }

    public void setPartOfSpeed(String partOfSpeed) {
        this.partOfSpeed = partOfSpeed;
    }

    public String getMeanIng() {
        return meanIng;
    }

    public void setMeanIng(String meanIng) {
        this.meanIng = meanIng;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return getMeanIng() + " \n"+getPartOfSpeed()+"\n"+getExample();
    }
}
