package doublylinkedlist.librarymanagementsystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        //Adding books
        library.addBookAtBeginning("Hello","Naman","lofi",101,true);
        library.addBookAtEnd("Ramayana","valmiki","God",202,true);
        library.addBookAtPosition("TempBook2","om","music",303,true,1);
        library.addBookAtPosition("Tempbokk3","ishaan","movie",404,true,2);
        library.addBookAtPosition("temopbbok4","harsh","sports",505,true,3);

        //Remove book by id
        library.removeBookById(202);
        //search by title
        library.searchBook("hello","naman");

        //update Availability
        library.updateBookAvailability(202,false);

        //display all books
        library.displayForward();
        library.displayReverse();




    }
}