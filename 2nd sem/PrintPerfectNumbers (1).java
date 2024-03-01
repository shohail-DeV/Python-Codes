public class PrintPerfectNumbers {
    public static boolean isPerfectNumber(int n){
int d=0,sum=0,rem=0,n1=n,n2=n;
        while(n != 0){
            n=n/10;
            d++;
        }
    while(n1 != 0){
        rem=n1%10;
        sum=sum+(int)Math.pow(rem,d);
        n1=n1/10;
    }
    return sum == n2;
    }
public static void main(String[] args) {
    int i,count=0;
    boolean res=false;
    for(i=1;i<=1000000;i++){
     res=isPerfectNumber(i);
     if(res == true){
         count++;
         System.out.print(i+" ");
     }
    }
    System.out.println();
    System.out.println("Total count:"+count);
}
}
