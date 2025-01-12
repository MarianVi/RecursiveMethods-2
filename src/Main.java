import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO
        int numar = scanner.nextInt();
        System.out.println(lungimeNumar(numar));
    }

    public static int lungimeNumar(int num) {

        if (num == 0) {
            return 1;
        }

        return lungimeNumarRecursiv(num);
    }

    public static int lungimeNumarRecursiv(int numar) {

        if (numar == 0) {
            return 0;
        }

        return 1 + lungimeNumarRecursiv(numar / 10);
    }
}
