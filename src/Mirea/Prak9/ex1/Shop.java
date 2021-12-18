package Mirea.Prak9.ex1;
import java.util.ArrayList;
public class Shop {
    static ArrayList<Client> buyers = new ArrayList<>();

    // Simulate the work of the database
    public static void setBuyers() {
        buyers.add(new Client("A", "123898139324"));
        buyers.add(new Client("B", "154682397931"));
        buyers.add(new Client("C", "2145799347561"));
        buyers.add(new Client("D", "2349543756499"));
        buyers.add(new Client("E", "743262478313"));
    }

    public static void buy(Client buyer) throws TINException {

        Client tmp = null;

        for (Client i : buyers) {
            if (i.getNameClient().equals(buyer.getNameClient())) {
                tmp = i;
            }
        }
        // Throw an exception if TIN is invalid
        assert tmp != null;
        if (!buyer.getTIN().equals(tmp.getTIN())) {
            throw new TINException("Bad TIN");
            // Otherwise, the purchase was made
        } else {
            System.out.println("Purchase made!");
        }

    }

    public static void main(String[] args) {
        setBuyers();
        Client me = new Client("A", "123898139324");
        try {
            buy(me);
            // Catch the error
        } catch (TINException e) {
            e.printStackTrace();
        }
    }
}
