abstract class SpaceshipDecorator implements Spaceship {

    private Spaceship spaceship;

    public SpaceshipDecorator(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    @Override
    public String takeOff() {
        return spaceship.takeOff();
    }

    @Override
    public String landing() {
        return spaceship.landing();
    }

    @Override
    public String travelInSpace() {
        return spaceship.travelInSpace();
    }
}
