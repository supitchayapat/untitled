import java.util.*;

public class Dictonary {

    private Map<String,Vocabulary> dic = new HashMap<String, Vocabulary>()  ;
    private Vocabulary vocabulary;
    public Dictonary(){

    }


    public void addWordToDict(String word, Vocabulary vocabularys) {
        vocabularys.setWord(word);


    }
    public Set<String> showDictonary(){
        return dic.keySet();
    }
    public Vocabulary getVocabulary(String nam){
        return dic.get(nam);
    }

    @Override
    public String toString() {
        return dic+" ";
    }
}
