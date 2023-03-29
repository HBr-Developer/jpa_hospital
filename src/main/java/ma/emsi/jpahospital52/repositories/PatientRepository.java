package ma.emsi.jpahospital52.repositories;

import ma.emsi.jpahospital52.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient, Long> {

    Patient findByNom(String name);



}
