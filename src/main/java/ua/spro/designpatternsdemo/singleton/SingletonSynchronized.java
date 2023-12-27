package ua.spro.designpatternsdemo.singleton;

public class SingletonSynchronized {

    private SingletonSynchronized instance;

    private SingletonSynchronized(){}

    public SingletonSynchronized getInstance() {
        if(instance == null){
            synchronized (SingletonSynchronized.class){
                if(instance == null){
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}
