package ua.zp.brain.labs.oop.basics.inheritance;

import java.util.Objects;

public class Client extends Human {
    private int discountCard;
    private int amountOfMoney;

    void discover() {
        System.out.println("Tell me about men's costume");
    }

    void buy() {
        System.out.println("I want to buy this costume");
    }

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return discountCard == client.discountCard &&
                amountOfMoney == client.amountOfMoney;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discountCard, amountOfMoney);
    }

    @Override
    public String toString() {
        return "Client{" +
                "discountCard=" + discountCard +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }

    Client(String name, int numberPhone, int discountCard, int amountOfMoney) {
        super(name, numberPhone);
        this.amountOfMoney = amountOfMoney;
        this.discountCard = discountCard;
    }
}
