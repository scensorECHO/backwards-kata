import java.util.LinkedList;
public class BackWardsPrime {
	
	public static String backwardsPrime(long start, long end) {
		LinkedList<String> list = new LinkedList<>();
    for(long l=start;l<end;l++){
      if(isPrime(l) && l > 10){
        if(isPrime(reversed(l))){
          list.add(String.valueOf(l));
        }
      }
    }
    System.err.print("HELLO THEREE");
    return String.join(" ",list);
    
          
	}
  
  static boolean isPrime(long n) {
    if (n%2==0) return false;
    for(int i=3;i*i<=n;i+=2) {
        if(n%i==0)
            return false;
    }
    return true;
  }
  
  static long reversed(long n){
    if(n<10)
      return n;
    else
      return (n%10 + reversed(n/10))*10;
  }
}
