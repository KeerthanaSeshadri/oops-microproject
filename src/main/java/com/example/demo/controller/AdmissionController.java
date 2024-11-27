package com.example.demo.controller;



import com.example.demo.model.Admission;
import com.example.demo.service.AdmissionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admissions")
@CrossOrigin(origins = "*") // Allow requests from any origin (for frontend integration)
public class AdmissionController {

    private final AdmissionService admissionService;

    public AdmissionController(AdmissionService admissionService) {
        this.admissionService = admissionService;
    }

    @PostMapping
    public ResponseEntity<Admission> submitAdmission(@RequestBody Admission admission) {
        Admission savedAdmission = admissionService.saveAdmission(admission);
        return ResponseEntity.ok(savedAdmission);
    }
}

