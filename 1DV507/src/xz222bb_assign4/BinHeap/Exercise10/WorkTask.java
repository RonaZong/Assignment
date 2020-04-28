package xz222bb_assign4.BinHeap.Exercise10;

public class WorkTask implements Task{
    private int priority;
    private String description;

    public WorkTask() {
    }

    public WorkTask(int priority, String description) {
        checkPriority(priority);
        this.priority = priority;
        this.description = description;
    }


    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public void checkPriority(int priority) {
        if (priority <= 0) {
            throw new IllegalArgumentException("The priority should be positive number");
        }
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.priority + "\t" + this.description;
    }
}
