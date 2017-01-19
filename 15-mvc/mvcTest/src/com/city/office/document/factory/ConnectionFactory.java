package com.city.office.document.factory;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
//��д���ݿ����ӹ�����
public class ConnectionFactory {
	public static Connection getConnection() throws Exception{
		Context ctx=new InitialContext();
		DataSource ds=(DataSource) ctx.lookup("java:comp/env/cityoa");
		Connection cn=ds.getConnection();
		ctx.close();
		return cn;
	}
}
