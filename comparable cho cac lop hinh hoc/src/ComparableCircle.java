public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){
        super();
    }
    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(ComparableCircle o){
        if(super.getRadius() > o.getRadius()){
            return 1;
        }else if(super.getRadius() == o.getRadius()){
            return 0;
        }else{
            return -1;
        }
    }
}
