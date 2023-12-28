package ua.spro.designpatternsdemo.facade;

public class MultimediaFacade {
    private final AudioPlayer audioPlayer;
    private final VideoPlayer videoPlayer;
    private final Projector projector;

    public MultimediaFacade(){
        audioPlayer = new AudioPlayer();
        videoPlayer = new VideoPlayer();
        projector = new Projector();
    }

    public void playMultimedia(){
        audioPlayer.playAudio();
        videoPlayer.playVideo();
        projector.display();
    }
}
