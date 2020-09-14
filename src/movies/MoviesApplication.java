package movies;
import util.Input;

import java.util.Scanner;

import static movies.MoviesArray.findAll;

//    Create a class named MoviesApplication that has a main method.
public class MoviesApplication {
    public static void main(String[] args) {
        //view all movies
        //view movies by category
        // Use your Input class to get input from the user, and display information based on their choice.
        // If a category is selected, only movies from that category should be displayed.
        //Your application should continue to run until the user chooses to exit.

        Movie[] movieArray = MoviesArray.findAll();
        Scanner sc = new Scanner(System.in);
        boolean continueSearch = true;

        while (continueSearch) {
            System.out.printf("What would you like to do? %n0 to exit%n1 to view all movies%n2 to view movies by category%n");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                case 1:
                    System.out.printf("OK, here are all the movies!%n");
                    for (int i = 0; i < movieArray.length; i++) {
                        System.out.printf("Movie: %s%nCategory: %s%n", Movie.getName(movieArray[i]), Movie.getCategory(movieArray[i]));
                    }
                    break;
                case 2:
                    System.out.printf("OK, which category would you like to view?%n1-drama%n2-musical%n3-scifi%n4-horror%n5-animated%n");
                    int categoryChoice = sc.nextInt();
                    switch (categoryChoice) {
                        case 1:
                            System.out.printf("OK, here are all the dramas:%n");
                            for (int i = 0; i < movieArray.length; i++) {
                                if (Movie.getCategory(movieArray[i]).equalsIgnoreCase("drama")) {
                                    System.out.printf("Movie: %s%n", Movie.getName(movieArray[i]));
                                }
                            }
                            //System.out.print(categoryChoice);
                            break;
                        case 2:
                            System.out.printf("OK, here are all the musicals:%n");
                            for (int i = 0; i < movieArray.length; i++) {
                                if (Movie.getCategory(movieArray[i]).equalsIgnoreCase("musical")) {
                                    System.out.printf("Movie: %s%n", Movie.getName(movieArray[i]));
                                }
                            }
                            //System.out.print(categoryChoice);
                            break;
                        case 3:
                            System.out.printf("OK, here are all the scifi:%n");
                            for (int i = 0; i < movieArray.length; i++) {
                                if (Movie.getCategory(movieArray[i]).equalsIgnoreCase("scifi")) {
                                    System.out.printf("Movie: %s%n", Movie.getName(movieArray[i]));
                                }
                            }
                            //System.out.print(categoryChoice);
                            break;
                        case 4:
                            System.out.printf("OK, here are all the horror:%n");
                            for (int i = 0; i < movieArray.length; i++) {
                                if (Movie.getCategory(movieArray[i]).equalsIgnoreCase("horror")) {
                                    System.out.printf("Movie: %s%n", Movie.getName(movieArray[i]));
                                }
                            }
                            //System.out.print(categoryChoice);
                            break;
                        case 5:
                            System.out.printf("OK, here are all the animated:%n");
                            for (int i = 0; i < movieArray.length; i++) {
                                if (Movie.getCategory(movieArray[i]).equalsIgnoreCase("animated")) {
                                    System.out.printf("Movie: %s%n", Movie.getName(movieArray[i]));
                                }
                            }
                    }
            }
            continueSearch = Input.yesNo("Would you like to continue with our Movies application? Yes/No");
            //keep asking based on different answers
            // Bonus: Add functionality to allow a user to add a new movie to the list.


        }
        System.out.println("OK, thanks for joining us!");
    }
}
