package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		// CREATE SESSION FACTORY
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// CREATE SESSION
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 6;
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// salva o objeto na sessão
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("studentId" + studentId);
			myStudent.setFirstName("Satya");
			myStudent.setLastName("Nadella");
			myStudent.setEmail("satya@microsoft.com");
			
			// salva (comita) a transação
			session.getTransaction().commit();
		}
		finally {
			// fecha a transação
			factory.close();
		}
		
	}

}
