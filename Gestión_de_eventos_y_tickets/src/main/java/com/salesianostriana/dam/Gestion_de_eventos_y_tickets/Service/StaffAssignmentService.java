package com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Service;

import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Attendee;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.Event;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Model.StaffAssignment;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository.AttendeeRepository;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository.EventRepository;
import com.salesianostriana.dam.Gestion_de_eventos_y_tickets.Repository.StaffAssignmentRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StaffAssignmentService {

    private StaffAssignmentRepository staffAssignmentRepository;
    private EventRepository eventRepository;
    private AttendeeRepository attendeeRepository;

//    public StaffAssignment crearStaff(Long event_id, Long attendee_id, StaffAssignment staffAssignment){
//        Event event = eventRepository.findById(event_id).orElseThrow(
//                (() -> new EntityNotFoundException("Organizer not found")));
//        Attendee attendee = attendeeRepository.findById(attendee_id).orElseThrow(
//                (() -> new EntityNotFoundException("Organizer not found")));
//
//    }
}
