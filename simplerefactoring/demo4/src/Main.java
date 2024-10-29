import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<String> taskList;

    public Main() {
        taskList = new ArrayList<>();
    }

    public void addTask(String task) {
        taskList.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask(String task) {
        if (taskList.contains(task)) {
            taskList.remove(task);
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    public void listTasks() {
        System.out.println("Task List:");
        for (String task : taskList) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        tugas4 taskManager = new tugas4();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    taskManager.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task to remove: ");
                    task = scanner.nextLine();
                    taskManager.removeTask(task);
                    break;
                case 3:
                    taskManager.listTasks();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
