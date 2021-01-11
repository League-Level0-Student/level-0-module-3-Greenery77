
void setup() {
 
  // set the size of your sketch
  
  size(500, 500);
  
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  for (int i = 450; i > 0; i-= 80){
    
  ellipse(250, 250, i, i);
  
  }
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
  
}
