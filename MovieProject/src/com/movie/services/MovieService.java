package com.movie.services;

import java.time.LocalDate;

import com.movie.core.Types;
import com.movie.exceptions.MovieExceptions;

public interface MovieService {

	void addMovie(int movieid,String movieName, double ratings, String type, String releaseDate, boolean inCinemas)
			throws MovieExceptions;

	void displayAll();

	void removeByRatings();

	void updateDateById(int id, String dob);

	void searchByType(String movieType1) throws MovieExceptions;

	void DisplayByRating();

	void sortByDate();

	void findMaxRating();
}
