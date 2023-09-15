public class Loop {

    protected boolean isPrime(int n){

        for (int x=2; x*x <= n; x++){
         if (n % x == 0){
             return false;
         }
        }
        return true;
    }

    protected String listPrimes(int upto){
        StringBuilder sb = new StringBuilder();

        for (int l = 0 ; l<= upto ; l++) {
            boolean previousNonPrime = false;
            for (int x = 2; x * x <= l; x++) {
                if (l % x == 0) {
                    sb.append("\n" + l + " is not prime");
                    previousNonPrime = true;
                    break;
                }
            }
            if (!previousNonPrime)
                sb.append("\n" + l + " IS PRIME");
        }
        return sb.toString();
    }
}
