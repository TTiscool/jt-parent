package com.jt.manage.mapper;

import com.jt.common.po.Item;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemMapper {

    @Select("select count(*) from tb_item")
    int findItemCount();

    List<Item> findItemList(@Param("start") Integer start, @Param("rows")Integer rows);
}
