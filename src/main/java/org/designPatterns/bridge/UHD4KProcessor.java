package org.designPatterns.bridge;

public class UHD4KProcessor implements VideoProcessor{
    @Override
    public void process(String fileName) {
        System.out.println("processing UHD4K video");

    }
}
