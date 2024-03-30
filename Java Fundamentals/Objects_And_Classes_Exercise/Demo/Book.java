package Objects_And_Classes_Exercise.Demo;

public class Book {
    private String title;

    private String author;

    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void sell() {
        System.out.printf("Book with title: %s from the author %s was successfully sold for %.2f",
                this.title,this.author, this.price);
    }
}
