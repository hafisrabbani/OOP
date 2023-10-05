package coba;





import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

public class Ball {
    private int x ;
    private int y ;
    private Color clr ;
    private int diameter ;
    private int deltaX ;
    private int deltaY ;
    private Dimension area = new Dimension(300,300); 
    
     public Ball(){}
     public Ball(int x, int y, Color c, int diameter){
        this.x = x ;
        this.y = y ;
        this.clr = c ;        
        this.diameter = diameter ;

    }
     
    public Ball(int x, int y, Color c, int diameter, int deltaX, int deltaY){
        this.x = x ;
        this.y = y ;
        this.clr = c ;        
        this.diameter = diameter ;
        this.deltaX = deltaX ;
        //this.deltaX = (int) (Math.random() * 10) ;
        this.deltaY = deltaY ;    
        
    }
           
    public void setX(int x){
        this.x = x ;
    }
    
    public void setY(int y){
        this.y = y ;
    }
    
   public void setColor(Color c){
        this.clr = c ;
    }
    
    public void setDiameter(int diameter){
        this.diameter = diameter ;
    }
    
    public void setDeltaX(int dx){
        this.deltaX = dx ;
    }
    
    public void setDeltaY(int dy){
        this.deltaY = dy ;
    }
    
    public int getX(){return x ;}
    public int getY(){return y ;}
    public int getDiameter(){return diameter ;}
    public Color getColor(){return clr ;}
    public int getDeltaX(){return deltaX ;}
    public int getDeltaY(){return deltaY ;}
    public void setDimension(Dimension area){
        this.area = area ;
    }    
    
    public Dimension getDimension(){
        return area;
    }
    public void move(){
        if (x<=0 || x>area.width-diameter)
        {
            deltaX = -deltaX ;          
        }
        x = x + deltaX ;
            
        if (y<0 || y>area.height - diameter)
            deltaY = -deltaY ;
        y = y + deltaY ;
            
    }
    
 public void Collision(Ball bola){
   //anggap bola 2 adalah bola dari parameter fungsi    
   //untuk mengetahui jarak terhdp X antara bola 1 dg bola 2 yaitu selisih     
   //antara titik pusat terhadap X bola 1 dan bola 2
   int jarakX = (bola.getX() + bola.getDiameter()/2) - (x + diameter/2) ;

   //untuk mengetahui jarak terhdp Y antara bola 1 dg bola 2 yaitu selisih     
   //antara titik pusat terhadap Y bola 1 dan bola 2
   int jarakY = (bola.getY() + bola.getDiameter()/2) - (y + diameter/2) ;
         
   //menghitung jarak antara dua bola yang saling bertabrakan menggunakan teorema phytagoras 
   int distance = (int)Math.sqrt(jarakX*jarakX + jarakY * jarakY) ;         
   
   //jika ternyata distance < diameter bola maka terjadi tabrakan
   if (distance <=(diameter +bola.diameter)/2)
   {    
       //jarakX>0 dan jarakY>0 bola 2 disebelah kanan bola 1 
       //jarakX<0 dan jarakY<0 bola 2 disebelah kiri bola 1 
       //untuk mengubah arah geraki
       //deltaX = - deltaX ;
       if ((deltaX>0 && jarakX>0)  || (deltaX<0 && jarakX<0 ))          
           deltaX = - deltaX ;
       if ((deltaY>0 && jarakY>0)  || (deltaY<0 && jarakY<0 ))
          deltaY = - deltaY ;      
   }     
   
   
  }

}
