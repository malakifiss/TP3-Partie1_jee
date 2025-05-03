package ma.enset.tp3_jee_hopital;

import ma.enset.tp3_jee_hopital.entities.Patient;
import ma.enset.tp3_jee_hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tp3JeeHopitalApplication implements CommandLineRunner {
   @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {

        SpringApplication.run(Tp3JeeHopitalApplication.class, args);
    }
@Override
    public void run(String... args) throws Exception {
      patientRepository.save(new Patient(null,"malak",new Date(),false , 22));
    patientRepository.save(new Patient(null,"imane",new Date(),false , 2));
    patientRepository.save(new Patient(null,"mina",new Date(),true, 52));


      /* Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("malak");
        patient.getDatedenaissance();
        patient.setMalade(false);
        patient.setScore(23);

        Patient patient2= new Patient (null,"imalne",new Date(),false,123);

        Patient patient3=Patient.builder()
                .nom("lina")
                .dateNaissance(new Date())
                .score(111)
                .malade(true)
                .build();  */

}
}
