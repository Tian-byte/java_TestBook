package book;

/**
 * @author tian
 *
 * 书架
 */
public class BookList {
    private Book[] books = new Book[10];
     private int usedSize; // 存储当前书的个数

    /**
     * 事先通过构造方法 初始化的时候 给数组里存放了三本书
     * usedSize 计数器 当等于数组长度的时候说明 满了
     */
    public BookList(){
        books[0] = new Book("三国演义","罗贯中",89,"小说");
        books[1] =  new Book("西游记","吴承恩",69,"小说");
        books[2] =  new Book("红楼梦","曹雪芹",99,"小说");
        this.usedSize = 3;
    }
    //这里应该写一些方法 操作这个数组的方法  但是我们在这里不这样做 换一种方法  接口

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book getPos(int pos){
        return books[pos];
    }

    /**
     * 存储一本书到指定的位置
     * @param book
     * @param pos  在这里指的是 最后可以存储书的位置
     */
    public void setBooks(Book book, int pos){
        books[pos] = book;
    }
}
