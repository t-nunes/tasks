package tasks;

public class Developer implements User {
    private int id;
    private String name;
    private Group group;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGroupName() {
        return group.getName();
    }
}
