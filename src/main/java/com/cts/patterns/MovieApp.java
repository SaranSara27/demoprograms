package com.cts.patterns;

public class MovieApp {

	public static void main(String[] args) {
		Movie user_1 = new MovieBuilder(111,300)
						.feedback("Good")
						.ratings(3.5)
						.buildMovieObject();
		
		Movie user_2  =  new MovieBuilder(222, 350)
						 .feedback("OK")
						 .buildMovieObject();
		Movie user_3   = new MovieBuilder(333, 450)
						 .ratings(4.5)
						 .contact(876876234l)
						 .buildMovieObject();
		
		Movie[] movies = {user_1,user_2,user_3};
		for (Movie movie : movies) {
			System.out.println(movie);
		}
		

	}

}
