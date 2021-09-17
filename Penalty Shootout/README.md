Project Title: Soccer Penalty Shootout
Salman Ijaz, Graham Elliot, Curran Middleton 

Project Description:
Our project provides a penalty shootout soccer game. There are targets placed in the goal, and the user chooses one of the targets to shoot the ball. The goalie icon will randomly choose one of these targets as the spot where they move to. There will be 5 shot attempts, and after those 5 attempts the console will display the amount of goals that were scored. 

Changes from original plan:
Our original plan was going to use images as the ball, goalie, and player icons, but we soon realized that it would be difficult to establish whether a goal was scored or not if using images instead of ellipses. Ellipses made it easier to track intersections. This definitely reduces a little in the visual department, as the game looks less like a real life soccer simulation, but the functionality is definitely increased compared to what it would have been with images. 

Guide:
Running the PenaltyGame class will allow the entire game to run. The rest of the classes are used within the PenaltyGame class and do not have to be touched by the user. 

Challenging aspects:
Aside from the image issues outlined above, the main issue was faced when figuring out how to count the goals scored and how to reset the game after each shot. We originally attempted to have the code run until the count (the total shots) reached 5. Instead, we implemented an “if” statement that will continuously check the count until it reaches 5, causing the console to display a statement like this:
“You scored 2 goals out of 5!”
