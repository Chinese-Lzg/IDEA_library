package com.luruan.mapper;

import com.luruan.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

 /**
2 * @Author: ZG
3 * @Date: 2020/9/3 9:08
4 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
     /**
      * 批量插入
      * @param list
      * @return
      */
    int batchInsert(@Param("list") List<User> list);

     /**
      * 更新
      * @param record
      * @return
      */
    int insertOrUpdate(User record);

     /**
      * 插入或更新选择性
      * @param record
      * @return
      */
    int insertOrUpdateSelective(User record);
}