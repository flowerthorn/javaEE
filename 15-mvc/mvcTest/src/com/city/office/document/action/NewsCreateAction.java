package com.city.office.document.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.office.document.factory.ServiceFactory;
import com.city.office.document.model.NewsModel;
import com.city.office.document.service.INewsService;


/**
 * Servlet implementation class NewsCreateAction
 */
@WebServlet({ "/NewsCreateAction", "/news/add.action" })
public class NewsCreateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public NewsCreateAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no=0;
		String subject=null;
		String content=null;
		String newsdate=null;
		String author=null; 
		try {		
	     String idd=request.getParameter("no");
	     String sub=request.getParameter("subject");
	     String con=request.getParameter("content");
	     String newsdatee=request.getParameter("date");
	     String anthuor=request.getParameter("author");
	     if(idd!=null){
	    	 no=Integer.parseInt(idd);
	     }
	     
	     if(sub!=null){
	    	subject=sub;
	     }
	     if(con!=null){
	     	content=con;
	      }
	     if(newsdatee!=null){
	      newsdate=newsdatee;
	       }
	     if(anthuor!=null){
	      	author=anthuor;
	       }    
	     NewsModel nm=new NewsModel();
	     nm.setNewsno(no);
	     nm.setSubject(subject);
	     nm.setAuthor(author);
	     nm.setContent(content);
	     nm.setNewsdate(newsdate);
	     System.out.println("no="+no);
	  //ȡ��ҵ����� SO�� 
	   INewsService ins=ServiceFactory.createINewsService();
	   ins.add(nm);//ҵ��㷽�� ����������SO�㣩�ٵ���DAO��
		RequestDispatcher rDispatcher=request.getRequestDispatcher("success.jsp");
		rDispatcher.forward(request, response);
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
