package org.designPatterns.bridge;

public class NetflixVideo extends Video{

    public NetflixVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void playVideo(String playVideo) {
        videoProcessor.process(playVideo);

    }
}
