package model;

public class Order {
    private int id;
    private int sellerId;
    private int customerId;
    private int[] coffees;

    public Order(int id, int sellerId, int customerId, int[] coffees) {
        this.id = id;
        this.sellerId = sellerId;
        this.customerId = customerId;
        this.coffees = coffees;
    }
}
