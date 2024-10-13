package org.example.model.seat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "bronze")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bronze {
    @Id
    private String seatNumber;

    private LocalDateTime bookingTime;
    private String userFirstName;
    private String userLastName;
    private Long amountPaid;
    private String paymentGateway;
    private boolean status;
}
