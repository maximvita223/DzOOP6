public class FaceIDUnclock extends Unlock {
    private String faceID;
    
    public FaceIDUnclock(String faceID) {
        this.faceID = faceID;
    }

    public void unlock(String OtherFaceID) {
        if(lockUnlock()){
            System.out.println("Телефон заблокирован");
        }
        else{
            if (OtherFaceID==faceID && mode==0) {
                mode = 1;
                System.out.println("Phone unlock");
            } else {
                System.out.println("Неверный отпечаток");
            }
        }
    }
}
