class Task {

    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int id, String name, String status) {
        taskId = id;
        taskName = name;
        this.status = status;
    }
}

public class TaskManagementSystem {

    Task head = null;

    void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newTask;
    }

    void traverse() {

        Task temp = head;

        while (temp != null) {

            System.out.println(temp.taskId + " "
                    + temp.taskName + " "
                    + temp.status);

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        TaskManagementSystem tms = new TaskManagementSystem();

        tms.addTask(1, "Design", "Pending");
        tms.addTask(2, "Coding", "In Progress");

        tms.traverse();
    }
}