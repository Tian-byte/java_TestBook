package user;

import book.BookList;
import operations.IOPeration;

/**
 * @author tian
 */
public abstract class User {
    protected String name;
    protected IOPeration[] ioPerations; //只是定义了这个数组但是并没有给这个数组初始化 内存都没有分配

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        ioPerations [choice].work(bookList);
    }
}
