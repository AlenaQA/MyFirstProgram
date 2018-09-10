public class Dog {
    String name;
    boolean homeless;

    public Dog(String nameForNewDogs, boolean homelessStatus) {
        this.name = nameForNewDogs;
        this.homeless = homelessStatus;
    }

    public void eat(String typeOfFood) {
        System.out.println("Dog eats " + typeOfFood);
    }
}
