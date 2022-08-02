package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test purchaseProduct
    String num = StdIn.readLine();
    int numberOfQueries = Integer.parseInt(num);
    Warehouse warehouse = new Warehouse();

    for (int i = 0; i < numberOfQueries; i++) {
        String query = StdIn.readString();

        if (query.equals("purchase")) {
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            int amount = StdIn.readInt();
            warehouse.purchaseProduct(id, day, amount);
        }

        if (query.equals("add")) {
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();
            warehouse.addProduct(id, name, stock, day, demand);
        }
    }

    StdOut.println(warehouse);
    }
}
