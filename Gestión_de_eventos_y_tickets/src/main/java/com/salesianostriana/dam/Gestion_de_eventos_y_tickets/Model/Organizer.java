package com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Organizer {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "organizer", cascade = CascadeType.ALL)
    private Set<Event> events = new HashSet<>();

}
