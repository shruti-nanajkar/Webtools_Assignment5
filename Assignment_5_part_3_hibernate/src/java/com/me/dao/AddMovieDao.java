/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.dao;

import com.me.pojo.Movie;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nanaj
 */
public class AddMovieDao extends DAO{
    Session session;
    public boolean addMovie(Movie movie){
        session = super.sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(movie);
        tx.commit();
        session.close();
        return true;
    }
}
