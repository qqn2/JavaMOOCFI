
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance() {
   if(this.day < 30) 
   {this.day++;}
   
   else {
       this.day=1;
   if(this.month < 12) 
    this.month++;
   else {this.month=1;this.year++;}}
   
    }
    public MyDate afterNumberOfDays(int days){
    MyDate newMyDate = new MyDate(day, month, year);
    newMyDate.advance(days);
    // some code here

    return newMyDate;
}
  
    public void advance(int numberofdays){
        for (int i = 0; i < numberofdays; i++) {
            advance();
        }
    }
}
