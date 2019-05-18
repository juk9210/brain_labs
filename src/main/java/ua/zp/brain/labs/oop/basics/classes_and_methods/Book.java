package ua.zp.brain.labs.oop.basics.classes_and_methods;

/**
 * Create class Book.Describe private fields and we create methods.
 *
 * @author Shakhov Yevhen.
 */
public class Book {
    private String author;
    private String name;
    private String bookGenre;
    private int publicationYear;
    private String bookLanguage;
    private String edition;
    private int pages;
    //Add a field with a constant
    private static final String READER_CATEGORY = "adult";
    // Add for private fields do get / set

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getBookLanguage() {
        return bookLanguage;
    }

    public void setBookLanguage(String bookLanguage) {
        this.bookLanguage = bookLanguage;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static String getReaderCategory() {
        return READER_CATEGORY;
    }
    //Add methods for this class.

    public int turn(int page) {
        page = 210;
        System.out.println("Open the certain page: " + page);
        return page;
    }

    public void chapterList() {
        System.out.println("Show chapter list");
    }

    public void define() {
        System.out.println("This page belongs to this chapter");
    }

    //Overload method turn
    public double turn(double chapter) {
        System.out.println("Open the certain chapter: " + chapter);
        return chapter;
    }
}
