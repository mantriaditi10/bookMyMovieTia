package com.tia.bmm.server.theatre;

import java.util.ArrayList;
import java.util.List;

import com.tia.bmm.server.address.Address;

import com.tia.bmm.server.movie.Movie;

public class Theatre {
	int theatreId;
    String theatreName;
    Address address;
    List<Movie> movies = new ArrayList<Movie>();

    Theatre() {}

    Theatre(int tid,String n,Address add) {
        theatreId = tid;
        theatreName = n;
        address = add;
    }
}
