package singlylinkedlist.inventorymanagementsystem;
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        //Adding items and displaying
        inventory.addAtBeginning("laptop",101,2,45000);
        inventory.addAtEnd("Phone",202,3,4500);
        inventory.addAtPosition(1,"Speaker",303,4,1200);
        inventory.displayAllItems();

         //Removing by id
        inventory.removeByItemID(202);

        //update quantity
        inventory.updateQuantity(101,4);

        //Calculate total price
        inventory.calculateTotalValue();

        //display after operations
        inventory.displayAllItems();


    }
}














