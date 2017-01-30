package com.bevDB;

/**
 * Created by pberman on 1/30/17.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Beverage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String year;

    public Beverage(String p_name) {
            super();
            this.name = p_name;
        }

    @Override
    public String toString() {
        return "Beverage[id = " + id + ",Beverage Name is = " + name + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String p_name) {
        this.name = p_name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String p_year) {
        this.year = p_year;
    }

    public Beverage() {}
}

