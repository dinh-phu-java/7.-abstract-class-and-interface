public class Main {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[4];
        shapes[0]=new Rectangle(5.2,2.6);
        shapes[1]=new Rectangle(5.8,7.4);
        shapes[2]=new Square(7);
        shapes[3]=new Square(2.4);
//        System.out.println(shapes[1] instanceof Shape);

        for (Shape myShape : shapes){
            if(myShape instanceof Colorable){
                Square theShape=(Square)myShape;
                theShape.howToColor();
            }
        }
    }
}
