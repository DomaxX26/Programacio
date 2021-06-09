//Declaració de les variables
PImage img1, img2, img3, img4, imgI, imgC;
boolean vel = false;

//Mostrem les cuatre imatges i pose'm el tamany de la pantalla d'ixida
void setup(){
  size(250,250);
  noStroke();
 
  img1 = loadImage("img1.jpg");
  img2 = loadImage("img2.jpg");
  img3 = loadImage("img3.jpg");
  img4 = loadImage("img4.jpg");
}

//Este es per a la funció de quan es mou el ratolí
void mouseMoved(){
//Este if fa, quan el tarolí esta damunt de la primera imatge que es mostre
    if((mouseX > 0 && mouseX < width/4) && (mouseY > height/6*5 && mouseY < width )){
    image(img1, 0, 0, width, height/7*6);
    filter(BLUR, 4);
    image(img1, width/4, height/6, width/2, height/2);
    }
//Este else if fa, quan el tarolí esta damunt de la segona imatge que es mostre
  else if((mouseX > width/4 && mouseX < width/4*2) && (mouseY > height/6*5 && mouseY < width )){
    image(img2, 0, 0, width, height/7*6);
    filter(BLUR, 4);
    image(img2, width/4, height/6, width/2, height/2);
  }
//Este else if fa, quan el tarolí esta damunt de la tercera imatge que es mostre
  else if((mouseX > width/4*2 && mouseX < width/4*3) && (mouseY > height/6*5 && mouseY < width )){
    image(img3, 0, 0, width, height/7*5);
    filter(BLUR, 4);
    image(img3, width/4, height/6, width/2, height/2);
  }
//Este else if fa, quan el tarolí esta damunt de la cuarta imatge que es mostre
  else if((mouseX > width/4*3 && mouseX < width/4*4) && (mouseY > height/6*5 && mouseY < width )){
    image(img4, 0, 0, width, height/7*6);
    filter(BLUR, 4);
    image(img4, width/4, height/6, width/2, height/2);
    }
  }
//Fa la funció de mostrar per pantalla el programa
void draw(){
   if(vel)image(imgI, 0, 0, width, height/6*5);
   if(vel)image(imgC, width/4, height/6, width/2, height/2); 
   if(vel)image(img1, 0, 0, width, height/6*5);
//Así el que fem es escalar les imatges depenent de la mida que li determinem.
   image(img1, 0, height/7*6, width/4, height/6);
   image(img2, width/4, height/7*6, width/4, height/6);
   image(img3, width/4*2, height/7*6, width/4, height/6);
   image(img4, width/4*3, height/7*6, width/4, height/6);
   
}
