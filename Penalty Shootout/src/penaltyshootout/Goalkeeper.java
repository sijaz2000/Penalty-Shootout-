package penaltyshootout;

import edu.macalester.graphics.Image;
import edu.macalester.graphics.Rectangle;

import java.awt.Color;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Ellipse;

/**
 * Creates and adds the goalkeeper object to the canvas.
 */
public class Goalkeeper {

    private Ellipse goalKeeper;
    private CanvasWindow canvas;
    private double centerX;
    private double centerY;
    private static final int BALL_RADIUS = 30;

    public Goalkeeper(double centerX, double centerY,CanvasWindow canvas) {
        this.canvas = canvas;
        this.centerX = centerX;
        this.centerY = centerY;

        goalKeeper = new Ellipse(centerX-BALL_RADIUS, centerY-BALL_RADIUS, BALL_RADIUS*2 +15, BALL_RADIUS*2+15);
        goalKeeper.setFillColor(Color.BLACK);
        goalKeeper.setFilled(true);
        goalKeeper.setStrokeColor(Color.WHITE);
        goalKeeper.setStrokeWidth(2.5);
        
        canvas.add(goalKeeper);

    }

    /**
     * Lets the user call in the ellipse goalkeeper object in the main PenaltyGame class.
     * @return ellipse goalkeeper object.
     */
    public Ellipse getImage() {
        return goalKeeper;
    }
    
}
