import java.sql.*;

public class BookManage {
    private String url = "jdbc:postgresql://localhost:5432/book_management";
    private String username = "postgres";
    private String password = "qweasdzxc";
    Connection connection;
    Statement statement;


    public BookManage() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }

    public void addBook(Book book) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into book (title , author, price, stock) values (?, ?, ?,?)");
        statement.setString(1, book.getTitle());
        statement.setString(2, book.getAuthor());
        statement.setInt(3, book.getPrice());
        statement.setInt(4, book.getStock());
        statement.executeUpdate();
        System.out.println("book added to table");
    }

    public void updateBookInfo(int id, Book book) throws SQLException {
        statement = connection.createStatement();
        String sql = "update book set title = '" + book.getTitle() + "',  author = '" + book.getAuthor() + "' , price = " + book.getPrice() +
                " where id = " + id;
        statement.executeUpdate(sql);
        System.out.println("the book updated...");
    }

    public void deleteBook(int id) throws SQLException {
        statement = connection.createStatement();
        String sql = "delete from book where id = " + id;
        statement.executeUpdate(sql);
        System.out.println("Book deleted!!!!");
    }


    public static void main(String[] args) throws SQLException {
        Book newBook = new Book("title0", "author0", 10000, 10);
        BookManage bookManage1 = new BookManage();
//        bookManage1.updateBookInfo(1, newBook);
//        bookManage1.deleteBook(2);
        bookManage1.addBook(newBook);

    }

}