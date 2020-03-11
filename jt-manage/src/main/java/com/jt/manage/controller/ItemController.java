package com.jt.manage.controller;


import com.jt.common.vo.EasyUIResult;
import com.jt.manage.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/query")
    @ResponseBody
    public EasyUIResult findItemListByPage(Integer page, Integer rows){
        return itemService.findItemListByPage(page,rows);
    }




}
