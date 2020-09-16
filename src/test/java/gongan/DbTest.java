package gongan;


import com.demo.mybatisplus.domain.db.警报器;
import com.demo.mybatisplus.util.DBUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 曾睿
 * @Date: 2020/7/21 19:57
 */
public class DbTest {
    public static void main(String[] args) {
        DBUtil.setConnection();

        List<警报器> list = new ArrayList<>();
        list.add(new 警报器());
        list.add(new 警报器());
        list.add(new 警报器());
        DBUtil.create("警报器", "com.sxt.domain.db.警报器");
        DBUtil.insert("警报器", list);

        DBUtil.endConnection();

    }
}
