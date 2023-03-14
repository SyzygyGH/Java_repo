public class Vertebrate {

    public void animalType(){
        System.out.println("It is a Vertebrate, so please add more to the description!");
    }

    public void animalExacterType(int legNumber){
        switch (legNumber){
            case 1:
                System.out.println("It is not an animal bro!");
                break;

            case 2:
                System.out.println("It it probably a bird!");
                break;

            case 4:
                System.out.println("It is probably a mammal!");
                break;
        }
    }
}
