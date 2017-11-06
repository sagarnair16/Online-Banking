package com.Banking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Banking.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
