package edu.ap.projectteambisfits.defect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.ap.projectteambisfits.defect.DefectService;;

@Service
public class DefectServiceImpl implements DefectService {

    @Autowired
    private DefectRepository defectRepository;

    @Override
    public List<Defect> findAll() {
        return defectRepository.findAll();
    }

    @Override
    public void deleteDefect(String id) {
        defectRepository.deleteById(id);
    }

    @Override
    public void saveDefect(Defect defect) {
        defectRepository.save(defect);
    }

}