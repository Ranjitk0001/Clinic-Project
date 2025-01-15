package com.peakprosysproject.hospitalManagementSystemBackEnd.repository;

//public interface AppointmentRepository {
//}

import com.peakprosysproject.hospitalManagementSystemBackEnd.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}