package circularlinkedlist.taskscheduler;

public class Main {
    public static void main(String[] args) {
        CircularTaskScheduler scheduler = new CircularTaskScheduler();

        // Adding tasks
        scheduler.addTaskAtEnd(1, "Task A", 1, "2025-01-30");
        scheduler.addTaskAtEnd(2, "Task B", 2, "2025-02-15");
        scheduler.addTaskAtBeginning(3, "Task C", 1, "2025-02-01");
        scheduler.addTaskAtPosition(2, 4, "Task D", 3, "2025-02-10");

        // Display all tasks
        scheduler.displayAllTasks();

        // View and move to the next task
        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();

        // Search by priority
        scheduler.searchByPriority(1);


        // Remove a task
        scheduler.removeTaskById(2);

        // Display all tasks again
        scheduler.displayAllTasks();
    }
}
