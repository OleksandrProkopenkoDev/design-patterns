package ua.spro.designpatternsdemo.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("mountains.jpg");
        proxyImage.display();
    }
}
