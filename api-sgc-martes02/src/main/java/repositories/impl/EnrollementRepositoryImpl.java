package repositories.impl;

import models.Enrollement;
import repositories.EnrollmentRepository;

import java.util.List;

public class EnrollementRepositoryImpl implements EnrollmentRepository {

    private final List <Enrollement> enrollements;

    public EnrollementRepositoryImpl(List<Enrollement> enrollements) {
        this.enrollements = enrollements;
    }

    @Override
    public void save(Enrollement enrollement) {
        enrollements.add(enrollement);
    }

    @Override
    public Enrollement findById(Long id) {
        for (Enrollement enrollement: enrollements){
            if(enrollement.getId().equals(id)){
                return enrollement;
            }
        }

        return null;
    }

    @Override
    public Enrollement deleteById(Long id) {

        Enrollement enrollement = findById(id);
        if (enrollement != null){

            enrollements.remove(enrollement);
        }
        return null;
    }

    @Override
    public List<Enrollement> findAll() {
        return enrollements;
    }
}
