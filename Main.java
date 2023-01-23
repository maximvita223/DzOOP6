import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FaceIDUnclock un = new FaceIDUnclock("ggr");
        Scanner sc = new Scanner(System.in);
        while (true) {
            un.unlock(sc.nextLine());
            
        }
        
    }
    
}