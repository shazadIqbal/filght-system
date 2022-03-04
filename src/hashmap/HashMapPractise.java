package hashmap;

import javafx.scene.layout.VBox;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractise {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Oxford", "xyz","abc");
        Book book2 = new Book(2, "Grammar Tree", "xyz","abc");
        Book book3 = new Book(3, "PST", "xyz","abc");

        Map<Integer, Book> map = new HashMap<>();
        map.put(1,book1);
        map.put(2,book2);
        map.put(3,book3);

        for(Map.Entry<Integer, Book> entry:map.entrySet()){
            int key = entry.getKey();
            Book book = entry.getValue();
            System.out.println("Details of key: "+key);
            System.out.println("Book Name: "+book.name+" Author Name: "+book.author+" Publisher Name: "+book.publisher);
        }
    }
}
