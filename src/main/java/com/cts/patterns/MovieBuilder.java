package com.cts.patterns;

public class MovieBuilder {

	public int movieId;
	public double moviePrice;
	public double ratings;
	public String feedback;
	public long contact;
	public MovieBuilder(int movieId, double moviePrice) {
		this.movieId = movieId;
		this.moviePrice = moviePrice;
	}
	
	public MovieBuilder ratings(double ratings) {
		this.ratings = ratings;
		return this;
	}
	public MovieBuilder feedback(String feedback) {
		this.feedback = feedback;
		return this;
	}
	public MovieBuilder contact(long contact) {
		this.contact = contact;
		return this;
	}
	public Movie buildMovieObject() {
		Movie movie = new Movie(this);
		return movie;
	}

}
