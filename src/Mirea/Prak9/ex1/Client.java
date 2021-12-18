package Mirea.Prak9.ex1;

public class Client {
    String nameClient;
    String TIN;

    public Client(String nameClient, String TIN) {
        this.nameClient = nameClient;
        this.TIN = TIN;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getTIN() {
        return TIN;
    }

    public void setTIN(String TIN) {
        this.TIN = TIN;
    }
}
