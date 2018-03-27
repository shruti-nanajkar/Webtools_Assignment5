/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.dao;

import static com.me.dao.DAO.getSession;
import com.me.pojo.Movie;
import javax.transaction.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Query;
import com.me.exception.MovieException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author nanaj
 */
public class AddMovieDao extends DAO {
    
    Session session;
    public boolean addMovie(Movie movie) throws MovieException{
//        session = super.sf.openSession();
//        Transaction tx = (Transaction) session.beginTransaction();
//        session.save(movie);
//        tx.commit();
//        session.close();
//        return true;
          try {
            begin();            
            getSession().save(movie);     
            commit();
            return true;
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create advert", e);
            throw new MovieException("Exception while creating advert: " + e.getMessage());
        }
    }
    
//    public List browseMovies(String columnName, String value) throws MovieException {
//        try {
//            begin();
//            Criteria cr = getSession().createCriteria(Movie.class);
//            cr.add(Restrictions.like(columnName, value, MatchMode.ANYWHERE));
//            List results = cr.list();
//            return results;
//        } catch (HibernateException e) {
//            rollback();
//            throw new MovieException("Could not Obtain the data: " + e.getMessage());
//
//        }
//    }
}
