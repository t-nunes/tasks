package tasks;

public class Task {
    private int id;
    private String description;
    private User user;
    private Project project;

    public Task(int id, String description, User user, Project project) {
        this.id = id;
        this.description = description;
        this.user = user;
        this.project = project;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public Project getProject() {
        return project;
    }
}
