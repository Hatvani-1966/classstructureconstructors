package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("title","dertsa");
        book.register("234");
        System.out.println(book.getTitle());



    }
}
