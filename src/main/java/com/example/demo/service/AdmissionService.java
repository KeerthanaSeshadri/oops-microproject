package com.example.demo.service;



import com.example.demo.model.Admission;
import com.example.demo.repository.AdmissionRepository;
import org.springframework.stereotype.Service;

@Service
public class AdmissionService {

    private final AdmissionRepository admissionRepository;

    public AdmissionService(AdmissionRepository admissionRepository) {
        this.admissionRepository = admissionRepository;
    }

    public Admission saveAdmission(Admission admission) {
        return admissionRepository.save(admission);
    }
}

