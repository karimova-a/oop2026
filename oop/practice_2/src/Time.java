public class Time {
    private int hour ;
    private int minute ;
    private int second ;

    public Time(int hour, int minute, int second){
        if(hour >= 0 && hour <= 23){
            this.hour = hour ;
        }
        else{ this.hour = 0; }

        if(minute >= 0 && minute <= 59){
            this.minute = minute ;
        }
        else{ this.minute = 0; }

        if(second >= 0 && second <=59){
            this.second = second ;
        }
        else{ this.second = 0; }

    }

    private String formatTwoDigits(int n) {
        if(n < 10) {
            return "0" + n;  
        } else {
            return "" + n;  
        }
    }

    public String toUniversal(){
        return formatTwoDigits(hour) + ":" + formatTwoDigits(minute) + ":" + formatTwoDigits(second) ;
    }

    public String toStandard(){
        String period ;
        int displayHour ;

        if(hour == 0){
            displayHour = 12 ;
            period = "AM" ;
        }
        else if(hour == 12){
            displayHour = 12 ;
            period = "PM" ;
        }
        else if(hour > 12){
            displayHour = hour - 12 ;
            period = "PM" ;
        }
        else{
            displayHour = hour ;
            period = "AM" ;
        }

        return formatTwoDigits(displayHour) + ":" + formatTwoDigits(minute) + ":" + formatTwoDigits(second) + " " + period ;
    }

    public void addTime(Time other){
        this.second += other.second ;
        if(this.second >= 60){
            this.minute += this.second / 60 ;
            this.second %= 60 ;
        }

        this.minute += other.minute ;
        if(this.minute >= 60){
            this.hour += this.minute / 60 ;
            this.minute %= 60 ;
        }

        this.hour += other.hour ;
        this.hour %= 24 ;

    }

    public static void main(String[] args){
        System.out.println("Test time:") ;
        Time t1 = new Time(22,40,33) ;
        System.out.println("To universal: " + t1.toUniversal()) ;
        System.out.println("To standard; " + t1.toStandard()) ;

        Time t2 = new Time(1, 30,40) ;
        System.out.println("To universal: " + t2.toUniversal()) ;
        System.out.println("To standard; " + t2.toStandard()) ;

        t1.addTime(t2) ;
        System.out.println("Adding times: " + t1.toUniversal()) ;
    }
}
