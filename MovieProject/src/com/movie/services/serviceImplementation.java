package com.movie.services;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import static com.movie.validations.MovieValidations.*;
import com.movie.core.Movie;
import com.movie.core.Types;
import com.movie.exceptions.MovieExceptions;

public class serviceImplementation implements MovieService{

	Map<Integer,Movie> mvmap=new HashMap<>();
	@Override
	public void addMovie(int movieid,String movieName, double ratings, String type, String releaseDate, boolean inCinemas)
			throws MovieExceptions {
		//LocalDate date = LocalDate.parse(releaseDate);
		validateMovieName(mvmap,movieName);
		LocalDate date=validateDate(releaseDate);
		Types m=validateType(type);
		
		Movie obj=new Movie(movieid,movieName,ratings,m,date,inCinemas);
		mvmap.put(movieid, obj);
		System.out.println("Movie Added");
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeByRatings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDateById(int id, String dob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchByType(String movieType1) throws MovieExceptions {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DisplayByRating() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByDate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findMaxRating() {
		// TODO Auto-generated method stub
		
	}

}
