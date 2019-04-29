package ua.zp.brain.labs.oop.basics.classes;


import static ua.zp.brain.labs.oop.basics.classes.Auto.getDriveType;
import static ua.zp.brain.labs.oop.basics.classes.Book.getReaderCategory;
import static ua.zp.brain.labs.oop.basics.classes.PostOffice.getLOCALIZATION;
import static ua.zp.brain.labs.oop.basics.classes.StoreCostumer.getNATIONALITY;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Ernest Cline");
        book.setBookGenre("fantasy");
        book.setBookLanguage("russian");
        book.setEdition("first");
        book.setPages(480);
        book.setPublicationYear(2013);
        book.setName("Ready Player One");
        System.out.println("Name of class: Book" + "\nName of book: " + book.getName() + "\nAutor: " + book.getAuthor() +
                "\nGenre of book: " + book.getBookGenre() + "\nLanguage: " + book.getBookLanguage() + "\nEdition: " +
                book.getEdition() + "\nPages: " + book.getPages() + "\nPublication Year: " + book.getPublicationYear() +
                "\nReader category: " + getReaderCategory());
        PostOffice UkrPost = new PostOffice();
        UkrPost.setBranchNumber(25);
        UkrPost.setOwn("state");
        System.out.println("Name of class: PostOffice" + "\nNumber of Post Office: " + UkrPost.getBranchNumber() + "\nOwn: "
                + UkrPost.getOwn() + "\nLocalization: " + getLOCALIZATION());
        StoreCostumer Arien = new StoreCostumer();
        Arien.setAge(35);
        Arien.setSex("man");
        Arien.setSize("L");
        System.out.println("Name of class: StoreCostumer" + "\nCostumer age: " + Arien.getAge() + "\nCostumer sex: " +
                Arien.getSex() + "\nCostumer size: " + Arien.getSize() + "\nNationality: " + getNATIONALITY());
        Auto auto = new Auto();
        auto.setBodyType("sedan");
        auto.setBrand("Kia");
        auto.setModel("Rio");
        auto.setColor("blue");
        auto.setCountryProducer("Korea");
        auto.setTypeOfTransport("passenger");
        auto.setYearOfRelease(2016);
        System.out.println("Name of class: Auto" + "\nBody typ: " + auto.getBodyType() + "\nType of transport: " +
                auto.getTypeOfTransport() + "\nBrand: " + auto.getBrand() + "\nModel: " + auto.getModel() + "\nColor: "
                + auto.getColor() + "\nCountry producer: " + auto.getCountryProducer() + "\nYear of release: " +
                auto.getYearOfRelease() + "\nDrive type: " + getDriveType());
    }
}
