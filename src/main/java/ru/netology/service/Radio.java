package ru.netology.service;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentRadioStation = minStation;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentRadioVolume = minVolume;
    private int currentStation;
    private int currentVolume;

    public Radio(int anotherStation) {
        minStation = 0;
        maxStation = anotherStation - 1;
        currentRadioStation = currentStation;

        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        currentRadioVolume = currentVolume;
    }

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void nextVolume() {
        currentVolume = currentVolume + 1;
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void prevVolume() {
        currentVolume = currentVolume - 1;
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
    }

}
