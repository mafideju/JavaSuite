package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

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
			Student tempStudent = new Student("Rain", "Keeps Falling", "simple@minds.com");
			
			// começæ a transação
			session.beginTransaction();
			
			// salva o objeto na sessão
			session.save(tempStudent);
			
			// salva (comita) a transação
			session.getTransaction().commit();
			
			// nova session
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("tempStudent.getId() =>" + tempStudent.getId());
			
			Student myStudent = session.get(Student.class, tempStudent.getId());
			session.getTransaction().commit();
		}
		finally {
			// fecha a transação
			factory.close();
		}
		
	}

}
