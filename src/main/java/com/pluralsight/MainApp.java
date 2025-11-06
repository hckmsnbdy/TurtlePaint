package com.pluralsight;

import com.pluralsight.Shapes.Circle;
import com.pluralsight.Shapes.Hexagon;
import com.pluralsight.Shapes.Square;
import com.pluralsight.Shapes.Triangle;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.println("=== Turtle Painter ===");

        System.out.print("Enter world width: ");
        int worldW = Integer.parseInt(in.nextLine());

        System.out.print("Enter world height: ");
        int worldH = Integer.parseInt(in.nextLine());

        boolean running = true;

        World world = new World(worldW, worldH);
        Turtle turtle = new Turtle(world, 0, 0);

        while (running)
        {
            System.out.println();
            System.out.println("Home Screen");
            System.out.println("1) Add Shape");
            System.out.println("2) Save Image");
            System.out.println("0) Exit");

            System.out.print("Choose: ");
            String input = in.nextLine();

            switch (input)
            {
                case "1":
                    System.out.println("Add Shape selected.");
                    addShape(in, turtle);
                    break;

                case "2":
                    System.out.println("Save Image option selected.");
                    // save method
                    break;

                case "0":
                    System.out.println("Exiting program...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }

        in.close();
    }

    private static void addShape(Scanner in, Turtle turtle)
    {
        System.out.println();
        System.out.println("Choose a shape:");
        System.out.println("1) Square");
        System.out.println("2) Circle");
        System.out.println("3) Triangle");
        System.out.println("4) Hexagon");
        System.out.println("0) Cancel");

        System.out.print("Choice: ");
        String choice = in.nextLine();

        switch (choice)
        {
            case "1":
                drawSquare(in, turtle);
                break;

            case "2":
                drawCircle(in, turtle);
                break;

            case "3":
                drawTriangle(in, turtle);
                break;

            case "4":
                drawHexagon(in, turtle);
                break;

            case "0":
                System.out.println("Cancelled.");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void drawSquare(Scanner in, Turtle turtle)
    {
        System.out.println("-- Square --");

        // border color
        System.out.print("Border color name (red, blue, etc): ");
        String colorName = in.nextLine();
        Color color = getColor(colorName);

        // border width
        System.out.print("Border width (int): ");
        int border = Integer.parseInt(in.nextLine());

        // location
        System.out.print("Top-left X: ");
        double x = Double.parseDouble(in.nextLine());

        System.out.print("Top-left Y: ");
        double y = Double.parseDouble(in.nextLine());

        // size
        System.out.print("Edge length: ");
        double size = Double.parseDouble(in.nextLine());

        Square s = new Square(turtle, new Point2D.Double(x, y), color, border, size);
        s.paint();
    }

    private static void drawCircle(Scanner in, Turtle turtle)
    {
        System.out.println("-- Circle --");

        System.out.print("Border color: ");
        String colorName = in.nextLine();
        Color color = getColor(colorName);

        System.out.print("Border width: ");
        int border = Integer.parseInt(in.nextLine());

        System.out.print("Center X: ");
        double x = Double.parseDouble(in.nextLine());

        System.out.print("Center Y: ");
        double y = Double.parseDouble(in.nextLine());

        System.out.print("Radius: ");
        double radius = Double.parseDouble(in.nextLine());

        Circle c = new Circle(turtle, new Point2D.Double(x, y), color, border, radius);
        c.paint();
    }

    private static void drawTriangle(Scanner in, Turtle turtle)
    {
        System.out.println("-- Triangle --");

        System.out.print("Border color: ");
        String colorName = in.nextLine();
        Color color = getColor(colorName);

        System.out.print("Border width: ");
        int border = Integer.parseInt(in.nextLine());

        System.out.print("First vertex X: ");
        double x = Double.parseDouble(in.nextLine());

        System.out.print("First vertex Y: ");
        double y = Double.parseDouble(in.nextLine());

        System.out.print("Side length: ");
        double side = Double.parseDouble(in.nextLine());

        Triangle t1 = new Triangle(turtle, new Point2D.Double(x, y), color, border, side);
        t1.paint();
    }
    private static void drawHexagon(Scanner in, Turtle turtle)
    {
        System.out.println("-- Hexagon --");

        System.out.print("Border color: ");
        String colorName = in.nextLine();
        Color color = getColor(colorName);

        System.out.print("Border width: ");
        int border = Integer.parseInt(in.nextLine());

        System.out.print("First vertex X: ");
        double x = Double.parseDouble(in.nextLine());

        System.out.print("First vertex Y: ");
        double y = Double.parseDouble(in.nextLine());

        System.out.print("Side length: ");
        double side = Double.parseDouble(in.nextLine());

        Hexagon h = new Hexagon(turtle, new Point2D.Double(x, y), color, border, side);
        h.paint();
    }
    private static Color getColor(String name)
    {
        name = name.toLowerCase();

        if (name.equals("red")) return Color.RED;
        if (name.equals("green")) return Color.GREEN;
        if (name.equals("blue")) return Color.BLUE;
        if (name.equals("black")) return Color.BLACK;
        if (name.equals("white")) return Color.WHITE;
        if (name.equals("yellow")) return Color.YELLOW;
        if (name.equals("magenta")) return Color.MAGENTA;

        return Color.BLACK;
    }

}
