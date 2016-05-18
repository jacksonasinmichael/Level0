void setup() {
  size(1000, 1000);

}
void draw() {
  fill(255, 255, 255);
  ellipse(300, 450, 200, 100);
  ellipse(600, 450, 200, 100);
  if (220<mouseX&&mouseX<380&&mouseY>420&&mouseY<480) {
    fill(0, 0, 0);
    ellipse(mouseX, mouseY, 25, 25);
    ellipse(mouseX+300, mouseY, 25, 25);
  }
}

