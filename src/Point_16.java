public class Point_16 {
int x;double distance;
int y;


public Point_16(){

    System.out.println("zero args constructor");

}
    public Point_16(int x,int y)
    {

this.x=x;
this.y=y;
    }

public int getX()
{
  return x;

}


public int getY(){

    return y;

}

public void setX(int x){

   this.x=x;
}

public void setY(int y){
  this.y=y;
}

public double distance(){
    return distance(0,0);
}

public double distance(int x,int y)
{
   return Math.sqrt( ((x-this.x)*(x-this.x))+  ((y-this.y)*(y-this.y)));
}

public double distance(Point_16 point){
    return distance(point.getX(),point.getY());
}

    public static void main(String[] args) {
//double first,second,distance;

        Point_16 first = new Point_16(6, 5);

        Point_16  second = new Point_16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point_16 point = new Point_16();
        System.out.println("distance()= " + point.distance());

    }



}
