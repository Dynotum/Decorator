public class BasicSpaceship implements Spaceship {

    @Override
    public String takeOff() {
        return "This spaceship is taking off!";
    }

    @Override
    public String landing() {
        return "This spaceship is landing!";
    }

    @Override
    public String travelInSpace() {
        return "This spaceship is traveling in middle of the space!";
    }
}
