public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this.color="green";
        this.filled = false;
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public boolean getFilled(){
        return this.filled;
    }
    @Override
    public String toString(){
        String filled = this.filled ? "filled" : "not filled";
        return "Shape Object with color: "+this.getColor()+" and "+filled;
    }

}
