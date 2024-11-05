package ijpPractice;

class details {
    private String title;
    private String author;
    private double price;

    void details(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Title ="+title+"Author ="+author+"Price ="+price);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

public class BooksDetails {
    public static void main(String[] args) {
       details sc=new details();
       sc.details("Rich Dad Poor Dad ","James",500);
       sc.details("3 mistakes of my life","Chetan Bhagat",300);
    }

}
