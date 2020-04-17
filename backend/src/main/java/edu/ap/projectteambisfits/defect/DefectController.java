package edu.ap.projectteambisfits.defect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DefectController {

    @Autowired
    private DefectService defectService;

    @GetMapping(path = "/test")
    public List<Defect> getAllDefects() {
        return defectService.findAll();
    }

    @PostMapping(path = "/newdefect")
    public ResponseEntity<?> newDefect(@RequestBody Defect defect) {
        defectService.saveDefect(defect);
        return new ResponseEntity<>("Defect added succesfully", HttpStatus.OK);
    }

}