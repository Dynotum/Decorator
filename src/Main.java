public class Main {

    public static void main(String[] args) throws InterruptedException {

        Spaceship basicShip = new BasicSpaceship();

        print(basicShip.takeOff());
        Thread.sleep(3000);
        print(basicShip.travelInSpace());
        Thread.sleep(3000);
        print(basicShip.landing());

        Thread.sleep(4000);
        print();

        Spaceship warShip = new WarfareSpaceship(new BasicSpaceship());

        print(warShip.takeOff());
        Thread.sleep(3000);
        print(warShip.travelInSpace());
        Thread.sleep(3000);
        print(warShip.landing());

        Thread.sleep(4000);
        print();

        Spaceship transportShip = new BasicSpaceship();
        transportShip = new TransportSpaceship(transportShip);

        print(transportShip.takeOff());
        Thread.sleep(3000);
        print(transportShip.travelInSpace());
        Thread.sleep(3000);
        print(transportShip.landing());

        Thread.sleep(4000);
        print();

        //Runtime -> Transport + Warfare
        transportShip = new WarfareSpaceship(transportShip);

        print(transportShip.takeOff());
        Thread.sleep(3000);
        print(transportShip.travelInSpace());
        Thread.sleep(3000);
        print(transportShip.landing());
    }

    private static void print(String str) {
        System.out.println(str);
    }

    private static void print() {
        System.out.println();
    }
}
