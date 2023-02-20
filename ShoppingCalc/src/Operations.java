public class Operations {

    private int numberOf;
    private int price;

    /*public int sum (int numberOf, int price) {
        return numberOf*price;

    }*/

    public int sum(int x, int y) {
        return x * y;
    }

    public double interestSum (int userInput, int interest, int time){
        return (userInput + userInput*Math.pow(interest/100, time));
    }


}
