import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {
        Circle[] circles= new Circle[3];
        circles[0]=new Circle(7.2);
        circles[1]=new Circle(5.2);
        circles[2]=new Circle(9.1);
        System.out.println("Pre sort");
        for (Circle myCir : circles){
            System.out.println(myCir.toString());
        }
        Comparator circleCompa= new CircleComparator();

        Arrays.sort(circles,circleCompa);
        System.out.println("after sorted");
        for (Circle myCir : circles){
            System.out.println(myCir.toString());
        }
    }
}

class Circle{
    private String color;
    private boolean filled;
    private double radius;
    public Circle(){
        this.radius=1.0;
        this.color="Green";
        this.filled=false;
    }
    public Circle(double radius){
        this.radius=radius;
        this.color="green";
        this.filled=false;
    }
    public Circle(double radius,String color, boolean filled){
        this.color=color;
        this.filled=filled;
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    @Override
    public String toString(){
        String filled = this.filled ? "filled" : "not filled";
        return "Circle with radius:"+this.radius+"  color:"+this.color+" "+filled;
    }

}

class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle circle1, Circle circle2){
        if(circle1.getRadius() == circle2.getRadius()){
            return 0;
        }else if(circle1.getRadius() > circle2.getRadius()){
            return 1;
        }else{
            return -1;
        }
    }
}

