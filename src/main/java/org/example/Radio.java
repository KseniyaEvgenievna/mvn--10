package org.example;

public class Radio {


    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;



    public Radio() {//конструктор пустой
        maxStation = 9;
    }



    public Radio(int StationsCount) {//конструктор
        maxStation = StationsCount -1;
    }


    public void next() {//метод переключения на следующюю станцию
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {//метод переключения на предыдущуюю станцию
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
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