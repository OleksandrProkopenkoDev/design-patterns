package ua.spro.designpatternsdemo.flyweight.general_example;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key){
        flyweights.putIfAbsent(key, new ConcreteFlyweight(key));
        return flyweights.get(key);
    }
}
