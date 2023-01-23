public abstract class Unlock {
    
    protected int mode = 0;

public Boolean lockUnlock(){
    if(mode==0){
        mode = 1;
        return false;
    }
    else{
        mode = 0;
        return true;
    }
}
}
