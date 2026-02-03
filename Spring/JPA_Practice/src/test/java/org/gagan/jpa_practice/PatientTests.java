package org.gagan.jpa_practice;

import org.gagan.jpa_practice.entity.Patient;
import org.gagan.jpa_practice.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTests {
    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatientRepository() {
        Patient p = new Patient("ABC", LocalDate.now(),"abc@gmail.com","M");
        patientRepository.save(p);
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }
}