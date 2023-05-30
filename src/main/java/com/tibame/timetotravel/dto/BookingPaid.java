package com.tibame.timetotravel.dto;

import com.tibame.timetotravel.entity.Journey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingPaid {
    String comName;
    String comAddress;
    String comPhone;
    String roomName;
    String roomBed;
    Boolean roomBreakfast;
    String roomPeople;
    String roomDesc;
    Integer roomPrice;
    String userName;
    String userEmail;
    String userPhone;
    String checkIn;
    String checkOut;
    List<Journey> journey;
}
