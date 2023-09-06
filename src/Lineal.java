public class Lineal {

    int adyacentSum(int num){

        int res = 0;
        for (int i=0; i<num; i++ ){
            res += doSum(i, i+1);
        }
        return res;
    }

    private int doSum(int i, int b) {
        return i+b;
    }


}
