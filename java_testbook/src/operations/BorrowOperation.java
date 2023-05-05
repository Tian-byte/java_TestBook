package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author tian
 */
public class BorrowOperation implements IOPeration{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍！");
        System.out.println("请输入你要借阅的图书！");
        Scanner scanner =  new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())) {
             book.setBorrowed(true);
                System.out.println("借阅图书成功！");
            return;
            }
        }
            System.out.println("没有你要借阅的书！");
        }
    }

