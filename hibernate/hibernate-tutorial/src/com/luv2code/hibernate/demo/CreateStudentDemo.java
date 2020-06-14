package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		// CREATE SESSION FACTORY
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// CREATE SESSION
		Session session = factory.getCurrentSession();
		
		try {
			// cria o objeto
			Student tempStudent = new Student("Bonita", "Applebum", "bonita@luv2code.com");
			
			// começæ a transação
			session.beginTransaction();
			
			// salva o objeto na sessão
			session.save(tempStudent);
			
			// salva (comita) a transação
			session.getTransaction().commit();
		}
		finally {
			// fecha a transação
			factory.close();
		}
		
	}

}
