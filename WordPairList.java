import java.util.*;
public class WordPairList {
    private ArrayList<WordPair> allPair;
    
    public WordPairList(String[] word) {
        allPair = new ArrayList();
        if (word.length >= 2) {
            for(int i = 0; i < word.length; i ++) {
                for(int j = 1; j < word.length; j++) {
                    if(i!=j) {
                        if(isInList(word, i,j)) {
                            WordPair n = new WordPair(word[i], word[j]);
                            allPair.add(n);
                        }
                    }
                }
            }
        }
    }
    public int numMatches() {
        return allPair.size();
    }
    public boolean isInList(String[] word, int i, int j) {
            WordPair t = new WordPair(word[j], word[i]);
            for(WordPair p : allPair) {
                if(p.getFirst().equals(t.getFirst()) && p.getSecond().equals(t.getSecond())) {
                    return false;
                }
            }
        return true;
    }
    public String toString() {
        String all = "";
        for(WordPair s : allPair) {
            all += "(" + s.getFirst() + "," + s.getSecond() + "), ";
        }
        return all;
    }
}