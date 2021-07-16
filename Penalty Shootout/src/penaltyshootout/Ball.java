package penaltyshootout;

import java.awt.Color;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Ellipse;
import edu.macalester.graphics.Point;

/**
 * Creates and adds the ball object to the canvas.
 */
public class Ball {
    
    private Ellipse ball;
    private CanvasWindow canvas;
    private double centerX;
    private double centerY;
    private static final int BALL_RADIUS = 30;
 
    public Ball(double centerX, double centerY,CanvasWindow canvas) {
        this.canvas = canvas;
        this.centerX = centerX;
        this.centerY = centerY;

        ball = new Ellipse(centerX-BALL_RADIUS, centerY-BALL_RADIUS, BALL_RADIUS*2, BALL_RADIUS*2);
        ball.setFillColor(Color.WHITE);
        ball.setFilled(true);
        ball.setStrokeColor(Color.BLACK);
        ball.setStrokeWidth(2);

        
        canvas.add(ball);

    }

    /**
    * Lets the user call in the ellipse ball object in the main PenaltyGame class.
    * @return ellipse bsll object.
    */
    public Ellipse getImage() {
        return ball;
    }

    /**
     * Updates the ball position to the set location.
     * @param location The point where the user clicks.
     */

    public void shoot(Point location) {
        ball.setPosition(location);

    }
    
}
