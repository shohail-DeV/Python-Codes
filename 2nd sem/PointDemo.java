import java.util.Scanner;

public class PointDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Point point1= new Point();
        Point point2= new Point();
        System.out.print("Enter X,Y Point1: ");
        point1.setPoint(sc.nextInt(), sc.nextInt());
        System.out.print("Enter X,Y Point2: ");
        point2.setPoint(sc.nextInt(), sc.nextInt());

        System.out.print("Point 1: "); point1.showPoint();
        System.out.print("Point 2: "); point2.showPoint();

        System.out.println("The Distance is "+point1.findDistance(point2));
        sc.close();
    }
}
class Point{
    int x,y;
    void setPoint(int m,int n){
        x=m;
        y=n;
    }
    void showPoint(){
        System.out.print("The X-Co-Ordinate is "+x);
        System.out.println("The Y-Co-Ordinate is "+y);
    }
    int findDistance(Point p){
        return (int)Math.sqrt(Math.pow(x-p.x,2)+Math.pow(y-p.y,2));
    }
}
