package org.example.museum.db.entity;

import javax.persistence.*;

@Entity
@Table(name="museum")
public class Museum {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "object_id")
    private Long id;

    private int object_type;
    private String object_name;
    private int place;
    private int creator_id;
    private String material;

    public int getObject_type() {
        return object_type;
    }

    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(int creator_id) {
        this.creator_id = creator_id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterials(String materials) {
        this.material = materials;
    }

}
