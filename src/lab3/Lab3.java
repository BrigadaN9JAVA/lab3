package lab3;

public class Lab3 {

    static public void main(String[] args){
        // Test Task4
        Calculator.printResultT4(25, 16, 1);
        Calculator.printResultT4(100, 25, 30);
        Calculator.printResultT4(100, 25, 31);
        Calculator.printResultT4(-5, 25, 15);
        Calculator.printResultT4(100, -100, 3);

        System.out.println();

        // Test Task10
        Calculator.printResultT10(-2, 1);
        Calculator.printResultT10(4, 1);
        Calculator.printResultT10(-10, 3);
        Calculator.printResultT10(100, 10);
        Calculator.printResultT10(-10, -100);

        System.out.println();

        // Test Task11
        Calculator.printResultT11(10);
        Calculator.printResultT11(0.255);
        Calculator.printResultT11(0.00001);
        Calculator.printResultT11(0.1);
        Calculator.printResultT11(-100);
    }
}

class Calculator {

    static public void printResultT4(double a, double b, int k){
        System.out.print("> a:" + a + " b:" + b + " k:" + k + " result:");
        try {
            System.out.println(task4(a, b, k));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception! " + e.getMessage());
        }
    }

    static private double task4(double a, double b, int k){
        if (a < 0){
            throw new IllegalArgumentException("param a = " + a);
        } else if (b < 0){
            throw new IllegalArgumentException("param b = " + b);
        } else if (k > 30 || k < 1)
            throw  new IllegalArgumentException("param k = " + k);
        double s = 0;
        for (int i = 1; i <= k ; i++) {
            s += Math.sqrt(a * i * Math.sqrt(b/i));
        }
        return s;
    }

    static public void printResultT10(double t, int n) {
        System.out.print("> t:" + t + " n:" + n + " result:");
        try {
            System.out.println(task10(t, n));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception! " + e.getMessage());
        }
    }

    static private double task10(double t, int n){
        if (n < 1){
            throw new IllegalArgumentException("param n = " + n);
        }

        double s = 0;

        if (t < 0){
            for (int i = 1; i <= n ; i++) {
                s += (t*t)*i;
            }
        } else {
            for (int i = 1; i <= n ; i++) {
                s += Math.sqrt(t*i);
            }
        }
        return s;
    }

    static public void printResultT11(double E) {
        System.out.print("> E:" + E + " result:");
        try {
            System.out.println(task11(E));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception! " + e.getMessage());
        }
    }

    static private double task11(double E){
        if (E <= 0){
            throw new IllegalArgumentException("param E = " + E);
        }

        double s = 0;
        int i = 1;
        double temp = 0;
        while ((temp = 1d/(i*i)) >= E){
            s += temp;
            i++;
        }

        return s;
    }

    static double task(double E){
        double s = 0;
        int i = 0;
        while((Math.pow(-2, i)/(fact(i)*(i + 1))) >= E){
            s += Math.pow(-2, i)/(fact(i)*(i + 1));
            i++;
        }
        return  s;
    }

    static int fact(int i){
        if(i == 0)
            return 1;
        else
            return i * fact(i-1);
    }
}
