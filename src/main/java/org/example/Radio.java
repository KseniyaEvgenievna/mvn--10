package org.example;

public class Radio {


    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int minVolume;
    private int maxVolume;


public Radio() {//конструктор пустой
        maxStation = 9;
    }

    public Radio(int StationsCount) {//конструктор
        maxStation = StationsCount -1;
    }

    public void next() {//метод переключения на следующю станцию
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {//метод переключения на предыдущую станцию
        if (currentStation != MinStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < maxStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {//метод для увеличения звука
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);

        }
    }

    public void reduceVolume() {//метод для уменьшения звука
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}