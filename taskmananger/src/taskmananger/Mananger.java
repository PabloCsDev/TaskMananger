package taskmananger;

import java.util.ArrayList;
import java.util.List;

public class Mananger {
    private List<Task> tasks;

    public Mananger() {
        tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        Task task = new Task(taskName);
        tasks.add(task);
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void markTaskAsDone(int taskIndex) {
        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
            tasks.get(taskIndex - 1).markAsDone();
        } else {
            System.out.println("Índice de tarefa inválido.");
        }
    }

    public void removeTask(int taskIndex) {
        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
            tasks.remove(taskIndex - 1);
        } else {
            System.out.println("Índice de tarefa inválido.");
        }
    }
}
