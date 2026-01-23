package org.example.BasicsJava.Interface;

interface MobilePhone{
    public void makeCall(String number);
    public void endCall();
}

class SmartPhone implements Camera,MobilePhone,MusicPlayer{
    @Override
    public void makeCall(String number) {
        System.out.println("Making a call on : " + number);
    }

    @Override
    public void endCall() {
        System.out.println("Ending a call....");
    }

    @Override
    public void takePhoto() {
        System.out.println("Take a call....");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record Video....");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing a music....");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping a music....");
    }
}

interface Camera{
    void takePhoto();
    void recordVideo();
}

interface MusicPlayer{
    public void playMusic();
    public void stopMusic();
}

public class MultipleInheritance extends SmartPhone {
    static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("9990009990");
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();
    }
}
