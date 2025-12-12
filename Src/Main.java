
public class Main {

  public static void main(String[] args) {
    BehaviorA A = new BehaviorA();
    BehaviorB B = new BehaviorB();
    Client client = new Client(A);
    Client client2 = new Client(B);
    client.execute();
    client2.execute();

  }

}
