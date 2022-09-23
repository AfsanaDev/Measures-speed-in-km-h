package bit.com;
import java.util.Scanner;
class inData{
    double distance;
    double time;
    double speed;
    public void initializeInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your distance in meters :"+" ");
        distance = scan.nextInt();
        System.out.print("Enter time taken in minutes :"+" ");
        time = scan.nextInt();
    }
    public void printInfo(){
        double timeSec = time / 60;
        //System.out.format(String.valueOf(timeSec));
        speed = (distance / timeSec)/1000 ;
        System.out.println("Speed in Km/h is :"+" "+speed);
    }
}

public class findSpeed {
    public static void main(String[] args) {
        inData data = new inData();
        data.initializeInfo();
        data.printInfo();
    }
}
