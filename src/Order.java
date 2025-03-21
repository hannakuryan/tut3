public class Order {
    private int id;
    private Customer customer;
    private Product[] products;
    private int[] quantities;
    private String orderDate;
    private String orderTime;
    private String status;

    public Order(int id, Customer customer, Product[] products, int[] quantities) {
        this.id = id;
        this.customer = customer;
        this.products = new Product[]{products[0]};
        this.quantities = quantities;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int[] getQuantities() {
        return quantities;
    }

    public void setQuantities(int[] quantities) {
        this.quantities = quantities;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double calculateTotalValue() {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total = total + products[i].getPrice() * quantities[i];
        }
        return total;
    }

    public double applyDiscount() {
        double total = calculateTotalValue();
        if (customer.isLoyalCustomer()){
            total *= 0.9;
        }
        return total;
    }

    public void displayDetails(){
        System.out.println("Customer ID: " + customer.getId());
    }

}
