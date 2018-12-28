float angle_X = 0;
float angle_y = 0;

void setup(){
    size(640,480,P3D);
}

void draw(){
    background(#CCCCCC);
    translate(110,240,0);

    rotateX(angle_X);
    rotateY(angle_y);

    rect(-100,-100,200,200);
}

float prossed_x;
float prossed_y;

void mousePressed(){
    prossed_x = mouseX;
    prossed_y = mouseY;
}
void mouseDragged(){
    angle_y = (mouseX - prossed_x) *0.01;
    angle_X = (mouseY - prossed_y) *0.01;
}