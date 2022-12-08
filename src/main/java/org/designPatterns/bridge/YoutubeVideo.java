package org.designPatterns.bridge;

public class YoutubeVideo extends Video{
    public YoutubeVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void playVideo(String playVideo) {
        System.out.print("Youtube ");
        videoProcessor.process(playVideo);

    }
}
