public class Main {
    public static void main(String[] args) {
        Dictonary dictonary = new Dictonary();
        dictonary.addWordToDict("tiger",new Vocabulary("สัตว์ดุร้าย","Noun","Tiger is very cazy"));
        dictonary.addWordToDict("show",new Vocabulary("โชว์สัตว์","Noun","Show me"));
        System.out.println(dictonary.getVocabulary("tiger"));
    }
}
