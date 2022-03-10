public class Main {
    public static void main(String[] args) {
        // thuoc tinh cua class se bi an hoac hien
        Car car = new Car("honda", "winner150", 2016);
        // System.out.println(car.year); // ben car private nen ko the lay dc
        car.setYear(2025);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }

}
