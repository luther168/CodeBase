package cn.luo.mybatis.dao.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface SqlServerMapper {
    @Select("select * from MyTable")
    List<Map<String,Object>> getList();
}
