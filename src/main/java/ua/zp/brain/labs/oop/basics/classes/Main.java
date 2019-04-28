package ua.zp.brain.labs.oop.basics.classes;

import static ua.zp.brain.labs.oop.basics.classes.Auto.DRIVE_TYPE;
import static ua.zp.brain.labs.oop.basics.classes.Book.getReaderCategory;
import static ua.zp.brain.labs.oop.basics.classes.PostOffice.LOCALIZATION;
import static ua.zp.brain.labs.oop.basics.classes.StoreCostumer.NATIONALITY;

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
        UkrPost.branchNumber = 25;
        UkrPost.own = "state";
        System.out.println("Name of class: PostOffice" + "\nNumber of Post Office: " + UkrPost.branchNumber + "\nOwn: " + UkrPost.own +
                "\nLocalization: " + LOCALIZATION);
        StoreCostumer Arien = new StoreCostumer();
        Arien.age = 35;
        Arien.sex = "man";
        Arien.size = "L";
        System.out.println("Name of class: StoreCostumer" + "\nCostumer age: " + Arien.age + "\nCostumer sex: " + Arien.sex +
                "\nCostumer size: " + Arien.size + "\nNationality: " + NATIONALITY);
        Auto auto = new Auto();
        auto.bodyType = "sedan";
        auto.brand = "Kia";
        auto.model = "Rio";
        auto.color = "blue";
        auto.countryProducer = "Korea";
        auto.typeOfTransport = "passenger";
        auto.yearOfRelease = 2016;
        System.out.println("Name of class: Auto" + "\nBody typ: " + auto.bodyType + "\nType of transport: " + auto.typeOfTransport +
                "\nBrand: " + auto.brand + "\nModel: " + auto.model + "\nColor: " + auto.color + "\nCountry producer: " + auto.countryProducer +
                "\nYear of release: " + auto.yearOfRelease + "\nDrive type: " + DRIVE_TYPE);
    }
}
