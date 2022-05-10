package org.example.museum.db.entity;

import javax.persistence.*;

@Entity
@Table(name="object_type")
public class ObjectType {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "object_type_id")
    private Long id;

    private String object_type_name;

    public String getObject_type_name() {
        return object_type_name;
    }

    public void setObject_type_name(String object_type_name) {
        this.object_type_name = object_type_name;
    }
}
