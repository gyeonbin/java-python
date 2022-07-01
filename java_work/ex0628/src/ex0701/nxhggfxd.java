package ex0701;

public class nxhggfxd {
	
	   public static boolean Prime(int n){
	         if(n==1||n==2) {
	            System.out.println("소수아님:"+n);
	            return false;
	         }
	         for(int i=2;i<100;i++) {
	            if((n%i)==0){
	               System.out.println("소수아님:"+n);
	               return false;
	            } else {
	               return true;
	            }
	         }
	      }

	   public static void main(String[] args) {
	         int num = 1;
	         boolean result;
	         while (num < 101) {
	            result =Prime(num);
	            System.out.println("소수인가요?" + result);
	            num++;
	         }
	      }
	   }
}
