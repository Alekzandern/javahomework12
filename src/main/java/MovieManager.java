public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;

    }
    public int getLimit() {
        return limit;
    }
    public MovieManager(int limit) {
        this.limit = limit;

    }
    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {

        return movies;
    }

    public String findLast() {
        return movies[movies.length - 1];
    }
}
