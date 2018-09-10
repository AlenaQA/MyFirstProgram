public class Crocodile extends Animal implements Running, Swimming {
    public void runFast() {
        System.out.println("Crocodile is running fast");
    }

    public void swim() {
        System.out.println("Crocodile is swimming");
    }

    public void run() {
        System.out.println("Crocodile is just running");
    }

    public void swimFast() {
        System.out.println("Crocodile is swimming fast");
    }

    public void dive() {
        System.out.println("Crocodile is diving");
    }
}
