package bookStoreManagement;

public class Birthday {
    private int date;
    private int month;
    private int year;
    public Birthday(){}

    public Birthday(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if (date>=1&&date<=31){
            this.date = date;
        }
        else System.out.println("your date is error!");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month>=1&&month<12){
            this.month = month;
        }
        else System.out.println("Wrong data");;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>=1){
            this.year = year;
        }
        else System.out.println("Wrong data");
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
