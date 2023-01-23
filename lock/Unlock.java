package lock;

public abstract class Unlock {

    protected int mode = 0;

public void lock(){
    if(mode == 1){
        mode = 0;
    }
    else{
        System.out.println("Телефон уже заблокирован");
    }
}
public void unlock(){
    if(mode == 0){
        mode = 1; 
    }
    else{
        System.out.println("Телефон уже разблокирован");
    }
}
}
