package org.example;

public class Radio {


    private int currentStation;
    private int currentVolume;


    public void next() {//метод переключения на следующю станцию
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {//метод переключения на предыдущую станцию
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {//метод для увеличения звука
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);

        }
    }

    public void reduceVolume() {//метод для уменьшения звука
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}