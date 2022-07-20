package airport.servise;

import airport.model.Plane;

import java.util.Scanner;

public class AirportServise {
    public Plane createPlane() {
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter name of the plane");
        plane.setName(s.next());
        System.out.println("Enter hours in air");
        plane.setHoursInAir(s.nextInt());
        System.out.println("Enter release year");
        plane.setReleaseYear(s.nextInt());
        System.out.println("Is Military plane? Y or N");
        String m = s.next();
        plane.setMilitary(m.charAt(0) == 'Y' || m.charAt(0) == 'y');
        return plane;
    }

    public void printNameAndReleaseDate(Plane plane) {
        System.out.println(plane.getName() + "," + plane.getReleaseYear());
    }

    public void printNameOrHours(Plane plane) {
        if (plane.getReleaseYear() > 2000) {
            System.out.println(plane.getName());
        } else {
            System.out.println(plane.getHoursInAir());
        }
    }

    public String nameOfPlaneWithBiggerTime(Plane plane1, Plane plane2) {
        if (plane1.getHoursInAir() > plane2.getHoursInAir()) {
            return plane1.getName();
        } else {
            return plane2.getName();
        }
    }

    public Plane planeWithBiggerName(Plane plane1, Plane plane2) {
        if (plane1.getName().length() > plane2.getName().length()) {
            return plane1;
        } else {
            return plane2;
        }
    }

    public void printPlaneArray(Plane[] planes) {
        for (Plane x : planes) {
            x.printInfo();
        }
    }

    public void printMilitaryPlanesAfter2010(Plane[] planes) {
        for (Plane x : planes) {
            if (x.isMilitary() && x.getReleaseYear() > 2010) {
                x.printInfo();
            }
        }
    }

    public Plane maxHoursInAir(Plane[] planes) {
        Plane max = planes[0];
        for (Plane plane : planes) {
            if (plane.getHoursInAir() > max.getHoursInAir()) {
                max = plane;
            }
        }
        return max;
    }

    public void printOldestPlane(Plane[] planes) {
        Plane min = planes[0];
        for (Plane plane : planes) {
            if (plane.getReleaseYear() < min.getReleaseYear()) {
                min = plane;
            }
        }
        min.printInfo();
    }

    public void printNewestMilitary(Plane[] planes) {
        Plane max = planes[0];
        for (Plane value : planes)
            if (value.isMilitary()) {
                max = value;
                break;
            }
        for (Plane plane : planes) {
            if (plane.getHoursInAir() > max.getHoursInAir() && plane.isMilitary()) {
                max = plane;
            }
        }
        max.printInfo();
    }

    public void sortByReleaseYear(Plane[] planes) {
        boolean when = true;
        int count=0;
        while (when){
            when=false;
            for (int j = 0; j < planes.length-1-count; j++) {
                if (planes[j].getReleaseYear()>planes[j+1].getReleaseYear()){
                    Plane p=planes[j];
                    planes[j]=planes[j+1];
                    planes[j+1]=p;
                    when=true;
                }
            }
            count++;
        }
        printPlaneArray(planes);
    }
}
