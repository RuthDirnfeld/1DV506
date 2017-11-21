package rd222dv_assign4;

import java.util.Random;

public class RandomWalk {
	Random rand = new Random();  
	private int x; //X coordinate of the current position
	private int y; //Y coordinate of the current position
	private int maxStep; //The maximum number of steps in a walk
	private int stepCount = 0; //The number of steps taken so far in the walk
	private int planeSize; //The size of the plane (according to the description above)
	private int randDirection;
	Random nextStep = new Random();
	
	public RandomWalk(int max, int size){ //max num of steps is max and size is the size of the plane
		 this.maxStep = max;
		 this.planeSize = size;
		 this.x=0;
		 this.y=0;
	}
	public String toString(){ //number of steps taken so far and the current position
		return "Steps taken: "+stepCount + "; " + "Current position: "+"(" + this.x + "," + this.y + ")";
	}
	public void takeStep(){ //taking a single step. Generate a random number, taking on four different values,
		         //and let them correspond to a movement up, down, to the right and to the left
		randDirection = nextStep.nextInt(4);
		switch (randDirection) {
		
		case 0:
			this.x += 1; //move right
			stepCount++;
			break;
			
		case 1:
			this.y += 1; //move up
			stepCount++;
			break;
		case 2:
			this.x -=1; //move left
			stepCount++;
			break;
		case 3:
			this.y -=1; //move down
			stepCount++;
			break;
		}
	}			
	public boolean moreSteps(){ //returns true if the number of steps taken < maximal number of steps
		if (stepCount < maxStep)
			return true;
		 return false;
	}
	public boolean inBounds(){ //returns true if the current position is inside the boundary of the plane
		if (x < planeSize && x > -planeSize && y < planeSize && y > -planeSize)
			return true;
		return false;
	}
	public void walk(){ //simulates a random walk
		while (inBounds() && moreSteps()) {
			takeStep();
		}
	}	
	public void reset (){
		stepCount=0;
		x=0;
		y=0;
	}
}


