import java.util.ArrayList;

public class DropConst {

    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;

    protected void minAndMaxsV1(ArrayList<Integer> array){
        long initTime = System.currentTimeMillis();
        for(int x : array){
            if( x < min) min = x;
            if( x > max) max = x;
        }
        System.out.println("Max is: "+ max);
        System.out.println("Min is: "+ min);

        long totalTime = System.currentTimeMillis() - initTime;
        System.out.println("Timing in ms V1"+ System.currentTimeMillis() +" "+ initTime);
    }

    protected void minAndMaxsV2(ArrayList<Integer> array){
        long initTime = System.currentTimeMillis();
        for(int x : array){
            if( x < min) min = x;

        }
        for(int x : array){

            if( x > max) max = x;
        }
        System.out.println("Max is: "+ max);
        System.out.println("Min is: "+ min);

        long totalTime = System.currentTimeMillis() - initTime;
        System.out.println("Timing in ms V2: "+ String.valueOf(totalTime));
    }

}
