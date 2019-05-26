package ua.zp.brain.labs.oop.basics.packages.technics;

import java.util.Date;

/**
 * Create class - Passport with private fields,and their get/set.
 *
 * @author Shakhov Yevhen.
 */


public class Passport {
    private String brand;
    private String model;
    private int warranty;

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    private Date warrantyStartDate = new Date();

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int varanty) {
        this.warranty = varanty;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private int power;

    /**
     * Do redefinition of method - toString.
     */
    @Override
    public String toString() {
        return "Passport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", warranty=" + warranty +
                ", warrantyStartDate=" + warrantyStartDate +
                ", power=" + power +
                '}';
    }

    public void changeOwner(String newOwner) {
        ;
    }
}
