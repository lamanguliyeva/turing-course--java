package lab1;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Movie[] movies = new Movie[0];

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
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    movies = addMovies(3);
                    break;
                case 2:
                    displayMovies();
                    break;
                case 3:
                    System.out.println("how many additional movies will be added?");
                    int numOfMovies = sc.nextInt();
                    sc.nextLine();
                    movies = addMovies(numOfMovies);
                    break;
                case 4:
                    findStatistics();
                    break;
                case 5:
                    searchingMovie();
                    break;
                case 6:
                    updateRating();
                    break;
                case 7:
                    deleteMovie();
                    break;
                case 8:
                    movies = sortMovies();
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

    static Movie[] addMovies(int n) {
        Movie[] newMovies = new Movie[movies.length + n];
        System.arraycopy(movies, 0, newMovies, 0, movies.length);
        for (int i = movies.length; i < newMovies.length; i++) {
            System.out.println("Enter the name of movie " + (i + 1) + ": ");
            String movieName = sc.nextLine();
            System.out.println("Enter the rating of movie: ");
            double movieRating = sc.nextDouble();
            sc.nextLine();
            newMovies[i] = new Movie(movieName, movieRating);
        }
        return newMovies;
    }

    static void displayMovies() {
        if (movies.length == 0) {
            System.out.println("No movies in the list!");
            return;
        }
        System.out.println("Movies and Ratings:");
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " - " + movie.getRating());
        }
    }

    static void findStatistics() {
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

    static int indexMovie(String name) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    static void searchingMovie() {
        System.out.println("Enter the movie name: ");
        String name = sc.nextLine();
        int index = indexMovie(name);

        if (index != -1) {
            System.out.println("Movie found! Rating: " + movies[index].getRating());
        } else {
            System.out.println("Movie not found!");
        }
    }

    static void updateRating() {
        System.out.println("Enter the name of the movie whose rating you want to update: ");
        String name = sc.nextLine();
        int index = indexMovie(name);

        if (index != -1) {
            System.out.println("Enter the updated rating of the movie: ");
            movies[index].setRating(sc.nextDouble());
        } else {
            System.out.println("Movie is not found!");
        }

    }

    static void deleteMovie() {
        System.out.println("Enter the name of the movie to delete: ");
        String name = sc.nextLine();
        int index = indexMovie(name);

        if (index != -1) {
            Movie[] newMovies = new Movie[movies.length - 1];
            System.arraycopy(movies, 0, newMovies, 0, index);
            System.arraycopy(movies, index + 1, newMovies, index, movies.length - index - 1);
            movies = newMovies;
            System.out.println("Movie is deleted!");
        } else {
            System.out.println("Movie is not found!");
        }
    }

    static Movie[] sortMovies() {
        for (int i = 0; i < movies.length - 1; i++) {
            for (int j = 0; j < movies.length - i - 1; j++) {
                if (movies[j].getRating() > movies[j + 1].getRating()) {
                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                }
            }
        }
        return movies;
    }
}
