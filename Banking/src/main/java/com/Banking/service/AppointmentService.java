package com.Banking.service;

import java.util.List;

import com.Banking.domain.Appointment;

public interface AppointmentService {
    
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
