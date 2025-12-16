package Proxy_design_Pattern;

public class RealImage implements IImage {
    private String filename;
    
    RealImage(String filename){
        this.filename = filename;
        loadImageFromDisk();
    }
    public void loadImageFromDisk(){
        System.out.println("laoding image "+ this.filename +" from disk...");
    }
    @Override
    public void display(){
        System.out.println("Displaying image : " + this.filename);
    }
}
