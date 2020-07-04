public class TransportSpaceship extends SpaceshipDecorator {

    public TransportSpaceship(Spaceship spaceship) {
        super(spaceship);
    }

    @Override
    public String travelInSpace() {
        return super.travelInSpace() + lightSpeedTravel();
    }

    @Override
    public String takeOff() {
        return getOnTheShip() + super.takeOff();
    }

    @Override
    public String landing() {
        return super.landing() + getOffTheShip();
    }

    private String lightSpeedTravel() {
        return "\nActivating LigthSpeed travel..!";
    }

    private String getOnTheShip() {
        return "People getting on the ship.\n";
    }

    private String getOffTheShip() {
        return "\nPeople getting off the ship.";
    }
}
