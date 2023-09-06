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
    }
}