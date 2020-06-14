package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		
		// CREATE SESSION FACTORY
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// CREATE SESSION
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 3;
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// salva o objeto na sessão
			Student myStudent = session.get(Student.class, studentId);
			
//			session.delete(myStudent);
			session.createQuery("DELETE FROM Student WHERE id=4").executeUpdate();
			System.out.println("studentId" + studentId);
			
			// salva (comita) a transação
			session.getTransaction().commit();
		}
		finally {
			// fecha a transação
			factory.close();
		}
		
	}

}
