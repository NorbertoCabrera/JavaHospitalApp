package Interfaces;

import Classes.Medication;
import Classes.Patient;
import Exceptions.PatientSymptomsException;

public  interface IMedicalProfessional {
    void diagnosePatient(Patient patient) throws PatientSymptomsException;
    void prescribeMedication(Patient patient, Medication medication);
}