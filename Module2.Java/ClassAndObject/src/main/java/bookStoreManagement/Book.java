package bookStoreManagement;

public class Book {
    private String nameBook;
    private double cost;
    private int yearPublish;

   private Author author;

    public Book(String nameBook, double cost, int yearPublish, Author author) {
        this.nameBook = nameBook;
        this.cost = cost;
        this.yearPublish = yearPublish;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }
    public void printNamebook(){
        System.out.println(this.nameBook);
    }
    public boolean checkPublishYear (Book otherBook){
       return this.yearPublish==otherBook.yearPublish;
    }
    public double costDistance (double x){
        return this.cost*(1-x/100);
    }
}
