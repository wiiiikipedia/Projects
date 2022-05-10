package org.example.museum.db.entity;

import javax.persistence.*;

@Entity
@Table(name="workers")
public class Workers {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "worker_id")
    private Long id;

    private String first_name;
    private String last_name;
    private int position_id;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }
}