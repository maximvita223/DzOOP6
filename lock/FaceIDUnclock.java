package lock;
public class FaceIDUnclock extends Unlock {
    private String faceID;
    
    public FaceIDUnclock(String faceID) {
        this.faceID = faceID;
    }

    

    public void unlockFaceID(String OtherFaceID) {
        if(mode == 1){
            System.out.println("Телефон разблокирован");
           
        }
        else{
            System.out.println("Телефон заблокирован");
            if (OtherFaceID.equals(faceID)) {
                mode = 1;
                System.out.println("Phone unlock");
            } else {
                System.out.println("Неверный отпечаток");
            }
            
           
        }
    }



    @Override
    public void lock() {
        // TODO Auto-generated method stub
        super.lock();
    }



    @Override
    public void unlock() {
        // TODO Auto-generated method stub
        super.unlock();
    }

}

