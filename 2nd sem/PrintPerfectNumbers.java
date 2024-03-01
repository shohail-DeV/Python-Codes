import java.util.Scanner;

public class PrintPerfectNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N: ");
        System.out.println(isPerfectNumber(sc.nextInt()));
        int count=0; boolean lb=true;
        for(int i=1;i<=1000000;i++){
            if (isPerfectNumber(i)) {
                System.out.printf("%-10d",i);
                count++;
                lb=true;
            }
            if(count%10==0&&lb) {
                System.out.println();
                lb=false;
            }
        }
        System.out.println("\nNumber of perfect numbers below "+10000000+"is "+count);
        sc.close();
    }
    //to check if perfect number
    public static boolean isPerfectNumber(int n){
        int sum=0,r,count=0,org=n;
        int [] array=new int[40];
        do{
            r=n%10;
            array[count]=r;
            n/=10;
            count++;
        }while(n>0);
        for(int i=0;i<count;i++){
            sum+=Math.pow(array[i],count );
        }
        return sum==org;
    }
}
