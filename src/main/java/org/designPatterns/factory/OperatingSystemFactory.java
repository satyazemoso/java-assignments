package org.designPatterns.factory;

public class OperatingSystemFactory {
    private OperatingSystemFactory(){}
    public static OperatingSystem getInstance(String type,String version,String architecture){
        switch(type){
            case "WINDOWS":{
                return new WindowsOperatingSystem(version,architecture);
            }
            case "LINUX":{
                return new LinuxOperatingSystem(version,architecture);
            }
            default:{
                throw new IllegalArgumentException("OS not supported");
            }
        }
    }
    public static void main(String args[]){
        OperatingSystem operatingSystem = OperatingSystemFactory.getInstance("WINDOWS","2.0","test architecture");
    }
}
