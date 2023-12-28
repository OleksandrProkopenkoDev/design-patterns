package ua.spro.designpatternsdemo.adapter.drivers;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WebDriverAdapter implements WebDriver{

    private IeDriver ieDriver;

    @Override
    public void getElement() {
        ieDriver.findElement();
    }

    @Override
    public void selectElement() {
        ieDriver.clickElement();
    }
}
