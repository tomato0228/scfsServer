package ltd.tomato.utils;

/**
 * @author tomato
 * @create 2018-09-02 上午10:12
 */
public class PageUtils {
    private int page;

    public PageUtils(Object obj) {
        this.page = Integer.parseInt((String) obj);
    }

    public int getPage() {
        return this.page - 1;
    }
}
