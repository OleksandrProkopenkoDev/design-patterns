package ua.spro.designpatternsdemo.adapter.simple;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Adapter implements Target{

    private Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specifiedRequest();
    }
}
