public class objectPassing {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Perary");

        garage.park(car1);
        garage.park(car2);
    }
}
