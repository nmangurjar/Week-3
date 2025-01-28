package circularlinkedlist.taskscheduler;


class CircularTaskScheduler {
    private Task head;
    private Task current;

    public CircularTaskScheduler() {
        head = null;
        current = null;
    }

    // Add at the beginning
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newTask.next = head;
            head = newTask;
            temp.next = head;
        }
    }

    // Add at the end
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Add at a specific position
    public void addTaskAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position <= 0) {
            System.out.println("Position should be greater than 0.");
            return;
        }

        Task newTask = new Task(taskId, taskName, priority, dueDate);

        if (position == 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        Task temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        if (count < position - 1) {
            System.out.println("Position out of bounds, adding at the end.");
            addTaskAtEnd(taskId, taskName, priority, dueDate);
        } else {
            newTask.next = temp.next;
            temp.next = newTask;
        }
    }

    // Remove by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Task temp = head;
        Task prev = null;

        do {
            if (temp.taskId == taskId) {
                if (temp == head && temp.next == head) {
                    // Only one node in the list
                    head = null;
                } else if (temp == head) {
                    // Removing the head node
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    // Removing other nodes
                    prev.next = temp.next;
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task with ID " + taskId + " not found.");
    }

    // View the current task and move to the next task
    public void viewAndMoveToNextTask() {
        if (current == null) {
            if (head == null) {
                System.out.println("No tasks available.");
                return;
            }
            current = head;
        }
        System.out.println("Current Task: " + current);
        current = current.next;
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head;
        System.out.println("All Tasks:");
        do {
            System.out.println(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search  by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head;
        boolean found = false;
        System.out.println("Tasks with Priority " + priority + ":");
        do {
            if (temp.priority == priority) {
                System.out.println(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with Priority " + priority + ".");
        }
    }
}
