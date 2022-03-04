package com.tia.bmm.server.movie;

public class Seat {
	int seatNo;
    SeatType seatType;
    SeatStatus seatStatus;
    float seatCost;

    Seat() {}

    Seat(int sno,SeatType st,SeatStatus ss,float c) {
        seatNo = sno;
        seatStatus = ss;
        seatType = st;
        seatCost = c;
    }
}
