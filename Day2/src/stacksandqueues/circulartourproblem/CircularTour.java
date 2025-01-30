package stacksandqueues.circulartourproblem;
import java.util.LinkedList;
import java.util.Queue;
public class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int start = 0, end = 0, currentPetrol = 0;
        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            currentPetrol += pumps[end].petrol - pumps[end].distance;
            queue.add(end);

            while (currentPetrol < 0 && !queue.isEmpty()) {
                start = queue.poll();
                currentPetrol -= pumps[start].petrol - pumps[start].distance;
                start++;
            }

            end = (end + 1) % pumps.length;

            if (start == 0 && end == 0 && currentPetrol >= 0) {
                return start;
            }

            if (start >= pumps.length) {
                return -1;
            }
        }
    }
}