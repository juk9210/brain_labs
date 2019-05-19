package ua.zp.brain.labs.oop.basics.lab14;

public class Client extends Human {
    private int discountCard;
    private int amountOfMoney;

    public int getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(int discountCard) {
        this.discountCard = discountCard;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    void discover() {
        System.out.println("How much is a suit?");
    }

    void buy() {
        System.out.println("I want to buy this costume");
    }
}
