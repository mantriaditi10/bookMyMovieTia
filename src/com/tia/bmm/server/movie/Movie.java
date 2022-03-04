package com.tia.bmm.server.movie;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	int movieId;
    List<Integer> theaterId = new ArrayList<Integer>(); 
    String movieName;
    MovieType movieType;
    MovieStatus movieStatus;
    float rating;
    List<Seat>showAtFour = new ArrayList<Seat>(50);

    Movie() {}

    Movie(int mid,String n,MovieType mt,MovieStatus ms,float r) {
        movieId = mid;
        movieName = n;
        movieType = mt;
        movieStatus = ms;
        rating = r;

        for(int i=1;i<=25;i++) {
            Seat s = new Seat(i,SeatType.SILVER,SeatStatus.SEAT_NOT_BOOKED,210);
            showAtFour.add(s);
        }
        for(int i=26;i<=40;i++) {
            Seat s = new Seat(i,SeatType.GOLD,SeatStatus.SEAT_NOT_BOOKED,270);
            showAtFour.add(s);
        }
        for(int i=40;i<=50;i++) {
            Seat s = new Seat(i,SeatType.PLATINUM,SeatStatus.SEAT_NOT_BOOKED,320);
            showAtFour.add(s);
        }
    }

    void displayMovie() {
        System.out.println("\nMovieId: "+ movieId);
        System.out.println("Movie Name: " + movieName);
        System.out.println();
    }
}
