class WordCounter {
    static String language = "English";

    void count(String sentence) {
        String str = sentence.trim();
        int words = str.isEmpty() ? 0 : str.split("\\s+").length;

        System.out.println("Words: " + words);
        System.out.println("Language: " + language);
    }

    public static void main(String[] args) {
        WordCounter w = new WordCounter();
        w.count("Java is easy to learn");
    }
}

Words: 5
Language: English