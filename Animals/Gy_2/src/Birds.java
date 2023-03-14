public class Birds extends Vertebrate{

    public void isBird(int legNumber){
        System.out.println("Now, that we know the number of legs, it is surely a bird");
    }

    @Override
    public int doubledLegs(int legs){
        return legs*2*2;
    }

}
