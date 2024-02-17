import java.util.Scanner;
class MathExamples {
    int x;
    int a;
    int b;


    MathExamples(int x) {
        this.x = x;

    }

    MathExamples(int a, int b) {
        this.a = a;
        this.b = b;

    }

    MathExamples(int a, int b, int x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public void Calc1(int x){
        int result = 3 * x + 5;
        System.out.printf("3 * %d + 5 = %d", x, result);

    }

    public void Calc2(int a, int b){
        if (a == b){
            System.out.println("На ноль делить нельзя");
            return;
        }
        int result = (a + b)/ (a - b);
        System.out.printf("(%d + %d)/(%d - %d) = %d", a, b, a, b, result);
    }

    public void Calc3(int a, int b, int x){
        if (b == 0){
            System.out.println("На ноль делить нельзя");
            return;
        }
        int res0 = (a * x) / b;
        int result = 1;
        for (int i = 1; i <= res0; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введи значение x1: ");
        int x1 = input.nextInt();
        MathExamples n1 = new MathExamples(x1);
        n1.Calc1(x1);
        System.out.println();

        System.out.print("Введи значение a1: ");
        int a1 = input.nextInt();
        System.out.print("Введи значение b1: ");
        int b1 = input.nextInt();
        MathExamples n2 = new MathExamples(a1, b1);
        n2.Calc2(a1, b1);
        System.out.println();

        System.out.print("Введи значение a2: ");
        int a2 = input.nextInt();
        System.out.print("Введи значение b2: ");
        int b2 = input.nextInt();
        System.out.print("Введи значение x2: ");
        int x2 = input.nextInt();
        MathExamples n3 = new MathExamples(a2, b2, x2);
        n3.Calc3(a2, b2, x2);
    }
}