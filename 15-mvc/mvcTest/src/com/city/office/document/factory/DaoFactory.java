package com.city.office.document.factory;

import com.city.office.document.Dao.impl.NewsDaoImpl;
import com.city.office.document.Dao.INewsDao;

public class DaoFactory {
//ȡ��DAO�ӿڵĶ��� Ϊ�ϲ�ҵ��SO�����ṩ����
//�������ϲ����SOֱ��ʹ��new DAOʵ�����ģʽ
//������ϲ�ҵ���SOʵ���������DAOʵ����������ϣ������ϵͳ�Ŀ�ά����
	
	public static INewsDao createINewsDao(){
		return new NewsDaoImpl();
	}
}
