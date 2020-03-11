package com.jt.manage.service;

import com.jt.common.po.Item;
import com.jt.common.vo.EasyUIResult;
import com.jt.manage.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemMapper itemMapper;


    /**
     * 需要分页 如何分页 查询总记录数count 当前页几page 每页的条数rows
     * 总页数pageCount=（count-1）/rows+1  前面-1缺1页后面加回来 顺便0保证肯定留了一页
     * limit从第几条开始（page-1）*rows  ，rows
     *
     * @param page
     * @param rows
     * @return
     */
    @Override
    public EasyUIResult findItemListByPage(Integer page, Integer rows) {
        int count=itemMapper.findItemCount();
        //int pageCount=(count-1)/rows+1;
        int start= (page-1)*rows;
        List<Item> itemList=itemMapper.findItemList(start,rows);
        return new EasyUIResult(count ,itemList);
    }
}
