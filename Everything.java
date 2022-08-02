package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test all methods
    String num = StdIn.readLine();
    int numberOfQueries = Integer.parseInt(num);
    Warehouse warehouse = new Warehouse();

    for (int i = 0; i < numberOfQueries; i++) {
        String query = StdIn.readString();

        if (query.equals("delete")) {
            int id = StdIn.readInt();
            warehouse.deleteProduct(id);
        }

        if (query.equals("add")) {
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();
            warehouse.addProduct(id, name, stock, day, demand);
        }

        if (query.equals("purchase")) {
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            int amount = StdIn.readInt();
            warehouse.purchaseProduct(id, day, amount);
        }

        if (query.equals("restock")) {
            int id = StdIn.readInt();
            int amount = StdIn.readInt();
            warehouse.restockProduct(id, amount);
        }
    }

    StdOut.println(warehouse);
    }
}
