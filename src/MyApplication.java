import models.Point;
import models.Shape;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\cat41\\IdeaProjects\\Assignment1\\src\\source");

        Scanner sc = new Scanner(file);
        ArrayList<Point> pointsList = new ArrayList<>();

        while (sc.hasNext()){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x,y);
            pointsList.add(point);
        }

        Point[] pointsArray = pointsList.toArray(new Point[0]);
        Shape shape = new Shape(pointsArray);

        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("AverageSide: " + shape.getAverageSide());
        System.out.println("LongestSide: " + shape.getLongestSide());
    }
}
