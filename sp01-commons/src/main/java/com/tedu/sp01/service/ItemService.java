package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/*
	 * ͨ������id����ȡ��Ʒ�б�
	 * 
	 */
	List<Item> getItems(String orderId);
	/*
	 * �ڱ��涩��ʱ������Ʒ���
	 */
	void decreaseNumbers(List<Item> list);
}
