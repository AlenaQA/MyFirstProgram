public class Cat {
    String name;
    int age;
    String color;
    boolean hasMedals;

    public Cat(String nameForNewCats, int ageForNewCats, String colorForNewCats, boolean hasMedalsForNewCats) {
        this.name = nameForNewCats;
        this.age = ageForNewCats;
        this.color = colorForNewCats;
        this.hasMedals = hasMedalsForNewCats;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }





    /*public static Cat bornCat(String nameForNewCats, int ageForNewCats) {
        Cat cat = new Cat(nameForNewCats, ageForNewCats);
        System.out.println("I was born!");

        return cat;
    } */

    public void scratch() {
        System.out.println(this.name + " is brrrrrr");
    }

    public void fight() {
        System.out.println(this.name + " is fighting");
    }

    public void run() {
        System.out.println(this.name + " is running");
    }
}
