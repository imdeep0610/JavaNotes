package deep12;
//the sieve of Eratosthenes is an ancient algorithm for finding all prime numbers up to any given limit.
public class SieveOfEratosthenes {
    public static void main(String[] args) {
      int n=40;
      boolean[] primes=new boolean[n+1];//n+1 bcoz we want to add 40 also and nstrt frm 0
        sieve(n,primes);
    }
    static void sieve(int n, boolean[] primes){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(!primes[i]){ //for ex i=2, if its sayng i=2 is prime thn we go and chck multiple of 2
               for(int j=i*2;j<=n;j+=i){
                   primes[j]=true;
               }
            }
        }
        for(int i=2;i<=n;i++){
            if (!primes[i]){
                System.out.println(i + " ");
            }
        }
    }
}
