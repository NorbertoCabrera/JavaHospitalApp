public  interface IMedicalProfessional {
    void diagnosePatient(Patient patient) throws PatientSymptomsException;
    void prescribeMedication(Patient patient, Medication medication);
}