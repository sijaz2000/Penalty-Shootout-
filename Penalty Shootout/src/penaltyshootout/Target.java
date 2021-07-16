package penaltyshootout;

import edu.macalester.graphics.Ellipse;
import edu.macalester.graphics.CanvasWindow;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Creates and adds the target objects onto the canvas.
 */
public class Target {

    private Ellipse target;
    private List<Ellipse> targetList;
    private CanvasWindow canvas;
    private Color color;

    public Target(CanvasWindow canvas) {
        this.canvas = canvas;
        this.color = new Color(255,252,187,200);
        this.targetList = new ArrayList<>();

        this.targetList = getList();

        for (Ellipse i : targetList){
            canvas.add(i);
        }
    }
    /**
     * Creates a target of set width and height, at a center defined by the user.
     * @param centerX of the ellipse
     * @param centerY of the ellipse
     * @return the target ellipse
     */
    public Ellipse createTarget(double centerX, double centerY) {
        target = new Ellipse(centerX, centerY, 60, 60);
        target.setFillColor(color);
        target.setFilled(true);
        target.setStroked(false);
        return target;
    }
    /**
     * Creates a list of targets to be used in PenaltyGame class.
     * @return the list of target ellipses. 
     */
    public List<Ellipse> getList() {
        targetList.add(createTarget(200, 275));
        targetList.add(createTarget(180, 180));
        targetList.add(createTarget(540, 275));
        targetList.add(createTarget(560, 180));
        return targetList;
    }    
}
