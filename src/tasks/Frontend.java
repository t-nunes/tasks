package tasks;

public class Frontend implements Group {
    private int id;
    private String name;

    public Frontend(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
