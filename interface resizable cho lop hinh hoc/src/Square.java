public class Square extends Rectangle {


    public Square(double side){
        super(side,side);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "The Square with side: "+this.getSide()+" - subclass of"+super.toString();
    }
}
