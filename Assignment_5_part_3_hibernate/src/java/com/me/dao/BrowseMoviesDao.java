/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.dao;

import com.me.pojo.Movie;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author nanaj
 */
public class BrowseMoviesDao extends DAO {
    
    Session session;
    public List browseMovies(String columnName, String value){
        session = super.sf.openSession();
        Criteria cr = session.createCriteria(Movie.class);
        cr.add(Restrictions.like(columnName,value,MatchMode.ANYWHERE));
        List results = cr.list();
        return results;
        
    }
}
