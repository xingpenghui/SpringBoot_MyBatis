package com.qfedu.mapper;

import com.qfedu.domain.Browwer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/23 15:22
 * 基于MyBatis的注解实现数据库的操作
 */
public interface BrowwerMapper {

    //新增
    @Insert("insert into t_brow(money,lx,startDate,month) values(#{money},#{lx},now(),#{month})")
    int insert(Browwer browwer);
    //查询
    @Select("select * from t_brow")
    @ResultType(Browwer.class)
    List<Browwer> queryAll();




}
