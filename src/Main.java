import java.util.Scanner;

public class Main {
    public static  void main (String [] args) {
        //Animal animal = new Animal();
        SandLizard lizard = new SandLizard();
        lizard.born();
        lizard.run();
        lizard.die();

        Crocodile crocodile = new Crocodile();
        crocodile.born();
        crocodile.swim();
        crocodile.dive();
        crocodile.die();







        /*City city1 = new City("Berlin");
        City city2 = new City("Moscow", 5000000);
        City city3 = new City("New York", 3000000, false);
        City city4 = new City("Istanbul", 900000, true, false);

        city1.cityInfo();
        city2.cityInfo();
        city3.cityInfo();
        city4.cityInfo(); */

        //city2.setSize(5500000);
        //city2.cityInfo();




        //Cat.bornCat("Petr", 10, "red", true);

        Cat cat = new Cat("Petr", 10, "red", true);

        System.out.println(cat.getName());
        cat.setName("Kesha");
        System.out.println("New name is: " + cat.getName());



        Dog dog = new Dog("Rafael", false);
        dog.eat("Sweets");

        int a = 20;
        int b = 19;
        //Calculator.sum(a, b);
        System.out.println(Calculator.sum(a, b));

<<<<<<< Updated upstream
        System.out.println("Text in alter");
        System.out.println("7");

        System.out.println("Exclusive for master");
=======
        /* Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int d = scan.nextInt();
        Calculator.sum(c, d); */
>>>>>>> Stashed changes
    }
}
