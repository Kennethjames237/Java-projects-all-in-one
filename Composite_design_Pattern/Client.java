package Composite_design_Pattern;

public class Client {
    public static void main(String[] args) {
        var task1 = new SimpleTask("learn");
        var task2 = new SimpleTask("Go to school");
        var task3 = new SimpleTask("Have your degree");

        var tasklist = new TaskList("list of task to be done.");
        tasklist.addTask(task1);
        tasklist.addTask(task2);
        tasklist.addTask(task3);

        tasklist.display();
    }
    
}
