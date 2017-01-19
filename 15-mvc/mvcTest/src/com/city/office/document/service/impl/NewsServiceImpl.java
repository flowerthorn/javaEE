package com.city.office.document.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.city.office.document.Dao.INewsDao;
import com.city.office.document.factory.ConnectionFactory;
import com.city.office.document.factory.DaoFactory;
import com.city.office.document.model.NewsModel;
import com.city.office.document.service.INewsService;
//��д����ҵ��ӿ�ʵ���ࣺNewsServiceImpl
//ʵ������ҵ��ӿ�INewsService����ķ���.
public class NewsServiceImpl implements INewsService {
//ҵ��ʵ��������Ҫ����DAO��ķ�����������ݳ־û� ����
//����ֱ�Ӳ������ݿ⣬����Ҫͨ������DAO�������ʵ��
//ͨ����ҵ��ʵ������룬���������������ݿ�ִ��SQL�Ĳ����Ѿ���װ��DAO�������
//ҵ�����ı�д�൱���ף��ǳ������޸ĺ�ά������� ��ϵͳ��ҵ��仯����Ӧ����
	@Override
	public void add(NewsModel nm) throws Exception {
		
		DaoFactory.createINewsDao().create(nm);
	/* ����ʾ��  
	 * INewsDao idao=DaoFactory.createINewsDao();
		idao.create(nm);*/
	
	
	}

}
