package repositories;

import models.Enrollement;

import java.util.List;

public interface EnrollmentRepository {

    void save (Enrollement enrollement);
    Enrollement findById (Long id);
    Enrollement deleteById (Long id);
    List<Enrollement> findAll ();

}
