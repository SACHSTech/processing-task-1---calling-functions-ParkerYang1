import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(71, 218, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    fill(0, 128, 0);
    rect(0, 250, 400, 250);
    
    fill(200, 155, 125);
    rect(50, 150, 150, 150); 

    fill(125, 65, 45);
    rect(60, 90, 25, 60);
    
    fill(125, 65, 45);
    triangle(50, 150, 200, 150, 125, 80);

    fill(255, 255, 0);
    ellipse(325, 60, 100, 100);

    fill(255, 197, 143);
    rect(125, 210, 60, 90);

    fill(255, 255, 255);
    rect(60, 210, 50, 50);

    fill(0, 0, 0);
    line(85, 210, 85, 260);

    fill(0, 0, 0);
    line(60, 235, 110, 235);

    fill(0, 0, 0);
    ellipse(170, 260, 15, 15);
  }
}