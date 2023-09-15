public class Rec {

    protected int myRecFunc(int n){

        if (n <= 1){
            return 1;
        }
        return myRecFunc(n-1) + myRecFunc(n-1);
    }

    protected int factorial(int n){

        if(n == 0){
            return 1;
        }
        else {
            return  n* factorial(n-1);
        }
    }
}
