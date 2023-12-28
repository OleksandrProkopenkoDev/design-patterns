package ua.spro.designpatternsdemo.bridge.tv;

public class Sony extends Tv{

    private final Remote remoteType;

    public Sony(Remote remote){
        super(remote);
        this.remoteType = remote;
    }

    @Override
    void on() {
        System.out.print("Sony Tv ON: ");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.print("Sony Tv OFF: ");
        remoteType.off();
    }
}
