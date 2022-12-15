package org.designPatterns.factory;

public class LinuxOperatingSystem implements OperatingSystem {
    public LinuxOperatingSystem(String version, String architecture) {
        System.out.println("Linux Operating System created");
    }
}
