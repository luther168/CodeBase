package cn.luo.mybatis.dao.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface SQLiteMapper {
    @Select("select * from UserInfo")
    List<Map<String,Object>> getList();
}
