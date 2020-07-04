public class WarfareSpaceship extends SpaceshipDecorator {

    public WarfareSpaceship(Spaceship spaceship) {
        super(spaceship);
    }

    @Override
    public String takeOff() {
        return super.takeOff() + readyToFight();
    }

    @Override
    public String landing() {
        return super.landing();
    }

    @Override
    public String travelInSpace() {
        return super.travelInSpace();
    }

    private String readyToFight() {
        return "\nWe are ready to shoot some rebels..!";
    }

    private String activeDefectorShielding() {

        return "\nActivating Defector Shield..!";
    }
}
