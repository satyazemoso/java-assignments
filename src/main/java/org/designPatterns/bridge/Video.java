package org.designPatterns.bridge;

public abstract class Video {
    protected VideoProcessor videoProcessor;
    public Video(VideoProcessor videoProcessor){
        this.videoProcessor = videoProcessor;
    }
    public abstract void playVideo(String playVideo);
}
