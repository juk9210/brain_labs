package ua.zp.brain.labs.oop.basics.BlockInizilization;

/**
 * Create a object newLibrary of class Library.Make a check for the presence of an empty cell in the array. If there
 * is, then create a new film in this cell. And do this until the entire array is filled.After the array is filled,
 * display the message - you have reached the limit.
 *
 * @author Shakhov Yevhen.
 */
public class Main {
    public static void main(String[] args) {
        Library newLibrary = new Library("Favorite films");
        int ind = newLibrary.search();
        if (ind == -1) {
            System.out.println("Вы достигли лимита");
        } else {
            newLibrary.getFilmList()[ind] = new Film("Friends", 2.15, Film.COMEDY);
        }
        ind = newLibrary.search();
        if (ind == -1) {
            System.out.println("Вы достигли лимита");
        } else {
            newLibrary.getFilmList()[ind] = new Film("Irrepressible", 2.25, Film.COMEDY);
        }
        ind = newLibrary.search();
        if (ind == -1) {
            System.out.println("Вы достигли лимита");
        } else {
            newLibrary.getFilmList()[ind] = new Film("Rush Hour", 2.5, Film.COMEDY);
        }
        ind = newLibrary.search();
        if (ind == -1) {
            System.out.println("Вы достигли лимита");
        } else {
            newLibrary.getFilmList()[ind] = new Film("Home alone", 2.15, Film.COMEDY);
        }
    }
}
