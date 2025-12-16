package Proxy_design_Pattern;

public class Client {
    public static void main(String[] args) {
        var image1 = new ProxyImage("School image");
        image1.display(); 

        var image2 = new ProxyImage("family_pic");
        image2.display(); 
    }
}
