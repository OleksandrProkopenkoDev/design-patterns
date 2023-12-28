package ua.spro.designpatternsdemo.adapter.drivers;

public class Client {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.getElement();
        chromeDriver.selectElement();

        IeDriver ieDriver = new IeDriver();
        ieDriver.findElement();
        ieDriver.clickElement();

        WebDriver webDriver = new WebDriverAdapter(ieDriver);
        webDriver.getElement();
        webDriver.selectElement();
    }
}
