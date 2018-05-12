package 行为型模式.观察者模式;

import 行为型模式.观察者模式.Observer.CurrentConditionsDisplay;
import 行为型模式.观察者模式.Subject.WeatherData;

public class test {
    public static void main(String argv[]){
        //自己实现
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasureMentrs(80,65,30.4f);
        weatherData.setMeasureMentrs(82,70,29.2f);

        //Java自带
        行为型模式.观察者模式.Java自带.Subject.WeatherData temp=new 行为型模式.观察者模式.Java自带.Subject.WeatherData();
        行为型模式.观察者模式.Java自带.Observer.CurrentConditionsDisplay temp1=new 行为型模式.观察者模式.Java自带.Observer.CurrentConditionsDisplay(temp);
        temp.setMeasureMentrs(80,65,30.4f);
        temp.setMeasureMentrs(82,70,29.2f);
    }
}
