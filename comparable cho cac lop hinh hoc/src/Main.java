import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ComparableCircle[] circles = new ComparableCircle[5];
        circles[0]=new ComparableCircle(5.2);
        circles[1]=new ComparableCircle(2.5);
        circles[2]=new ComparableCircle(6.7);
        circles[3]=new ComparableCircle(1.7);
        circles[4]=new ComparableCircle(0.7);

        System.out.println("Pre sorted");
        for(ComparableCircle myCir : circles){
            System.out.println(myCir.getRadius());
        }

        Arrays.sort(circles,ComparableCircle::compareTo);
        System.out.println("After sorted");
        for (ComparableCircle myCir: circles){
            System.out.println(myCir.getRadius());
        }
    }
}
