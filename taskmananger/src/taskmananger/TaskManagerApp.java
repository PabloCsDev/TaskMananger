package taskmananger;

import java.util.Scanner;



public class TaskManagerApp {
    public static void main(String[] args) {
    	Mananger taskManager = new Mananger();
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    System.out.println("\nEscolha uma opção:");
			    System.out.println("1. Adicionar tarefa");
			    System.out.println("2. Listar tarefas");
			    System.out.println("3. Marcar tarefa como concluída");
			    System.out.println("4. Remover tarefa"); 
			    System.out.println("5. Sair");

			    int choice = scanner.nextInt();
			    scanner.nextLine(); 

			    switch (choice) {
			        case 1:
			            System.out.print("Digite o nome da tarefa: ");
			            String taskName = scanner.nextLine();
			            taskManager.addTask(taskName);
			            break;

			        case 2:
			            System.out.println("Lista de Tarefas:");
			            taskManager.listTasks();
			            break;

			        case 3:
			            System.out.print("Digite o número da tarefa a ser marcada como concluída: ");
			            int taskIndex = scanner.nextInt();
			            taskManager.markTaskAsDone(taskIndex);
			            break;

			        case 4:
			            System.out.print("Digite o número da tarefa a ser removida: ");
			            int removeIndex = scanner.nextInt();
			            taskManager.removeTask(removeIndex);
			            break;

			        case 5:
			            System.out.println("Saindo do aplicativo.");
			            System.exit(0);

			        default:
			            System.out.println("Opção inválida.");
			    }
			}
		}
    }
}
