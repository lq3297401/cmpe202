//reference1: https://processing.org/examples/button.html
//reference2: http://blog.startingelectronics.com/a-simple-button-for-processing-language-code/

GumballMachine gumballMachine = new GumballMachine(5);

Button on_button1;  // the button1: Insert Quarter
Button on_button2;  // the button2: Turn Crank
int clk1 = 1;       // number of times the button1 is clicked
int clk2 = 1;       // number of times the button2 is clicked

void setup() 
{
  size(800, 800) ;
  background(255) ;
  smooth() ;
  strokeWeight(3);
  strokeCap(ROUND);
  
  // load font
  PFont font;
  font = loadFont("BookAntiqua-48.vlw");
  textFont(font, 32);
  // Only draw once
  //noLoop();
  fill(0);  
  text("The Gumball Machine", 250, 60);
  PImage image = loadImage("gumball.jpg");
  image(image, (width-image.width)/2, (height-image.height)/2);
  
  // create the button object
  on_button1 = new Button("Insert Quarter", 20, 280, 220, 50);
  on_button2 = new Button("Turn Crank", 20, 380, 220, 50);
}

void draw() { 
  // draw the button in the window
  on_button1.Draw();
  on_button2.Draw(); 
}

void mousePressed()
{
  if (on_button1.mousepressed()== true && on_button1.MouseIsOver()== true) {
     gumballMachine.insertQuarter();
    // print some text to the console pane if the button is clicked
    print("Total Insert Button Tried Times: ");
    println(clk1++);    
  }
  if(on_button2.mousepressed() == true && on_button2.MouseIsOver()== true){
    print("Turn Crank");
    gumballMachine.turnCrank();
    print("Total Crank Button Tried Times: ");
    println(clk2++);  
  }
}

//public void runTest() {
  //GumballMachine gumballMachine = new GumballMachine(5);
  //System.out.println(gumballMachine);
  //gumballMachine.insertQuarter();
  //gumballMachine.turnCrank();
  //System.out.println(gumballMachine);
  //gumballMachine.insertQuarter();
  //gumballMachine.turnCrank();
  //gumballMachine.insertQuarter();
  //gumballMachine.turnCrank();
  //System.out.println(gumballMachine);
//}