package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		// CREATE SESSION FACTORY
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// CREATE SESSION
		Session session = factory.getCurrentSession();
		
		try {
			
			// começæ a transação
			session.beginTransaction();
			
			// GET ALL
			List<Student> theStudents = session.createQuery("from Student").getResultList();

			for(Student tempStudent : theStudents) {
				System.out.println(tempStudent);
			}
			
			// GET BY NAME
			List<Student> theStudent = session.createQuery("from Student student where student.lastName='Rodrigues'").getResultList();
			
			for(Student tempStudent : theStudent) {
				System.out.println(tempStudent);
			}
			
			// GET BY NAME
			List<Student> theStudentz = session.createQuery("from Student student where student.lastName='Rodrigues' OR student.lastName='Darby'").getResultList();
			
			for(Student tempStudent : theStudentz) {
				System.out.println(tempStudent);
			}
			
			// salva (comita) a transação
			session.getTransaction().commit();
		}
		finally {
			// fecha a transação
			factory.close();
		}
		
	}

}
