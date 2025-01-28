package doublylinkedlist.undoredofunctionality;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor(10);

        editor.addState("hii");
        editor.addState("hello");
        editor.addState("my");
        editor.addState("name");
        editor.addState("is");
        editor.addState("naman");
        editor.addState("gurjar");

        editor.undo();
        editor.redo();

        editor.displayCurrentState();

        }
}