package cdapp;
public class Customer {
 String name;
private String[]order;
private double ordercost;
private String telephone;

    public Customer(String name, String[] order, double ordercost, String telephone) {
        this.name = name;
        this.order = order;
        this.ordercost = ordercost;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getOrder() {
        return order;
    }

    public void setOrder(String[] order) {
        this.order = order;
    }

    public double getOrdercost() {
        return ordercost;
    }

    public void setOrdercost(double ordercost) {
        this.ordercost = ordercost;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

     public String tostring(){
        return (this.name + " " + this.telephone + " " + this.order + " " + this.ordercost);
    }

    

}
