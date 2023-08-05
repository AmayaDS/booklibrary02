import java.util.ArrayList;

public class Library {
    //the variable books will be an ArrayList that can hold objects of the Book.
    private ArrayList<Book> books;

    //constructor
    public Library(){
        //constructor for the array list
        books = new ArrayList<>(Book);

        //adding books
        public void addBooks(Book book){
            books.add(book);
        }

        public void removeBooks(Book book){

        }

    }
}
