package airport;

import airport.model.Plane;
import airport.servise.AirportServise;

public class AirportTest {
    public static void main(String[] args) {
        AirportServise servise=new AirportServise();
        Plane plane=servise.createPlane();
        Plane plane2=servise.createPlane();
        Plane plane3=servise.createPlane();
        Plane [] planes={plane,plane3,plane2};
        System.out.println("--------------------------------");
        plane.printInfo();
        System.out.println("--------------------------------");
        servise.printNameAndReleaseDate(plane);
        System.out.println("--------------------------------");
        servise.printNameOrHours(plane);
        System.out.println("--------------------------------");
        System.out.println(servise.nameOfPlaneWithBiggerTime(plane, plane2));
        System.out.println("----------------");
        servise.planeWithBiggerName(plane,plane2).printInfo();
        System.out.println("--------------------------------");
        servise.printPlaneArray(planes);
        System.out.println("--------------------------------");
        servise.printMilitaryPlanesAfter2010(planes);
        System.out.println("--------------------------------");
        servise.maxHoursInAir(planes).printInfo();
        System.out.println("--------------------------------");
        servise.printOldestPlane(planes);
        System.out.println("--------------------------------");
        servise.printNewestMilitary(planes);
        System.out.println("--------------------------------");
        servise.sortByReleaseYear(planes);
    }
}
