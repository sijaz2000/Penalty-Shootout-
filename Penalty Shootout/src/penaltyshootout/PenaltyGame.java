package penaltyshootout;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Point;

public class PenaltyGame {
    private CanvasWindow canvas;
    private Background background;
    private Goalkeeper goalKeeper;
    private Ball ball;
    private Target targets;
    private int count;
    private int goal;


    public PenaltyGame() {
        this.count = 0;
        this.goal = 0;
        canvas = new CanvasWindow("Soccer Field", 800, 600);
        background = new Background(canvas);
        targets = new Target(canvas);
        goalKeeper = new Goalkeeper(400,300,canvas);
        ball = new Ball (400,450,canvas);

        gameMechanics();
    }
    /**
     * This method contains the main functioning of the game.
     */
    private void gameMechanics() {
        canvas.onMouseDown(event -> {
            if (targets.getList().contains(canvas.getElementAt(event.getPosition()))) { 
                shootPlacement(event.getPosition());    
                keeperMovement();
                canvas.draw();
                goalTracker();
                resetGame();
                if (count == 5) {
                    System.out.println("You scored " + goal + " goals out of 5!");
                    canvas.closeWindow();
                }
            }  
        });
    }
    /**
     * This method creates the functioning for the keeper.
     * This logic makes it so that the goalkeeper would have a 1/4 chance of moving to one of the four targets.
     */
    private void keeperMovement() {
        double chance = Math.random();
        if (chance < 0.25) {
            goalKeeper.getImage().setPosition(targets.getList().get(0).getPosition());
        }
        else if (chance < 0.5) {
            goalKeeper.getImage().setPosition(targets.getList().get(1).getPosition());
        }
        else if (chance < 0.75) {
            goalKeeper.getImage().setPosition(targets.getList().get(2).getPosition());
        }
        else{
            goalKeeper.getImage().setPosition(targets.getList().get(3).getPosition());
        }
    }
    /**
     * This method controls how the ball moves. Depending on which target the user clicks, the ball will move to that target's position.
     * @param location in this case is the Pointer(Click's) location.
     */
    private void shootPlacement(Point location) {
        if (canvas.getElementAt(location) == targets.getList().get(0)) {
            ball.shoot(targets.getList().get(0).getPosition());
        }
        else if (canvas.getElementAt(location) == targets.getList().get(1)) {
            ball.shoot(targets.getList().get(1).getPosition());
        }
        else if (canvas.getElementAt(location) == targets.getList().get(2)) {
            ball.shoot(targets.getList().get(2).getPosition());
        }
        else if (canvas.getElementAt(location) == targets.getList().get(3)) {
            ball.shoot(targets.getList().get(3).getPosition());
        }
    }
    /**
     * Tests whether a goal has been scored or not.
     * @return true if goal has been scored.
     * @return false if goal is saved.
     */
    private boolean testGoal() {
        if(ball.getImage().getPosition() != goalKeeper.getImage().getPosition()) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Resets the canvas to move the ball and goalie back to their origianl positions. 
     * Incrments the value of count. 
     */
    private void resetGame() {
        canvas.pause(1500);
        canvas.remove(ball.getImage());
        canvas.remove(goalKeeper.getImage());
        goalKeeper = new Goalkeeper(400,300,canvas);
        ball = new Ball (400,450,canvas);
        count = count + 1;
    }
    /**
     * Adds 1 to the goal variable if a goal has been scored.
     */
    private void goalTracker() {
        if (testGoal() == true) {
            goal = goal + 1;
        }
    }

    public static void main(String[] args) {
       new PenaltyGame();
    }
    
}
