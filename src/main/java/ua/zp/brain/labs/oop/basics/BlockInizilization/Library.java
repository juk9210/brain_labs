package ua.zp.brain.labs.oop.basics.BlockInizilization;

/**
 * Create a class Library.Describe the fields.Create for them get/set.
 * Create a constructor,method and initialization block
 *
 * @author Shakhov Yevhen.
 */
public class Library {
    //Create private fields
    private String libName;
    private final Film[] filmList;

    //Create a initialization block.In it create an array of films.Сreate two films with parameters.
    {
        filmList = new Film[5];
        filmList[0] = new Film("Resident Evil", 2.15, Film.HORRORS);
        filmList[1] = new Film("1+1", 2.20, Film.COMEDY);
        System.out.println("Добавлены новые фильмы");
    }

    //Create a constructor with parameter - LibName.Do console output - Library successfully created.
    public Library(String libName) {
        System.out.println("Библиотека " + libName + " успешно создана");
    }

    //Create a method that will return the index of an empty cell. And if the array is full, it will return -1.
    public int search() {
        for (int i = 0; i < filmList.length; i++) {
            if (filmList[i] == null) {
                return i;
            }
        }
        return -1;
    }

    //Create get/set for private fields
    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    public Film[] getFilmList() {
        return filmList;
    }
}
