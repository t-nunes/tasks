package tasks;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Group front = new Frontend(1, "site");
        Group backEnd = new Backend(1, "api");

        User thiago = new Developer(1, "Thiago Nunes", front);
        User diego = new Developer(1, "Diego Ramos Gomes", backEnd);

        // Cria um projeto
        Project project = new Project(1, "Tasks");

        Task task1 = new Task(1, "Tem que fazer isso!", project);
        tasks.add(task1);
        Task task2 = new Task(1, "Tem que fazer aquilo!", project);
        tasks.add(task2);

        // Adiciona uma lista de usuários
        task1.addUser(thiago);
        task1.addUser(diego);

        // Adiciona um usuário
        task2.addUser(thiago);

        for (Task task : tasks) {
            System.out.println("Tarefa: " + task.getDescription());
            for (User user : task.getUsers()) {
                System.out.println(user.getName() + " - " + user.getGroupName());
            }
            System.out.println("------------------------");
        }
    }
}
