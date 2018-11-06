public class TestCar {

    public static void main(String[] args) {
	    Car car1 = new Car();
	    Car car2 = new Car();

	    final int num = 3;

	    car1.color = "red";
	    car2.color = "blue";

        System.out.println("The first car is " + car1.color);
        System.out.println("The second car is " + car2.color);

        System.out.println(num);

        Car car3 = new Car();
        Car car4 = new Bicycle();

        car4.instanceMethod();
        Bicycle.classMethod();
        Car.classMethod();
    }
}
