package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    private int eventId;
    private String name;
    private String description;
    private Long seatCount;
    private List<Seat> seatsList;
}
