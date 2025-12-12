package Strategie;
public class Client {
    private IBehavior behavior;
    public Client(IBehavior ib){
        this.behavior = ib;
    }
    public void execute(){
        behavior.run();
    }
}


