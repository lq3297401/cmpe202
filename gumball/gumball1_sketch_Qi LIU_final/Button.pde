//reference1: https://processing.org/examples/button.html
//reference2: http://blog.startingelectronics.com/a-simple-button-for-processing-language-code/

class Button {
  String label;
  float x;    // top left corner x position
  float y;    // top left corner y position
  float w;    // width of button
  float h;    // height of button

  Button(String labelB, float xpos, float ypos, float widthB, float heightB) {
    label = labelB;
    x = xpos;
    y = ypos;
    w = widthB;
    h = heightB;
  }

  void Draw() {   
    if (MouseIsOver() == true) {
      fill(209); 
      if (mousepressed() == true) { 
        fill(0);
      }
    } else fill(255);

    stroke(141);
    rect(x, y, w, h, 10);

    textAlign(CENTER, CENTER);
    if (mousepressed() == true) fill(255);
    else fill(0); //text color
    text(label, x + (w / 2), y + (h / 2));
  }


  boolean MouseIsOver() {
    if (mouseX > x && mouseX < (x + w) && mouseY > y && mouseY < (y + h)) return true;
    else return false;
  }

  boolean mousepressed() {
    if (mousePressed && MouseIsOver() == true)  return true;
    else return false;
  }
}