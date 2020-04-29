public class Main {
    public static void main(String[] args) {
        Square mySquare= new Square(5.2);
        System.out.println("before resize");
        System.out.println(mySquare.toString());
        mySquare.resize(150);
        System.out.println("after resize");
        System.out.println(mySquare.toString());
    }
}
