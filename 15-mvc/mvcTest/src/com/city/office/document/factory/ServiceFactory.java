package com.city.office.document.factory;

import com.city.office.document.service.INewsService;
import com.city.office.document.service.impl.NewsServiceImpl;

//�о�̬����ȡ��ҵ������ҵ��ӿڶ���
//CO Ҫ�õ�ҵ���SO������Ҫͨ��ҵ�񹤳���ľ�̬����ȡ��ָ����ҵ��ӿڶ���

public class ServiceFactory {
public static INewsService createINewsService(){
	return new NewsServiceImpl();
}
}
