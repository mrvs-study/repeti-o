public class numeros_impars {
    public static void main(String[] args) {

        int somar;
        for (int i = 0; i <= 100; i++) {

            somar = i % 2;

            if (somar == 1) {
                System.out.println("o numero " + i + " é impar");
            }
            if (somar == 0) {
                System.out.println("o numero " + i + " é par");

            }
        }

    }
}
