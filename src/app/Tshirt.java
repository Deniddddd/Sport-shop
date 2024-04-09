package app;

class Tshirt {
    private String color;
    private String manufacturer;

    public Tshirt(String color, String manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
