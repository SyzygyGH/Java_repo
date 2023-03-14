public class Mammals extends Vertebrate{

    public void isMammal(int legNumber){
        System.out.println("Now, that we know the number of legs, it is surely a mammal");
    }

    @Override
    public int doubledLegs(int legs){
        return legs*2*4;
    }
}
