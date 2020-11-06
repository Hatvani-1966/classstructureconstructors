package classstructureconstructors;

public class Store {
    String product;
    int stock;

    public Store(String product) {
        this.stock = 0;
        this.product = product;
    }

    public void store(int x){
        this.stock += x;
    }

    public void dispatch (int x){
        this.stock -= x;
    }

    public int getStock() {
        return stock;
    }
}
