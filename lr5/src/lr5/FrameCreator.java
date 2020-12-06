package lr5;

import javax.swing.*;
import java.util.Random;

public class FrameCreator extends JFrame {

    FigureDrawer drawer1 = new FigureDrawer();

    public FrameCreator(){
        super("Figure Drawer");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        setSize(1280, 720);
        setVisible(true);
        this.setLocationRelativeTo(null);
        this.add(drawer1);

        Random randNum = new Random();
        int fillorno;
        boolean isFilled = false;

        fillorno = randNum.nextInt(9);
        if(fillorno <= 4){
            isFilled = true;
        }
        else if(fillorno >= 5){
            isFilled = false;
        }

        Circle circle1 = new Circle(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));

        fillorno = randNum.nextInt(9);
        if(fillorno <= 4){
            isFilled = true;
        }
        else if(fillorno >= 5){
            isFilled = false;
        }

        Square square1 = new Square(randNum.nextInt(1280), randNum.nextInt(720), isFilled, randNum.nextInt(100));
    }
}
