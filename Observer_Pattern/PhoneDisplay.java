package Observer_Pattern;

public class PhoneDisplay implements Observer{
    private String weather;
    public void update(String weather){
        this.weather=weather;
        display();
    }
    public void display(){
        System.out.println("Phone display : " + this.weather);
    }
}
