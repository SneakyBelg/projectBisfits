package edu.ap.projectteambisfits.defect;

import java.util.List;

public interface DefectService {

    List<Defect> findAll();

    void deleteDefect(String id);

    void saveDefect(Defect defect);
}