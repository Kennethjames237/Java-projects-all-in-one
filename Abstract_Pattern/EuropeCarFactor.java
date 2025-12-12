package Abstract_Pattern;

public class EuropeCarFactor implements CarFactory{
     public Car createCar(){
          return new Hatchback();
     }
     public CarSpecification createSpecification(){
          return new EuropeSpec();
     }
}
