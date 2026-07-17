
public class Boxing_Casting {
    public static void main(String[] args) {
        Character letra = 'A';

        System.out.println("Boxing: " + letra);

        char letra2 = Character.valueOf('A');

        System.out.println("Unboxing: " + letra2);

        int num1 = 1000000;

        System.out.println("O valor de int é: " + num1);

        short num2 = (short) num1;

        System.out.println("O valor de short é: " + num2);
    }
}