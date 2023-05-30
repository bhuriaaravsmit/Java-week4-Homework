package cylinder;

public class Circle {

    double radius;


   public Circle(double radius){
       this.radius=radius;
       if(radius<0)
       {
           this.radius=0;
       }
   }

    public double getRadius()
    {

        return radius;
    }


    public double getArea(){
      double pi=Math.PI;
      double c=(pi*radius*radius);
      return c;
    }
}
