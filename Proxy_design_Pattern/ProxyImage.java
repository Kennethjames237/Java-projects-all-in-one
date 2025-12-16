package Proxy_design_Pattern;

public class ProxyImage implements IImage{
    private String filename;
    private RealImage realimage;
    ProxyImage(String filename){
        this.filename = filename;
        realimage = new RealImage(this.filename);
    }
    public void display(){
        realimage.display();
    }
}
