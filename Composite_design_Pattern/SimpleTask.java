package Composite_design_Pattern;

public class SimpleTask implements ITask {
    private String title;

    SimpleTask(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Simple task title : " + this.title);
    }
}
