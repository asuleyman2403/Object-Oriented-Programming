class Time{
    private int hr=0;
    private int min=0;
    private int sec;
    Time(int hr,int min,int sec){
        this.sec = sec;
        if(this.sec>=60){
            this.sec = this.sec%60;
            this.min++;
        }
        this.min = min;
        if(this.min>=60){
            this.min=this.min%60;
            this.hr++;
        }
        this.hr = hr%24;
    }
    public void settime(int hr,int min,int sec){
        this.sec = sec;
        if(this.sec>=60){
            this.sec = this.sec%60;
            this.min++;
        }
        this.min = min;
        if(this.min>=60){
            this.min=this.min%60;
            this.hr++;
        }
        this.hr = hr%24;
    }
    public void add(Time tim){
        this.sec = this.sec + tim.sec;
        if(this.sec>=60){
            this.sec = this.sec%60;
            this.min++;
        }
        this.min = this.min + tim.min;
        if(this.min>=60){
            this.min=this.min%60;
            this.hr++;
        }
        this.hr = (this.hr + tim.hr)%24;
    }
    public String toUniversal(){
        String res = "";
        String shr = Integer.toString(hr);
        String smin = Integer.toString(min);
        String ssec = Integer.toString(sec);
        if(shr.length()==2){
            res = res + shr;
        }else{
            res = res + "0"+shr;
        }
        res = res + ":";
        if(smin.length()==2){
            res = res + smin;
        }else{
            res = res + "0"+smin;
        }
        res = res + ":";
        if(ssec.length()==2){
            res = res + ssec;
        }else{
            res = res + "0"+ssec;
        }
        return res;
    }
    public String toStandard(){
        boolean ok = false;
        String res = "";
        String shr = Integer.toString(hr);
        String smin = Integer.toString(min);
        String ssec = Integer.toString(sec);
        if(hr<13){
            res = res + shr;
            ok = true;
        }else{
            res = res + Integer.toString((hr-12));
        }
        res = res + ":";
        if(smin.length()==2){
            res = res + smin;
        }else{
            res = res + "0"+smin;
        }
        res = res + ":";
        if(ssec.length()==2){
            res = res + ssec;
        }else{
            res = res + "0"+ssec;
        }
        if(ok){
            res = res + " AM";
        }else{
            res = res + " PM";
        }
        return res;
    }
}
class three{
    public static void main(String[] args){
        Time t = new Time(18,15,16);
        t.settime(16,16,16);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(27,29,29);
        t.add(t2);
    }
}