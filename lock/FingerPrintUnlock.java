package lock;
public class FingerPrintUnlock extends Unlock {
    private String fingerPrint;

    public FingerPrintUnlock(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    public void unlock(String otherFingerPrint) {
        if(mode == 1){
            System.out.println("Телефон разблокирован");
        }
        else{
            if (otherFingerPrint==fingerPrint && mode ==0) {
                mode = 1;
                System.out.println("Phone unlock");
            } else {
                System.out.println("Неверный отпечаток");
            }
        }
    }

       }


