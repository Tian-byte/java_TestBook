package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author tian
 */
public class AddOperation implements IOPeration {

    public void work(BookList bookList) {
        //添加图书
        System.out.println("新增图书！");
        System.out.println("请输入你要新增的图书姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你要新增的图书作者：");
        String author = scanner.nextLine();
        System.out.println("请输入你要新增的图书价格：");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入你要新增的图书类型：");
        String type = scanner.nextLine();


        Book book = new Book(name,author,price,type);
        //1.获取当前位置可以存放书的位置
        int currentSize = bookList.getUsedSize();
        //2.把书放到指定位置
        bookList.setBooks(book,currentSize);
        //3.书的有效个数+1
        bookList.setUsedSize(currentSize+1);
    }
}
