public class Main {
    public static  void main (String [] args) {
        /*Builder builder = new Builder();
        builder.speak();
        builder.move();
        builder.doWork();

        Soldier soldier = new Soldier();
        soldier.speak();
        soldier.move();
        soldier.doWork(); */

        TypicalRobot robotBuilder = new Builder();
        TypicalRobot robotSoldier = new Soldier();

        robotBuilder.doWork();
        robotSoldier.doWork();
    }
}
