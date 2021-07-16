package penaltyshootout;


import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Ellipse;
import edu.macalester.graphics.Rectangle;
import edu.macalester.graphics.Image;

import java.awt.Color;

/**
* Creates numerous visual elements and adds them to the canvas.
*/
public class Background {
    private CanvasWindow canvas;
    private Rectangle field;
    private Rectangle dBox;
    private Ellipse dot;
    private Rectangle fence;
    private Image goal;
    private Image crowd;


    
    public Background(CanvasWindow canvas) {
        this.canvas = canvas;

        addField();
        addBox();
        addDot();
        addFence();
        addCrowd();
        addGoal();

    }

    private void addCrowd() {
        crowd = new Image(95, -47,"CrowdPicture.jpg");
        crowd.setScale(1.35,0.60);
        canvas.add(crowd);
    }

    private void addGoal() {
        goal = new Image(100, 105, "FootballGoalPicture.png");
        goal.setScale(0.85);
        canvas.add(goal);
    }

    private void addField() {
        field = new Rectangle(0, 300, 800, 300);
        field.setStrokeColor(Color.WHITE);
        field.setStrokeWidth(1.5);
        field.setFillColor(Color.GREEN);
        field.setFilled(true);
        canvas.add(field);
    }

    private void addBox() {
        dBox = new Rectangle(100, 297, 600, 300);
        dBox.setStrokeColor(Color.WHITE);
        dBox.setStrokeWidth(3);
        canvas.add(dBox);
    }

    private void addDot() {
        dot = new Ellipse(400, 450, 5, 5);
        dot.setStrokeColor(Color.WHITE);
        dot.setFillColor(Color.WHITE);
        dot.setFilled(true);
        canvas.add(dot);
    }

    private void addFence() {
        fence = new Rectangle(0, 200, 800, 100);
        fence.setFillColor(Color.BLUE);
        fence.setFilled(true);
        canvas.add(fence);
    }


    
}
