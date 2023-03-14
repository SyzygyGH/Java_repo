import java.util.Scanner;

public class FunctionMain {

    public static void main (String[] args){
        Scanner Input = new Scanner(System.in);
        Vertebrate vertebrate = new Vertebrate();
        Mammals mammal = new Mammals();
        Birds bird = new Birds();

        System.out.println("What kind of animal? [e.g: Vertebrate]");
        String userInput = Input.nextLine();

        System.out.println(userInput);

        int legNumbers=0;
        if (userInput.equals("Vertebrate")){
            vertebrate.animalType();
            System.out.println("How much legs does this animal have?");
            legNumbers=Input.nextInt();

            vertebrate.animalExacterType(legNumbers);
        }

        System.out.println("Ez mar az uj verzio");


    }
}
