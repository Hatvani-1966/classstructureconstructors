package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store store1 = new Store("product");
        Store store2 = new Store("p");
        store1.store(10);
        store1.dispatch(9);

        store2.store(5);
        store2.dispatch(2);

        System.out.println(store1.getStock());
        System.out.println(store2.getStock());
    }

}
