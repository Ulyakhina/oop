package ru.netology.service;
public class Radio {
    private String name;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getMaxStation () {
        return maxStation;
    }

    public void setMaxStation ( int maxStation ) {
        this.maxStation = maxStation;
    }

    public int getMinStation () {
        return minStation;
    }

    public void setMinRadioStation ( int minRadioStation ) {
        this.minStation = minRadioStation;
    }

    public int getCurrentStation () {
        return currentStation;
    }

    public void setCurrentStation ( int currentStation ) {
        if(currentStation>maxStation) {
            return;
        }
        if(currentStation<minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxVolume () {
        return maxVolume;
    }

    public void setMaxVolume ( int maxVolume ) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume () {
        return minVolume;
    }

    public void setMinVolume ( int minVolume ) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume () {
        return currentVolume;
    }

    public void setCurrentVolume ( int currentVolume ) {
        if(currentVolume > maxVolume){
            return;
        }
        if(currentVolume<minVolume){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public boolean isOn () {
        return on;
    }

    public void setOn ( boolean on ) {
        this.on = on;
    }
    public void pressNextStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void pressPlusVolume() {

        setCurrentVolume(currentVolume + 1);
    }

    public void pressMinusVolume() {

        setCurrentVolume(currentVolume - 1);
    }



}
