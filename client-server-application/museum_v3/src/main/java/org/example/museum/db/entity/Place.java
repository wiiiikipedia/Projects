package org.example.museum.db.entity;

import javax.persistence.*;

@Entity
@Table(name="place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private Long id;

    private String place_name;
    private int headworker_id;
    private int floor;

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public int getHeadworker_id() {
        return headworker_id;
    }

    public void setHeadworker_id(int headworker_id) {
        this.headworker_id = headworker_id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

}
