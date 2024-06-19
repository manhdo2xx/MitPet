package com.mitpet.mitpetservice.Model;

import com.mitpet.mitpetservice.Model.Enums.TimeBooking;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date date;

    private boolean trangthai;

    @Enumerated(EnumType.STRING)
    private TimeBooking time;

}

