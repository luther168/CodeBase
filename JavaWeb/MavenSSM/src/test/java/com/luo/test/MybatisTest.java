package com.luo.test;

import cn.luo.mybatis.DBHelper;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class MybatisTest {

    private DBHelper dbHelper = DBHelper.getInstance();

    @Test
    public void find() {
        List<Map<String, Object>> list = dbHelper.select("UserInfo");
        System.out.println(list);
    }
}
