package TaskManagementSystem;

public class SinglyLinkedList {
    private Node head;

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteTask(String taskId) {
        if (head == null) {
            return;
        }

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();
        taskList.addTask(new Task("T1", "Task 1", "Pending"));
        taskList.addTask(new Task("T2", "Task 2", "Completed"));
        taskList.addTask(new Task("T3", "Task 3", "In Progress"));

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching for Task T2:");
        Task t = taskList.searchTask("T2");
        if (t != null) {
            System.out.println(t);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task T3:");
        taskList.deleteTask("T3");
        taskList.traverseTasks();
    }
}
