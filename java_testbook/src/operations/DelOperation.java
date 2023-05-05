package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author tian
 */
public class DelOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");
        System.out.println("请输入你要删除的图书：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //1.遍历数组当中 是否有你要的书 有记录下标
        int index = -1;
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())) {
                index = i;
                break;
            }
        }
   if (index == -1){
       System.out.println("没有你要删除的书！");
       return;
        }
        for (int i = index; i < currentSize-1 ; i++) {
            Book book = bookList.getPos(i+1);
            bookList.setBooks(book,i);
        }
        //每次删除都要置空
        //在Java当中 一个对象 只有没有人引用的时候 才会回收。
        bookList.setBooks(null,currentSize-1);

        System.out.println("删除成功！");

        bookList.setUsedSize(currentSize-1);
    }
}

