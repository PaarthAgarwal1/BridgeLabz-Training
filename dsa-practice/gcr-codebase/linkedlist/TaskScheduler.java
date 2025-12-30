// Node representing a Task
class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int id, String name, int priority, String date) {
        this.taskId = id;
        this.taskName = name;
        this.priority = priority;
        this.dueDate = date;
        this.next = null;
    }
}

public class TaskScheduler {
    private TaskNode head = null;
    private TaskNode tail = null;
    private TaskNode current = null;

    // Add task at beginning
    public void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = tail = current = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }

    // Add task at end
    public void addAtEnd(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = tail = current = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Add task at specific position (1-based)
    public void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, priority, date);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode newNode = new TaskNode(id, name, priority, date);
        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }

    // Remove task by ID
    public void removeTask(int id) {
        if (head == null) {
            System.out.println("No tasks to remove.");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = tail;

        do {
            if (temp.taskId == id) {

                // Single node case
                if (head == tail) {
                    head = tail = current = null;
                } else {
                    if (temp == head) {
                        head = head.next;
                        tail.next = head;
                    } else if (temp == tail) {
                        tail = prev;
                        tail.next = head;
                    } else {
                        prev.next = temp.next;
                    }

                    if (current == temp) {
                        current = temp.next;
                    }
                }

                System.out.println("Task removed: " + id);
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found!");
    }

    // View current task and move to next
    public void viewAndMove() {
        if (current == null) {
            System.out.println("No tasks scheduled.");
            return;
        }

        System.out.println("Current Task -> ID: " + current.taskId +
                ", Name: " + current.taskName +
                ", Priority: " + current.priority +
                ", Due: " + current.dueDate);

        current = current.next;
    }

    // Display all tasks
    public void displayAll() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head;
        System.out.println("All Tasks:");

        do {
            System.out.println("ID: " + temp.taskId +
                    ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority +
                    ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                System.out.println("Found -> ID: " + temp.taskId +
                        ", Name: " + temp.taskName +
                        ", Due: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with priority: " + priority);
        }
    }

    // Main method (Demo)
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(1, "Fix Bug", 1, "2025-01-10");
        scheduler.addAtEnd(2, "Write Tests", 2, "2025-01-11");
        scheduler.addAtBeginning(3, "Design Module", 1, "2025-01-09");

        scheduler.displayAll();

        System.out.println();
        scheduler.viewAndMove();
        scheduler.viewAndMove();

        System.out.println();
        scheduler.searchByPriority(1);

        System.out.println();
        scheduler.removeTask(2);

        System.out.println();
        scheduler.displayAll();
    }
}
