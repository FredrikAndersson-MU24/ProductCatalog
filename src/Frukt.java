public class Frukt extends product {

    private String expirationDate;

    public Frukt(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String toString(){
        return super.toString() + ", expirationDate=" + expirationDate + ",";
    }
}

