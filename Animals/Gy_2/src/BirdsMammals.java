public class BirdsMammals implements birdInterface, mammalInterface{
    @Override
    public void movementBird() {
        System.out.println("It is the interface of bird movement");
    }

    @Override
    public void movementMammal() {
        System.out.println("It is the interface of mammal movement");
    }
}

