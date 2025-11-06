package com.pluralsight;

import com.pluralsight.Shapes.Circle;
import com.pluralsight.Shapes.Hexagon;
import com.pluralsight.Shapes.Square;
import com.pluralsight.Shapes.Triangle;

import java.awt.*;
import java.awt.geom.Point2D;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(1000, 1000,Color.WHITE);
        Turtle turtle = new Turtle(world,0, 0);

        Square square = new Square(turtle,new Point2D.Double(-280,250),Color.blue,3,150);
        square.paint();

        Triangle triangle = new Triangle(turtle, new Point2D.Double(80, -230),Color.GREEN,3, 160);
        triangle.paint();

        Circle circle = new Circle(turtle, new Point2D.Double(180, 160), Color.RED, 3,80);
        circle.paint();

        Hexagon hex = new Hexagon(turtle, new Point2D.Double(-280, -230), Color.MAGENTA, 3, 120);
        hex.paint();


//        int width = 200;
//        int height = 200;
//
//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
//        double widthSquared = Math.pow(width, 2);
//        double heightSquared = Math.pow(height, 2);
//        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);


    }
}
