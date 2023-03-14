import java.util.Scanner;

public class FunctionMain {

    public static void main (String[] args){
        Scanner Input = new Scanner(System.in);
        Vertebrate vertebrate = new Vertebrate();
        Mammals mammal = new Mammals();
        Birds bird = new Birds();
        BirdsMammals birdmammal = new BirdsMammals();


        System.out.println("What is the name of the animal?");
        vertebrate.setAnimalNickName(Input.nextLine());

        System.out.println("The name of the animal is: " + vertebrate.getAnimalNickName());

        System.out.println("The private original aim was: " + vertebrate.wannabe);
        System.out.println(bird.wannabe="The modified aim after gettes setter is: Cleaning assistant");


        System.out.println("What kind of animal? [e.g: Vertebrate]");
        String userInput = Input.nextLine();

        int legNumbers=0;
        if (userInput.equals("Vertebrate")){
            vertebrate.animalType();
            System.out.println("How much legs does this animal have?");
            legNumbers=Input.nextInt();

            vertebrate.animalExacterType(legNumbers);
            if (legNumbers==2){
                bird.isBird(legNumbers);
            }
            if (legNumbers==4) {
                mammal.isMammal(4);
            }

        }

        System.out.println("Number of doubled legs in parent class: "+ vertebrate.doubledLegs(legNumbers));
        System.out.println("Number of doubled legs in mammal class: "+ mammal.doubledLegs(legNumbers));
        System.out.println("Number of doubled legs in bird class: "+ bird.doubledLegs(legNumbers));


        System.out.println("The multiple inheritance with interfaces works, bacuse: ");
        birdmammal.movementBird();
        birdmammal.movementMammal();


    }

}
