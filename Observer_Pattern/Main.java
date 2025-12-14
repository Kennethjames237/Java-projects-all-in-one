package Observer_Pattern;

public class Main {
    public static void main(String[] args) {
        var station = new WeatherStation();

        var Phone = new PhoneDisplay();
        var TV = new TVDispaly();

    station.addObserver(TV);
    station.addObserver(Phone);

    station.setWeather("Raining outside ...");
    station.setWeather("Snowing outside...");
    station.removeObserver(TV);
    station.setWeather("Dry outside...");
    // System.out.println("hello");
    }
}
