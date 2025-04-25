import java.util.ArrayList;

public class RandomStringChooser {

    private ArrayList<String> wordList;

    public RandomStringChooser( String[] words ) {
        wordList = new ArrayList<>();

        for ( String word : words ) {
            wordList.add( word );
        }
    }

    public String getNext() {
        if ( wordList.size() == 0 ) {
            return "NONE";
        }
        int rnd = (int)(Math.random() * wordList.size());        
        return wordList.remove( rnd );        
    }
}
