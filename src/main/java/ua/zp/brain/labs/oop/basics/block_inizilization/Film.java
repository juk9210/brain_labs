package ua.zp.brain.labs.oop.basics.block_inizilization;

/**
 * Create a class Film.Describe the fields.Create for them get/set.
 * Create a constructor.
 *
 * @author Shakhov Yevhen.
 */
public class Film {
    //Describe the private fields
    private String name;
    private double duration;
    private String genre;
    //Create const fields
    public static final String COMEDY = "Comedy";
    public static final String FANTASY = "Fantasy";
    public static final String HORRORS = "Horrors";

    //Create a constructor with parameters - name,duration,genre.Do console output.
    public Film(String name, double duration, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Фильм " + name + " успешно создан");
    }

    //Create a initialization block.Do console output - A new film is being created.
    {
        System.out.println("Создаётся новый фильм");
    }

    //Create get/set for private fields
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
