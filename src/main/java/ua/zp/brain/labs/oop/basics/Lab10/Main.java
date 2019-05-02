package ua.zp.brain.labs.oop.basics.Lab10;

public class Main {
    public static void main(String[] args) {
        Library newLibrary = new Library("Favorite films");
        int index = newLibrary.index();
        while (index != -1) {
            Film newFilm = new Film("GO", 2, Film.FANTASY);
            Film[] list = newLibrary.getFilmList();
            list[index] = newFilm;
            System.out.println();
        }
    }
}
