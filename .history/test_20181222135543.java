float angle_X = 0;
float angle_y = 0;
float x;
void setup(){
    size(640,480,P3D);
    x = 2;
}

void draw(){
    background(#CCCCCC);
    ambientLight(10, 10, 10);
    lightSpecular(50, 0, 0);
    directionalLight(255, 255, 255, -1, 1, -1); 
    rotateX(angle_X);
    rotateY(angle_y);
    shininess(5.0);
     x += 0.1;
    rect(width/2,height/2,x,x);
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