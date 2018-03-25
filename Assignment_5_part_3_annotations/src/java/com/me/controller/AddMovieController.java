/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.controller;

import com.me.dao.AddMovieDao;
import com.me.pojo.Movie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author nanaj
 */
public class AddMovieController extends SimpleFormController {
    
   public AddMovieController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Movie.class);
        setCommandName("movie");
        setSuccessView("addmoviesuccess");
        setFormView("addmovieview");
    }
    
   /* @Override
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }*/

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
       
        //Do something...
        ModelAndView mav = null;
        Movie movie = (Movie) command;
        AddMovieDao addMovieDao = (AddMovieDao) this.getApplicationContext().getBean("addmoviedao");
        
        if(request.getRequestURI().endsWith("add.htm")){
            
            //Movie movie = new Movie();
            movie.setMovieTitle(request.getParameter("movieTitle"));
            movie.setLeadActor(request.getParameter("leadActor"));
            movie.setLeadActress(request.getParameter("leadActress"));
            movie.setGenre(request.getParameter("genre"));
            movie.setYear(request.getParameter("year"));
            
            //addMovieDao.addMovie(movie);
            
            if(addMovieDao.addMovie(movie)){
                
                mav = new ModelAndView(getSuccessView());
                System.out.println("sucessfully added movie to db");
            
        }
     
    }
        return mav;
}
}
