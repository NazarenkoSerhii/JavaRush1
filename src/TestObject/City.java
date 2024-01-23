package TestObject;

public class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        if(name!=null){
        this.name = name;
        }
        this.temperature = temperature;
    }
    public String getName(){
        return name;
    }
    public int getTemperature(){
        return temperature;
    }
    public void showWeather(City city){
        System.out.println("В городе " + getName() + " сегодня температура воздуха " + getTemperature());
    }
}
