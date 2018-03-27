/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.dao;

import com.me.exception.MovieException;
import com.me.pojo.Movie;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author nanaj
 */
public class BrowseMoviesDao extends DAO {

    public List browseMovies(String columnName, String value) throws MovieException {
        try {
            begin();
            Criteria cr = getSession().createCriteria(Movie.class);
            cr.add(Restrictions.like(columnName, value, MatchMode.ANYWHERE));
            List results = cr.list();
            return results;
        } catch (HibernateException e) {
            rollback();
            throw new MovieException("Could not Obtain the data: " + e.getMessage());

        }
    }
}
