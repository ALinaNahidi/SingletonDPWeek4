package com.designpatternweek4;

public class Test {

    private Test() {

    }

    private static Test obj = new Test();

    public static Test getSongletonObject(){
        return obj;
    }


}
