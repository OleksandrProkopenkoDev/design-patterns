package ua.spro.designpatternsdemo.facade;

public class FacadeMain {
    public static void main(String[] args) {
        MultimediaFacade facade = new MultimediaFacade();
        facade.playMultimedia();
    }
}
