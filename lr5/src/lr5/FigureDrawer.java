package lr5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FigureDrawer extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        Graphics2D g2D = (Graphics2D) g;

        Random randNum = new Random();
        int fillorno;
        boolean isFilled = false;

        /*fillorno = randNum.nextInt(9);
        if(fillorno <= 4){
            isFilled = true;
        }
        else if(fillorno >= 5){
            isFilled = false;
        }*/

        /*fillorno = randNum.nextInt(9);
        if(fillorno <= 4){
            isFilled = true;
        }
        else if(fillorno >= 5){
            isFilled = false;
        }*/
        Circle circle1 = new Circle(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Square square1 = new Square(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Circle circle2 = new Circle(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Square square2 = new Square(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Circle circle3 = new Circle(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Square square3 = new Square(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Circle circle4 = new Circle(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Square square4 = new Square(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Circle circle5 = new Circle(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Square square5 = new Square(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Circle circle6 = new Circle(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Square square6 = new Square(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Circle circle7 = new Circle(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Square square7 = new Square(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Circle circle8 = new Circle(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Square square8 = new Square(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Circle circle9 = new Circle(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Square square9 = new Square(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Circle circle10 = new Circle(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
        Square square10 = new Square(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));

        g2D.setColor(Color.MAGENTA);
        g2D.setStroke(new BasicStroke(2));
//        g2D.drawLine(1, 1, 500, 500);

        g2D.drawOval(circle1.x, circle1.y, (int) circle1.radius, (int) circle1.radius);
        g2D.drawRect(square1.x, square1.y, (int) square1.side, (int) square1.side);
        g2D.drawOval(circle2.x, circle2.y, (int) circle2.radius, (int) circle2.radius);
        g2D.drawRect(square2.x, square2.y, (int) square2.side, (int) square2.side);
        g2D.drawOval(circle3.x, circle3.y, (int) circle3.radius, (int) circle3.radius);
        g2D.drawRect(square3.x, square3.y, (int) square3.side, (int) square3.side);
        g2D.drawOval(circle4.x, circle4.y, (int) circle4.radius, (int) circle4.radius);
        g2D.drawRect(square4.x, square4.y, (int) square4.side, (int) square4.side);
        g2D.drawOval(circle5.x, circle5.y, (int) circle5.radius, (int) circle5.radius);
        g2D.drawRect(square5.x, square5.y, (int) square5.side, (int) square5.side);
        g2D.drawOval(circle6.x, circle6.y, (int) circle6.radius, (int) circle6.radius);
        g2D.drawRect(square6.x, square6.y, (int) square6.side, (int) square6.side);
        g2D.drawOval(circle7.x, circle7.y, (int) circle7.radius, (int) circle7.radius);
        g2D.drawRect(square7.x, square7.y, (int) square7.side, (int) square7.side);
        g2D.drawOval(circle8.x, circle8.y, (int) circle8.radius, (int) circle8.radius);
        g2D.drawRect(square8.x, square8.y, (int) square8.side, (int) square8.side);
        g2D.drawOval(circle9.x, circle9.y, (int) circle9.radius, (int) circle9.radius);
        g2D.drawRect(square9.x, square9.y, (int) square9.side, (int) square9.side);
        g2D.drawOval(circle10.x, circle10.y, (int) circle10.radius, (int) circle10.radius);
        g2D.drawRect(square10.x, square10.y, (int) square10.side, (int) square10.side);
    }
}