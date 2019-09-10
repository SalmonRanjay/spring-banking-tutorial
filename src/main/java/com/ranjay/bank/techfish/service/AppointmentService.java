package com.ranjay.bank.techfish.service;

import java.util.List;

import com.ranjay.bank.techfish.domain.Appointment;

public interface AppointmentService {
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
