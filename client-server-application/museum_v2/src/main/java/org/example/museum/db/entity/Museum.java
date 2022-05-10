package org.example.museum.db.entity;

import javax.persistence.*;

@Entity
@Table(name="museum")
public class Museum {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "object_id")
    private Long id;

    private int object_type;
    private String uuid;

    public int getObject_type() {
        return object_type;
    }

    public Long getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public Museum setObject_type(int object_type) {
        this.object_type = object_type;
        return this;
    }


}
