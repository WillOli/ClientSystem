package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderItem satus;
    private Client client;
    private List<OrderItem> items = new ArrayList<OrderItem>();

    public Order() {

    }

    public Order(Date moment, OrderItem status, Client client) {
        this.moment = moment;
        this.satus = status;
        this.client = client;

    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderItem getSatus() {
        return satus;
    }
    public void setSatus(OrderItem satus) {
        this.satus = satus;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }
    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem it : items) {
            sum = sum + it.subTotal();
        }
        return total();
    }
}
