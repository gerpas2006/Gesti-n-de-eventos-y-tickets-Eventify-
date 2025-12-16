package com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model;

import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Enum.Type;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Ticket {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String qrCode;

    @Enumerated
    private Type type;

    private double price;
    private LocalDateTime purchasedAt;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attendee_id", nullable = false)
    private Attendee attendee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;
}
