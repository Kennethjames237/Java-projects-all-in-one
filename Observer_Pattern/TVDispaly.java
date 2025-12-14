package Observer_Pattern;

public class TVDispaly implements Observer{
      private String weather;
    public void update(String weather){
        this.weather=weather;
        display();
    }
    public void display(){
        System.out.println("TV display: " + this.weather);
    }
}
