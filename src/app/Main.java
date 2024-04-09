package app;

public class Main {
    public static void main(String[] args) {
        Tshirt redTshirt = new Tshirt("червона", "Active sports");
        Tshirt blueTshirt = new Tshirt("синя", "Active sports");
        Cap whiteCap = new Cap("біла", "Smart caps");
        Cap blackCap = new Cap("чорна", "Smart caps");

        OrderBuilder orderA = new OrderBuilder()
                .addTshirt(redTshirt)
                .addCap(whiteCap);

        OrderBuilder orderB = new OrderBuilder()
                .addTshirt(blueTshirt)
                .addCap(blackCap);
        System.out.println("Деталі замовлення A:");
        orderA.printOrderDetails();
        System.out.println("\nДеталі замовлення B:");
        orderB.printOrderDetails();
    }
}
