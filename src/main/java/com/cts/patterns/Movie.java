package com.cts.patterns;

public class Movie {
	private int movieId;
	private double  moviePrice;
	private double ratings;
	private String feedback;
	private long contact;

	public Movie(MovieBuilder builder) {
		super();
		this.movieId = builder.movieId;
		this.moviePrice = builder.moviePrice;
		this.ratings = builder.ratings;
		this.feedback = builder.feedback;
		this.contact = builder.contact;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", moviePrice=" + moviePrice + ", ratings=" + ratings + ", feedback="
				+ feedback + ", contact=" + contact + "]";
	}
	public Movie() {
		super();
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public double getMoviePrice() {
		return moviePrice;
	}
	public void setMoviePrice(double moviePrice) {
		this.moviePrice = moviePrice;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	

}
