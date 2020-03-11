package com.jt.manage.service;


import com.jt.common.vo.EasyUIResult;

public interface ItemService {

    public EasyUIResult findItemListByPage(Integer page, Integer rows);
}
