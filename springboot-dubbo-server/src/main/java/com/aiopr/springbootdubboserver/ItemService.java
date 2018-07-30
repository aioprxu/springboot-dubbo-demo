package com.aiopr.springbootdubboserver;

public interface ItemService {
    //检查商品是否可售
    boolean checkItemStatus(String id);
}