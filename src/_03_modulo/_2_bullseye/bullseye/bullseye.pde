
void setup() {
 
  // set the size of your sketch
  
  size(500, 500);
  
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  int j = 0;
  
  for (int i = 450; i > 0; i-= 80){
    
  ellipse(250, 250, i, i);
  
  
  if (j % 2 == 0){
  
  fill(255, 255, 255);
  
  }
  
  else {
   
  fill(252, 28, 28);
  
  }
  
  j++;
  
  }
 
  //Use an if statement and modulo to alternate the color of your rings.
 
}
