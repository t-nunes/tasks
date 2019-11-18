package tasks;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Group front = new Frontend(1, "site");
        Group backEnd = new Backend(1, "api");

        User thiago = new Developer(1, "Thiago Nunes", front);
        User diego = new Developer(1, "Diego Ramos Gomes", backEnd);

        // Cria um projeto
        Project project = new Project(1, "Tasks");

        Task task1 = new Task(1, "Tem que fazer isso!", project);
        Task task2 = new Task(1, "Tem que fazer aquilo!", project);

        // Adiciona uma lista de usuários
        task1.addUser(thiago);
        task1.addUser(diego);

        // Adiciona um usuário
        task2.addUser(thiago);
    }
}
