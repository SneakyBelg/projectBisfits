package edu.ap.projectteambisfits.defect;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "defects")
public class Defect {
    private String name;
    @Id
    private String id;

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public Defect(String name, String id) {
        this.id = "DF" + UUID.randomUUID();
        this.name = name;
    }

}