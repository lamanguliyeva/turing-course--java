package lab1;
import java.util.Scanner;

public class Main {

    static void showMenu() {
        System.out.println("\n" +
                "Press 1 to input movies\n" +
                "Press 2 to display movies and ratings\n" +
                "Press 3 to input more movies\n" +
                "Press 0 to exit\n" +
                "Press 4 to find statistics\n" +
                "Press 5 to search for a movie\n" +
                "Press 6 to update movie ratings\n" +
                "Press 7 to delete a movie\n" +
                "Press 8 to sort movies\n" +
                "Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[0];
        showMenu();
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    movies = addMovies(3, sc, movies);
                    break;
                case 2:
                    for (Movie movie : movies) {
                        System.out.println(movie.toString());
                    }
                    break;
                case 3:
                    System.out.println("how many additional movies will be added?");
                    int numOfMovies = sc.nextInt();
                    movies = addMovies(numOfMovies, sc, movies);
                    break;
                case 4:
                    findStatistics(movies);
                    break;
                case 5:
                    System.out.println("Enter the movie name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    searchingMovie(name, movies);
                    break;
                case 6:
                    System.out.println("Enter the name of the movie whose rating you want to update: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    updateRatings(name, movies, sc);
                    break;
                case 7:
                    System.out.println("Enter the name of movie that will be deleted: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    movies = deleteMovie(name, movies);
                    break;
                case 8:
                    movies = sortMovies(movies);
                    System.out.println("List sorted!!");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid input!");
                    break;

            }
        }
    }

    static Movie[] addMovies(int n, Scanner sc, Movie[] movies) {
        Movie[] newMovies = new Movie[movies.length + n];
        System.arraycopy(movies, 0, newMovies, 0, movies.length);
        for (int i = movies.length; i < newMovies.length; i++) {
            sc.nextLine();
            System.out.println("Enter the name of movie " + (i + 1) + ": ");
            String movieName = sc.nextLine();
            System.out.println("Enter the rating of movie: ");
            double movieRating = sc.nextDouble();
            newMovies[i] = new Movie(movieName, movieRating);
        }
        return newMovies;
    }

    static void findStatistics(Movie[] movies) {
        double maxRating = movies[0].getRating();
        double minRating = movies[0].getRating();
        double avgRating = 0;
        for (Movie movie : movies) {
            if (movie.getRating() > maxRating) {
                maxRating = movie.getRating();
            }
            if (movie.getRating() < minRating) {
                minRating = movie.getRating();
            }
            avgRating += movie.getRating();
        }
        avgRating = avgRating / movies.length;
        System.out.println("The average rating of the movies: " + avgRating);
        System.out.println("The movie with the maximum rating: " + maxRating);
        System.out.println("The movie with the minimum rating: " + minRating);
    }

    static void searchingMovie(String name, Movie[] movies) {
        for(Movie movie : movies) {
            if(movie.getName().equals(name)) {
                System.out.println("Rating of the searching movie: " + movie.getRating());
                return;
            }
        }
        System.out.println("Movie is not found!");
    }

    static void updateRatings(String name, Movie[] movies, Scanner sc) {
        for(Movie movie: movies) {
            if(movie.getName().equals(name)) {
                System.out.println("Enter the updating rating of this movie: ");
                movie.setRating(sc.nextDouble());
                return;
            }
        }
        System.out.println("Movie is not found!");
    }

    static Movie[] deleteMovie(String movieName,Movie[] movies) {
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Movie is not found");
            return movies;
        } else {
            System.out.println("Movie is deleted");
        }
        Movie[] newMovies = new Movie[movies.length - 1];
        for(int i = 0, j = 0; i < movies.length; i++, j++) {
            if(movies[i].getName().equals(movieName)) {
                j--;
                continue;
            }
            newMovies[j] = movies[i];
        }
        return newMovies;
    }

    static Movie[] sortMovies(Movie[] movies) {
        for(int i = 0; i < movies.length - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < movies.length - i - 1; j++) {
                if(movies[j].getRating() > movies[j + 1].getRating()) {
                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                return movies;
            }
        }
        return movies;
    }

}
