/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.dao;

import com.me.pojo.Movie;
import javax.transaction.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Query;
import com.me.exception.MovieException;

/**
 *
 * @author nanaj
 */
public class AddMovieDao extends DAO {
    
    Session session;
    public Movie addMovie(Movie movie) throws MovieException{
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
            return movie;
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create advert", e);
            throw new MovieException("Exception while creating advert: " + e.getMessage());
        }
    }
}
