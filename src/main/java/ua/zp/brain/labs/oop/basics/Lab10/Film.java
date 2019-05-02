package ua.zp.brain.labs.oop.basics.Lab10;

/**
 *
 * @author Shakhov Yevhen.
 */
public class Film {
    private String name;
    private double duration;
    private String genre;
    public static final String COMEDY = "Comedy";
    public static final String FANTASY = "Fantasy";
    public static final String HORRORS = "Horrors";

    public Film(String name, double duration, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Фильм " + name + " успешно создан");
    }

    {
        System.out.println("Создаётся новый фильм");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
