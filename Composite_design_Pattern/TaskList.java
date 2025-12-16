package Composite_design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements ITask {
    private List<ITask> tasks;
    private String title;

    TaskList(String title) {
        this.tasks = new ArrayList<>();
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
        System.out.println("Task list : " + this.title);
        for(ITask task : tasks){
            task.display();
        }
    }
    public void addTask(ITask task){
        this.tasks.add(task);
    }
    public void removeTask(ITask task){
        this.tasks.remove(task);
    }
}
