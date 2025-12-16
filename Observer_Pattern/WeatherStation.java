package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> list = new ArrayList<Observer>();
    private String weather;

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(this.weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObserver();
    }
}