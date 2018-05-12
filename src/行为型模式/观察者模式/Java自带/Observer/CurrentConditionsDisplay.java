package 行为型模式.观察者模式.Java自带.Observer;

import 行为型模式.观察者模式.Java自带.Subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);       //登记观察者
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData=(WeatherData)o;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("current tempature："+temperature+"F degrees and "+humidity+"% humidity");
    }
}
