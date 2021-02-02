package com.ly.mapper;

import com.ly.bean.ImoocClass;
import org.apache.ibatis.annotations.*;

//指定只是一个操作数据库的mapper
//@Mapper
public interface ImoocClassMapper {

//    @Select("select * from imooc_class where id=#{id}")
    public ImoocClass getClassById(Integer id);

//    @Options(useGeneratedKeys = true,keyProperty = "id")
//    @Insert("insert into imooc_class(class_name) values (#{className})")
    public void insertImoc(ImoocClass imoocClass);

//    @Update("update imooc_class set class_name=#{className}")
//    public int updateImoc(ImoocClass imoocClass);
//
//    @Delete("delete from imooc_class where id=#{id}")
//    public int deleteClassById(Integer id);
}
