package ua.spro.designpatternsdemo.bridge.tv;

public abstract class Tv {
    Remote remote;

    Tv(Remote remote){
        this.remote = remote;
    }

    abstract void on();
    abstract void off();
}
