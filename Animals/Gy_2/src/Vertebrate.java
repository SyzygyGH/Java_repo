public class Vertebrate {

    private String animalNickName="astronaut";
    protected String wannabe;

    private int num=3;

    public void animalType(){
        System.out.println("It is a Vertebrate, so please add more to the description!");
        animalNickName="Huncutka";
        wannabe="Astronaut";
        System.out.println("The original animal nickname is: " + animalNickName);
        System.out.println("The original animal aim was: " + wannabe);
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

    public String getAnimalNickName() {
        return animalNickName;
    }

    public void setAnimalNickName(String name) {
        this.animalNickName = name;
    }

    public int doubledLegs(int legs){
        return legs*2;
    }
}
