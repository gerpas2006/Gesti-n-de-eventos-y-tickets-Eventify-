package com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model;

import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Enum.Role;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class StaffAssignment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Enumerated
    private Role role;

    private LocalDateTime shiftStart;
    private LocalDateTime shiftEnd;
    private boolean paid;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attendee_id", nullable = false)
    private Attendee attendee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;



}
