package stacksandqueues.circulartourproblem;

public class Main{
public static void main(String[] args) {
    PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
    };

    int start = CircularTour.findStartingPoint(pumps);
    if (start != -1) {
        System.out.println("Start at petrol pump: " + start);
    } else {
        System.out.println("No solution possible");
    }
}
}