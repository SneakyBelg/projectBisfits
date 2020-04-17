package edu.ap.projectteambisfits.defect;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DefectRepository extends MongoRepository<Defect, String> {

}