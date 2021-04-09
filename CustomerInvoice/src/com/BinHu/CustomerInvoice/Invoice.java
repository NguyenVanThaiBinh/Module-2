package com.BinHu.CustomerInvoice;

public class Invoice {
    private int id;

    public int getId() {
        return id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double  getAmountAfterDiscount(){
        return this.amount-(this.amount*customer.getDiscount())/100;
    }


    private Customer customer;
    private double amount;
}
