import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main init");

        Recursivity recursivity = new Recursivity();
        System.out.println("El resultado de recursiva para 4: "+ recursivity.sum(4));

        Lineal lineal = new Lineal();
        System.out.println("El resultado de la suma adyacente es: "+lineal.adyacentSum(4));

        ArrayList<Integer> myarray = new ArrayList<Integer>();
        myarray.add(2);
        myarray.add(4);
        myarray.add(2);
        myarray.add(5);
        myarray.add(9);
        myarray.add(6);
        myarray.add(8);
        myarray.add(1);

        DropConst dropConst = new DropConst();
        dropConst.minAndMaxsV1(myarray);
        dropConst.minAndMaxsV2(myarray);

        Rec recClass = new Rec();
        System.out.println("Recursive sums are from 4 tree: " + recClass.myRecFunc(4));

        System.out.println("Factorial from 5 is: "+recClass.factorial(5));

        Loop loop = new Loop();
        System.out.println("is 7 prime? "+loop.isPrime(7));

        System.out.println("List of 20 first primes: "+ loop.listPrimes(20));
    }
}