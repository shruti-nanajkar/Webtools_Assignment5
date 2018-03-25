/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.controller;

import com.me.dao.BrowseMoviesDao;
import com.me.pojo.Movie;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author nanaj
 */
public class BrowseMoviesController extends SimpleFormController {
    
     public BrowseMoviesController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Movie.class);
        setCommandName("movie");
        setSuccessView("browsemoviesuccess");
        setFormView("browsemovieform");
    }
    /*
    @Override
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }
*/
    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
  
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        ModelAndView mav = null;
        Movie movie = (Movie) command;
        
        BrowseMoviesDao browseMoviesDao = (BrowseMoviesDao)this.getApplicationContext().getBean("browsemoviesdao");
       
        String columnName = request.getParameter("radioButton");
        String searchValue = request.getParameter("txtInput");
    
        List<Movie> movieList = (List<Movie>) browseMoviesDao.browseMovies(columnName, searchValue);
        System.out.println("No of Movies: " + movieList.size());
        mav =  new ModelAndView(getSuccessView(), "movieList", movieList);
        mav.addObject("searchValue", searchValue);
        return mav;
                
    }
}
