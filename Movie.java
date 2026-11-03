class Movie {
    String name, genre;
    double rating;
    static String industry = "Bollywood";

    public static void main(String[] args) {
        String n = "3 Idiots";
        String g = "Comedy";
        double r = 9.0;

        Movie m = new Movie();
        m.name = n;
        m.genre = g;
        m.rating = r;

        System.out.println("Movie: " + m.name);
        System.out.println("Genre: " + m.genre);
        System.out.println("Rating: " + m.rating);
        System.out.println("Industry: " + industry);
    }
}


Movie: 3 Idiots
Genre: Comedy
Rating: 9.0
Industry: Bollywood