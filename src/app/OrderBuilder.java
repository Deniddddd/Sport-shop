package app;

class OrderBuilder {
    private Tshirt tshirt;
    private Cap cap;

    public OrderBuilder() {}

    public OrderBuilder addTshirt(Tshirt tshirt) {
        this.tshirt = tshirt;
        return this;
    }

    public OrderBuilder addCap(Cap cap) {
        this.cap = cap;
        return this;
    }

    public void printOrderDetails() {
        System.out.println("Футболка: " + tshirt.getColor() + ", " + tshirt.getManufacturer());
        System.out.println("Кепка: " + cap.getColor() + ", " + cap.getManufacturer());
        System.out.println("Загальна вартість: " + calculateTotalPrice());
    }

    private double calculateTotalPrice() {
        return 10 * 2;
    }
}
