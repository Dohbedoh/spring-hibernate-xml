package com.dohbedoh;

import com.dohbedoh.dao.CompanyDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Allan on 23/10/2015.
 */
public class SpringHibernateSandbox {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-hibernate-sandbox.xml");

        CompanyDAO companyDAO = (CompanyDAO) context.getBean("companyDAO");
        System.out.println(companyDAO.findAll().size());
    }
}
