public class Toy {
    private int number;
    private String name;
    private int quantity;
    private double weight;

    public Toy(int number, String name, int quantity, double weight) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}