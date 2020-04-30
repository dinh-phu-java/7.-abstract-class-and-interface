public class Rectangle extends Shape implements Resizeable {
    private double width=1.0;
    private double length=1.0;

    @Override
    public void resize(double percent){
        this.width= this.width + (this.width*percent/100);
        this.length=this.length + (this.length*percent/100);
    }
    public Rectangle(){

    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getWidth(){
        return this.width;
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getLength(){
        return this.length;
    }
    @Override
    public String toString(){
        return "The Rectangle have width: "+this.width+" and length: "+this.length+" - This Object is a subclass of"+super.toString();
    }
}
