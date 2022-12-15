package org.designPatterns.bridge;

public class Main {
    public static void main(String args[]){
        Video youtubeVideo = new YoutubeVideo(new HDProcessor());
        youtubeVideo.playVideo("test video");
    }
}
