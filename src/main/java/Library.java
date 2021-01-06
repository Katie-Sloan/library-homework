import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(){
        this.collection = new ArrayList<Book>();
        this.capacity = 5;
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void add(Book book) {
        if (this.bookCount() < this.capacity) {
            this.collection.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean stockCheck() {
        return this.bookCount() >= this.capacity;
    }
}
