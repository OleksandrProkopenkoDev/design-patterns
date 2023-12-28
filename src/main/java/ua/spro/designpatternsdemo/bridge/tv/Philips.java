package ua.spro.designpatternsdemo.bridge.tv;

public class Philips extends Tv{

    private final Remote remoteType;

    public Philips(Remote remote){
        super(remote);
        this.remoteType = remote;
    }

    @Override
    void on() {
        System.out.print("Philips Tv ON: ");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.print("Philips Tv OFF: ");
        remoteType.off();
    }
}
