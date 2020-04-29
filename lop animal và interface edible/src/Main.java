public class Main {
    public static void main(String[] args){
        Animal[] animal= new Animal[2];
        animal[0]=new Tiger();
        animal[1]=new Chicken();
        for(Animal ani:animal){
            ani.makeSound();
            if(ani instanceof Chicken){
                Edible myChick= (Chicken)ani;
                System.out.println(myChick.howToEat());
            }
        }
    }
}
interface Edible{
    public String howToEat();
}

abstract class Fruit implements Edible{
    public abstract void fruitSout();
}
abstract class Animal{
    public abstract void makeSound();
}

class Chicken extends Animal implements Edible{
    @Override
    public void makeSound(){
        System.out.println("chicken make sound");
    }
    @Override
    public String howToEat(){
        return "Chicken eating";
    }
}
class Tiger extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Tiger make sound");
    }
}

class Orange extends Fruit{
    @Override
    public void fruitSout(){
        System.out.println("A part of fruit");
    }
    @Override
    public String howToEat(){
        return "Eat Orange";
    }
}


