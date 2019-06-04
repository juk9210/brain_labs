package ua.zp.brain.labs.oop.basics.inheritance;

import java.util.Objects;

/**
 * Create class Client which extends class Human.
 *
 * @author Shakhov Yevhen.
 */

class Client extends Human {
    /**
     * Create private field with get/set.
     */
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

    /**
     * Create private methods - discover and buy.
     */
    void discover() {
        System.out.println("Tell me about men's costume");
    }

    void buy() {
        System.out.println("I want to buy this costume");
    }

    /**
     * Override method equals.
     *
     * @param o
     * @return
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return discountCard == client.discountCard &&
                amountOfMoney == client.amountOfMoney;
    }

    /**
     * Override method hashCode.
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discountCard, amountOfMoney);
    }

    /**
     * Override method toString.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Client{" +
                "discountCard=" + discountCard +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }

    /**
     * Create constructor with options.
     *
     * @param name
     * @param numberPhone
     * @param discountCard
     * @param amountOfMoney
     */
    Client(String name, int numberPhone, int discountCard, int amountOfMoney) {
        super(name, numberPhone);
        this.amountOfMoney = amountOfMoney;
        this.discountCard = discountCard;
    }
}
