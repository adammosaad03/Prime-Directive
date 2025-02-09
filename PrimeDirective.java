// Import statement:
import java.util.Arrays;
import java.util.ArrayList;

class PrimeDirective {
  
  ArrayList<Integer> primes = new ArrayList<Integer>();
  // Add your methods here:
  public boolean isPrime(int nums){
     if(nums == 2){
        return true;
      }
      else if(nums < 2){
        return false;
      }


    for(int i=2; i<nums; i++){
      
      if(nums % i == 0 ){
        return false;
      }
      
    }
    return true;
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    
    for(int n : numbers){
      if(pd.isPrime(n)){
        System.out.println(n + " : Is a Prime number");
      }
      else{
        System.out.println(n + " : Is not a Prime number");

      }
    }

  }  

}
