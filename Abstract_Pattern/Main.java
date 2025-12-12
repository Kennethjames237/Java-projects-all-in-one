package Abstract_Pattern;

public class Main {
    public static void main(String[] args) {
        var America = new NorthAmericaCarFactory();
        America.createCar().displayCar();
        America.createSpecification().dispalySpecifcation();

        var Europe = new EuropeCarFactor();
        Europe.createCar().displayCar();
        Europe.createSpecification().dispalySpecifcation();
        
    }
}
