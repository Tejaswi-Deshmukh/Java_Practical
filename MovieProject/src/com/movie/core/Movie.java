package com.movie.core;

import java.time.LocalDate;

public class Movie {
private int Id;
private String movieName;
private double ratings;
private Types type;
private LocalDate releaseDate;
private boolean inCinemas;



public Movie(int id,String movieName,double ratings, Types type, LocalDate releaseDate, boolean inCinemas) {
	super();
	this.Id = Id;
	this.movieName = movieName;
	this.ratings = ratings;
	this.type = type;
	this.releaseDate = releaseDate;
	this.inCinemas = inCinemas;
}



public String getMovieName() {
	return movieName;
}



public void setMovieName(String movieName) {
	this.movieName = movieName;
}



public int getId() {
	return Id;
}



public void setId(int id) {
	Id = id;
}



public double getRatings() {
	return ratings;
}



public void setRatings(double ratings) {
	this.ratings = ratings;
}



public Types getType() {
	return type;
}



public void setType(Types type) {
	this.type = type;
}



public LocalDate getReleaseDate() {
	return releaseDate;
}



public void setReleaseDate(LocalDate releaseDate) {
	this.releaseDate = releaseDate;
}



public boolean isInCinemas() {
	return inCinemas;
}



public void setInCinemas(boolean inCinemas) {
	this.inCinemas = inCinemas;
}



@Override
public String toString() {
	return "Movie [Id=" + Id + ", movieName=" + movieName + ", ratings=" + ratings + ", type=" + type + ", releaseDate="
			+ releaseDate + ", inCinemas=" + inCinemas + "]";
}




}
