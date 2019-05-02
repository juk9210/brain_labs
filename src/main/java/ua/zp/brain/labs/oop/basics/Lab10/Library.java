package ua.zp.brain.labs.oop.basics.Lab10;

public class Library {
    private String libName;
    private final Film[] filmList;

    {
        filmList = new Film[5];
        filmList[0] = new Film("Resident Evil", 2.15, Film.HORRORS);
        filmList[1] = new Film("1+1", 2.20, Film.COMEDY);
        System.out.println("Добавлены новые фильмы");
    }

    public Library(String libName) {
        System.out.println("Библиотека " + libName + " успешно создана");
    }

    public int index() {
        for (int i = 0; i < filmList.length; i++) {
            if (filmList[i] == null) {
                return i;
            }
        }
        return -1;
    }

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
