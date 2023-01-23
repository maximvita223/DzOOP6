package lock;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        FaceIDUnclock un = new FaceIDUnclock("1");
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            un.unlockFaceID(sc.next());
            sc.close();
        }
        // sc.close();
        
     
    }

    }

    
