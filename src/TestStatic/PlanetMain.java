package TestStatic;

import ua.javarush.task.pro.task11.task1101.SolarSystem;

public class PlanetMain {
    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name="Earth";
        earth.age=4_540_000_000L;
        earth.speed=170_218;
        earth.area=510_072_000;
        earth.printInformationPlanet();
        System.out.println("========================");
        System.out.println(earth.toString());

    }
}
