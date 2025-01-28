package circularlinkedlist.roundrobin;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        // Adding processes to the circular queue
        queue.addProcess(1, 10, 3);
        queue.addProcess(2, 5, 1);
        queue.addProcess(3, 8, 2);
        queue.addProcess(4, 12, 4);

        int timeQuantum = 4;  // Time quantum for Round Robin scheduling

        // Display initial processes in the queue
        queue.displayProcesses();

        // Perform Round Robin Scheduling
        queue.roundRobinScheduling(timeQuantum);
    }
}