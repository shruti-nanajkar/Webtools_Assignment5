/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.controller;

import com.me.dao.AddMovieDao;
import com.me.dao.BrowseMoviesDao;
import com.me.pojo.Movie;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author nanaj
 */
@Controller
@RequestMapping("/movie/*")
public class MovieController {

    @Autowired
    @Qualifier("addMovieDao")
    AddMovieDao addMovieDao;

    @Autowired
    @Qualifier("browseMoviesDao")
    BrowseMoviesDao browseMoviesDao;

    //Add Movies method
    @RequestMapping(value = "/movie/add", method = RequestMethod.POST)
    public ModelAndView addMovie(@ModelAttribute("movie") Movie movie, BindingResult result) throws Exception {
        ModelAndView mav = null;

        //Movie movie = new Movie();
//            movie.setMovieTitle(request.getParameter("movieTitle"));
//            movie.setLeadActor(request.getParameter("leadActor"));
//            movie.setLeadActress(request.getParameter("leadActress"));
//            movie.setGenre(request.getParameter("genre"));
//            movie.setYear(request.getParameter("year"));
        //addMovieDao.addMovie(movie);
        if (addMovieDao.addMovie(movie)) {

            mav = new ModelAndView("addmoviesuccess");
            System.out.println("sucessfully added movie to db");

        }
        return mav;
    }

    //Browse Movies method
    @RequestMapping(value = "/movie/browse", method = RequestMethod.POST)
    public ModelAndView browseMovies(HttpServletRequest request) throws Exception {

        ModelAndView mav = null;
        String columnName = request.getParameter("radioButton");
        String searchValue = request.getParameter("txtInput");

        List<Movie> movieList = (List<Movie>) browseMoviesDao.browseMovies(columnName, searchValue);
        System.out.println("No of Movies: " + movieList.size());
        mav = new ModelAndView("browsemoviessuccess", "movieList", movieList);
        mav.addObject("searchValue", searchValue);
        return mav;
    }

    @RequestMapping(value = "/movie/add", method = RequestMethod.GET)
    public ModelAndView displayAddMovieView(HttpServletRequest request) throws Exception {

        ModelAndView mv = new ModelAndView();
        mv.addObject("movie", new Movie());
        mv.setViewName("addmovieview");
        return mv;
    }
    
    @RequestMapping(value = "/movie/browse", method = RequestMethod.GET)
    public ModelAndView displayBrowseMoviesView(HttpServletRequest request) throws Exception {

        return new ModelAndView("browsemoviesform");
    }
}
