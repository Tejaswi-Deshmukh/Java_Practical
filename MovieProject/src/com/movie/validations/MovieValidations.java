package com.movie.validations;

import java.awt.Window.Type;
import java.time.LocalDate;
import java.util.Map;

import com.movie.core.Movie;
import com.movie.core.Types;
import com.movie.exceptions.MovieExceptions;

public class MovieValidations {

	public static void validateMovieName(Map<Integer,Movie> mvmap,String mname)throws MovieExceptions{
		
			for(Movie m:mvmap.values()) {
				if(m.getMovieName().equals(mname)) {
					throw new MovieExceptions("Duplicate Movie Name!!");
				}
			}
		 
	}
	
	public static Types validateType(String movieType) throws MovieExceptions {
		Types movie;
		try {
		movie = Types.valueOf(movieType.toUpperCase());
		}
		catch(IllegalArgumentException e){
			throw new MovieExceptions("Invalid Input!!");
		}
		return movie;
		
	} 
	
	
	
	public static LocalDate validateDate(String dt) throws MovieExceptions{
		LocalDate date = LocalDate.parse(dt);
		if(date.isAfter(LocalDate.now())){
			throw new MovieExceptions("Movie is not released yet!!");
		}
		return date;
		
		
	}
}
