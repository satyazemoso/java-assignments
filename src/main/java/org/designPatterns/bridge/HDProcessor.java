package org.designPatterns.bridge;

public class HDProcessor implements VideoProcessor{
    @Override
    public void process(String fileName) {
        System.out.print("processing HD Video");

    }
}
