package circularlinkedlist.taskscheduler;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }


    public String toString() {
        return "Task ID: " + taskId + ", Name: " + taskName + ", Priority: " + priority + ", Due Date: " + dueDate;
    }
}
