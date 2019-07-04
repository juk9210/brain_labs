package ua.zp.brain.labs.oop.basics.serialization;

import java.io.Serializable;

public class CreditCard implements Serializable {
    private CardType cardType;
    private String bankName;
    private String cardNumber;
    private  transient String exp;
    private transient int cvv;

    public CreditCard(CardType cardType, String bankName, String cardNumber, String exp, int cvv) {
        this.cardType = cardType;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.exp = exp;
        this.cvv = cvv;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCard: " +
                "\ncardType = " + cardType +
                "\nbankName = '" + bankName + '\'' +
                "\ncardNumber = " + cardNumber +
                "\nexp = '" + exp + '\'' +
                "\ncvv = " + cvv;
    }
}
