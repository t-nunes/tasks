package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private int id;
    private String description;
    private List<User> users;
    private Project project;

    public Task(int id, String description, Project project) {
        this.id = id;
        this.description = description;
        this.project = project;
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Project getProject() {
        return project;
    }
}
