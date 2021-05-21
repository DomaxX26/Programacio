PImage img1, img2;
boolean vel;

void setup(){
  size(500,500);
  noStroke();
  fill(255, 255, 0);
  img1 = loadImage ("img1.jpg");
}
void mousePressed (){
  background(0);
  img1 = loadImage ("img1.jpg");
  vel = true;
  num = 1;
}

int num = 1;
void mouseWheel(MouseEvent event){
  float i = event.getCount();
  if(i > 0){
      if(num <= 1){
        num = 4;
      }else{
        num--;
      }
    } 
  if(i < 0){
    if(num >= 4){
      num = 1;
    }else{
      num++;
    }
  }
}
void draw(){
  image(img1,0,0, width, height);
  filter(BLUR, 4);
  image(img1, width/4, height/4, width/2, height/2);
  if(vel){
    if(num == 1){
    img1 = loadImage ("img1.jpg");
    image(img1,0,0, width, height);
    filter(BLUR, 4);
    img2 = loadImage ("img1.jpg");
    image(img2, width/4, height/4, width/2, height/2);
    vel = true;
    
  }
  else if( num == 2){
    img1 = loadImage ("img2.jpg");
    image(img1,0,0, width, height);
    filter(BLUR, 4);
    img2 = loadImage ("img2.jpg");
    image(img2, width/4, height/4, width/2, height/2);
    vel = true;
  }
  else if( num == 3){
    img1 = loadImage ("img3.jpg");
    image(img1,0,0, width, height);
    filter(BLUR, 4);
    img2 = loadImage ("img3.jpg");
    image(img2, width/4, height/4, width/2, height/2);
    vel = true;
  }
  else if( num == 4){
    img1 = loadImage ("img4.jpg");
    image(img1,0,0, width, height);
    filter(BLUR, 4);
    img2 = loadImage ("img4.jpg");
    image(img2, width/4, height/4, width/2, height/2);
    vel = true;
    } 
  }
}
