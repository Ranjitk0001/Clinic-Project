package com.peakprosysproject.hospitalManagementSystemBackEnd.service;

import com.peakprosysproject.hospitalManagementSystemBackEnd.entity.Appointment;
import com.peakprosysproject.hospitalManagementSystemBackEnd.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//public class AppointmentService {
//
//}
@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Optional<Appointment> getAppointmentById(Long id) {
        return appointmentRepository.findById(id);
    }

    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Appointment updateAppointment(Long id, Appointment appointmentDetails) {
        Optional<Appointment> appointment = appointmentRepository.findById(id);
        if (appointment.isPresent()) {
            Appointment existingAppointment = appointment.get();
            existingAppointment.setTitle(appointmentDetails.getTitle());
            existingAppointment.setDateTime(appointmentDetails.getDateTime());
            existingAppointment.setDescription(appointmentDetails.getDescription());
            return appointmentRepository.save(existingAppointment);
        }
        return null;
    }

    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}

