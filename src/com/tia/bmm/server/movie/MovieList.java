package com.tia.bmm.server.movie;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList implements Serializable {
	List<Movie> Ml = new ArrayList<Movie>();
	static int id;
	
	static {
	    id = 1;
	}
	
	public void addMovie() {
	    Scanner sc = new Scanner(System.in);
	    String name;MovieType mt;MovieStatus ms;float r;int movt;
	    System.out.print("\nEnter name of movie: ");
	    name = sc.nextLine();
	    System.out.println("Select movie type: ");
	    System.out.println("1.Hindi\n2.English");
	    movt = Integer.parseInt(sc.nextLine());
	    switch(movt) {
	        case 1:
	            mt = MovieType.HINDI;
	            break;
	        case 2:
	            mt = MovieType.ENGLISH;
	            break;
	        default:
	            mt = MovieType.HINDI;
	    }
	
	    ms = MovieStatus.UPCOMING;
	
	    System.out.print("Enter rating(1-5 stars): ");
	    r = Float.parseFloat(sc.nextLine());
	    System.out.println("Adding movie!");
	    Movie m = new Movie(id,name,mt,ms,r);
	
	    Ml.add(m);
	
	    id++;
	}
	
	public void displayMovieList() {
        Movie m = new Movie();
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("\nMOVIE DATABASE:");
        for(int i=0; i<Ml.size();i++) {
            m = Ml.get(i);
            System.out.println("\nMovieId: "+ m.movieId);
            System.out.println("Movie Name: " + m.movieName);
            System.out.println("Movie Type: "+ m.movieType);
            System.out.println("Movie Status: " + m.movieStatus);
            System.out.println("\nRating: " + m.rating);
            System.out.println("----------------------------");
        }
        System.out.println("-------------------------------------------------\n");
    }
}
