package com.deepak.ums.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deepak.ums.config.MysqlDBconfig;
import com.deepak.ums.entity.Register;

@Repository
public class UserRepository {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveUser(Register register) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(register);
		transaction.commit();

	}

	public List<Register> getAllUser() {

		Session session = sessionFactory.openSession();
		String query = "from Register";
		Query query2 = session.createQuery(query);
		List<Register> resultList = query2.getResultList();

		return resultList;
	}

}
