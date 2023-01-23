package lock;
public class PINUnclock extends Unlock {
    private int pin;

    public PINUnclock(int pin) {
        this.pin = pin;
    }
    public void unlock(int userPin){
        if(mode == 1){
            System.out.println("Телефон заблокирован");
        }
        else{
            if (userPin==pin && mode==0) {
                mode = 1;
                System.out.println("Phone unlock");
            } else {
                System.out.println("Неверный отпечаток");
            }
        }
    }
}
