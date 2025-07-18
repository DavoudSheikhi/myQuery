public class Book {
    private String title;
    private String author;
    private Integer price;
    private Integer stock;
    private Integer id;

    public Book(String title, String author, Integer price, Integer stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getId() {
        return id;
    }
}
