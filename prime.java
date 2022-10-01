import java.util.*;

public class Prime{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter two numbers: ");
         int a = sc.nextInt();
         int b = sc.nextInt();
         System.out.println("All prime numbers between "+a+" and "+b+" are: ");
         if(a<b){
             for(int i=a;i<=b;i++){
                  if(isPrime(i)==1){
                       System.out.println(i);
                  }
             }
         }
     }
     public static int isPrime(int n){
     int flag=0;
     if(n==2 || n==3){
         return 1;
     }
     else{
         for(int i=2;i<=n/2;i++){
             if(n%i==0){
                 flag=1;
                 break;
             }
         }
         if(flag==0){
             return 1;
         }
         else{
             return 0;
         }
     }
    }
}

