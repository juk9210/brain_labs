package ua.zp.brain.labs.oop.basics.classes_and_methods;

import static ua.zp.brain.labs.oop.basics.classes_and_methods.Auto.getDriveType;
import static ua.zp.brain.labs.oop.basics.classes_and_methods.Book.getReaderCategory;
import static ua.zp.brain.labs.oop.basics.classes_and_methods.PostOffice.getLOCALIZATION;
import static ua.zp.brain.labs.oop.basics.classes_and_methods.StoreCostumer.getNATIONALITY;

/**
 * Create class Main to create objects. Initialize the object fields. And display the data in the console.
 *
 * @author Shakhov Yevhen.
 */

public class Main {
    public static void main(String[] args) {
        //Create a Book class object
        Book book = new Book();
        //Initialize the object fields
        book.setAuthor("Ernest Cline");
        book.setBookGenre("fantasy");
        book.setBookLanguage("russian");
        book.setEdition("first");
        book.setPages(480);
        book.setPublicationYear(2013);
        book.setName("Ready Player One");
        //  Call the class methods
        book.turn(210);
        book.chapterList();
        book.define();
        //Print the object data to the console.
        System.out.println("Name of class: Book" + "\nName of book: " + book.getName() + "\nAutor: " + book.getAuthor() +
                "\nGenre of book: " + book.getBookGenre() + "\nLanguage: " + book.getBookLanguage() + "\nEdition: " +
                book.getEdition() + "\nPages: " + book.getPages() + "\nPublication Year: " + book.getPublicationYear() +
                "\nReader category: " + getReaderCategory());
        System.out.println(" ");
        //Create a PostOffice class object
        PostOffice UkrPost = new PostOffice();
        //Initialize the object fields
        UkrPost.setBranchNumber(25);
        UkrPost.setOwn("state");
        //  Call the class methods
        UkrPost.accept();
        UkrPost.packAndShip();
        PostOffice.volumeCalculation();
        //Print the object data to the console.
        System.out.println("Name of class: PostOffice" + "\nNumber of Post Office: " + UkrPost.getBranchNumber() + "\nOwn: "
                + UkrPost.getOwn() + "\nLocalization: " + getLOCALIZATION());
        System.out.println(" ");
        //Create a StoreCostumer class object
        StoreCostumer Arien = new StoreCostumer();
        //Initialize the object fields
        Arien.setAge(35);
        Arien.setSex("man");
        Arien.setSize("L");
        //  Call the class methods
        Arien.add();
        Arien.buy();
        Arien.view();
        //Print the object data to the console.
        System.out.println("Name of class: StoreCostumer" + "\nCostumer age: " + Arien.getAge() + "\nCostumer sex: " +
                Arien.getSex() + "\nCostumer size: " + Arien.getSize() + "\nNationality: " + getNATIONALITY());
        System.out.println(" ");
        //Create a Auto class object
        Auto auto = new Auto();
        //Initialize the object fields
        auto.setBodyType("sedan");
        auto.setBrand("Kia");
        auto.setModel("Rio");
        auto.setColor("blue");
        auto.setCountryProducer("Korea");
        auto.setTypeOfTransport("passenger");
        auto.setYearOfRelease(2016);
        //  Call the class methods
        auto.turnOn();
        auto.go();
        auto.brake();
        //Print the object data to the console.
        System.out.println("Name of class: Auto" + "\nBody typ: " + auto.getBodyType() + "\nType of transport: " +
                auto.getTypeOfTransport() + "\nBrand: " + auto.getBrand() + "\nModel: " + auto.getModel() + "\nColor: "
                + auto.getColor() + "\nCountry producer: " + auto.getCountryProducer() + "\nYear of release: " +
                auto.getYearOfRelease() + "\nDrive type: " + getDriveType());
    }
}
