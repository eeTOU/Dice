
public class Dice {

    public static void main(String[] args) {

        Die die1 ,die2;
        int sum;

        die1 = new Die();
        die2 = new Die();

        die1.roll();
        die2.roll();
        System.out.println("Die1 :" + die1 + "\t" + "Die2 :" + die2);

        sum = die1.getFaceValue() +die2.getFaceValue();
        System.out.println("Sum :"+sum);

    }
}
