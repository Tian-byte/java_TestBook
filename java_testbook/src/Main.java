import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * @author tian
 */
public class Main {

    public static User login() {
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("请输入你的身份：1-> 管理员，0-> 普通用户");
        int choice = scanner.nextInt();
        if (choice == 1){
            return new AdminUser(userName);
        }else{
            return  new NormalUser(userName);
        }
    }

    public static void main(String[] args) {
        //0.准备数据
        BookList bookList = new BookList();
        //1.登录
       User  user =  login();
       while (true) {
           int choice = user.menu();
           user.doOperation(choice, bookList);
       }
    }


}
