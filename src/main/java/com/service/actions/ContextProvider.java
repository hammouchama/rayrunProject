package com.service.actions;

import com.service.Entitys.Articles_Stock;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextProvider {
	
	private static ApplicationContext context;
	  
    public static ApplicationContext provideContext()
    {
        if(context==null)
        {
            context=new ClassPathXmlApplicationContext("applicationContext.xml");
        }
        return context;
    }

   /* public static void main(String[] args) {
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
       Articles_Stock art= context.getBean("articl_stock", Articles_Stock.class);
    }*/
}
