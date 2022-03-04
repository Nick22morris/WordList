public class runner {
    public static void main(String[] args) {
        String[] words = {"one", "two", "three"};
        WordPairList n = new WordPairList(words);
        System.out.print(n);
        System.out.print(n.numMatches());
    }
} 