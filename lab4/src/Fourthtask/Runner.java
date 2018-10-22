package Fourthtask;

public class Runner implements Runnable{
    private  double speed = 0;
    Runner(){}
    Runner(double speed){
        this.speed = speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getSpeed(){
        return this.speed;
    }
    public String indicateSpeed(){
        String res;
        if(this.speed >= 10){
            res = "Fast";
        }else{
            if(this.speed < 10 && this.speed >= 5){
                res = "Medium";
            }else{
                res = "Slow";
            }
        }
        return res;
    }
    public boolean isRunning(){
        boolean res;
        if(this.indicateSpeed().equals("Fast")){
            res = true;
        }else{
            res = false;
        }
        return res;
    }

}
