package ua.spro.designpatternsdemo.adapter.drivers;

public class ChromeDriver implements WebDriver{
    @Override
    public void getElement() {
        System.out.println("Get element from Chrome driver");
    }

    @Override
    public void selectElement() {
        System.out.println("Select element from Chrome driver");
    }
}
