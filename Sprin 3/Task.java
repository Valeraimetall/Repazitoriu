
public class Task {
    private String name;
    private String description;
    private int identifier = Manager.identifier;
    public Status status = Status.NEW;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }


    public void inWork() {
        status = Status.IN_PROGRESS;


    }

    public void done() {
        status = Status.DONE;
    }
}
