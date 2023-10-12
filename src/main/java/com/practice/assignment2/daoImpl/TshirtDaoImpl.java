package com.practice.assignment2.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.practice.assignment2.dao.TshirtDao;
import com.practice.assignment2.entity.Tshirt;
public class TshirtDaoImpl implements TshirtDao {
    @SuppressWarnings("deprecation")
    Configuration con = new Configuration().configure().addAnnotatedClass(Tshirt.class);
	ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	SessionFactory sf = con.buildSessionFactory(reg);
	Session session = sf.openSession();
	public void insertData(ArrayList<Tshirt> tshirts) {
		Transaction tx = session.beginTransaction();
        for (Tshirt ts : tshirts) {
            Tshirt existingTshirt = session.get(Tshirt.class, ts.getId());
            if (existingTshirt == null) {
                session.save(ts);
            }   
        }
        tx.commit();      		
    }  
  //create a method to get matching data from database using user input data

	public List<Tshirt> fetchFromDb(Tshirt userData) {
		// TODO Auto-generated method stub
		List<Tshirt> data = new ArrayList<Tshirt>();
//		Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory factory = cfg.buildSessionFactory();
//        Session session = factory.openSession();
//        session.beginTransaction();
        if(userData.getOut_pref().equalsIgnoreCase("price")){
        	Query<Tshirt> q = session.createQuery("from Tshirt where availability=:avail and "
        			+ "color=:color and size=:size and "
        			+ "gender_rec=:gender order by price asc");
        	q.setParameter("color", userData.getColor());
        	q.setParameter("size", userData.getSize());
        	q.setParameter("gender", userData.getGender_rec());
        	q.setParameter("avail", "Y");
        	data = q.list();
        }
        else if(userData.getOut_pref().equalsIgnoreCase("rating")){
        	Query<Tshirt> q = session.createQuery("from Tshirt where availability=:avail and "
        			+ "color=:color and size=:size and "
        			+ "gender_rec=:gender order by rating desc");
        	q.setParameter("color", userData.getColor());
        	q.setParameter("size", userData.getSize());
        	q.setParameter("gender", userData.getGender_rec());
        	q.setParameter("avail", "Y");
        	data = q.list();
        }
        else {
        
			Query<Tshirt> q = session.createQuery("from Tshirt where availability=:avail and "
        			+ "color=:color and size=:size and "
        			+ "gender_rec=:gender order by price,rating");
        	q.setParameter("color", userData.getColor());
        	q.setParameter("size", userData.getSize());
        	q.setParameter("gender", userData.getGender_rec());
        	q.setParameter("avail", "Y");
        	data = q.list();
        }
		return data;
	}	
}




