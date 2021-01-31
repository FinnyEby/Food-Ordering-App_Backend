package com.upgrad.FoodOrderingApp.service.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "UUID")
    @NotNull
    @Size(max = 200)
    private String uuid;

    @Column(name = "FLAT_BUIL_NUMBER")
    @Size(max= 255)
    private String flat_buil_number;

    @Column(name = "LOCALITY")
    @Size(max= 255)
    private String locality;

    @Column(name = "CITY")
    @Size(max= 30)
    private String city;

    @Column(name = "PINCODE")
    @Size(max= 30)
    private String pincode;

    @ManyToOne
    @JoinColumn(name = "STATE_ID")
    private AddressEntity state_id;

    @Column(name = "ACTIVE")
    private String active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFlat_buil_number() {
        return flat_buil_number;
    }

    public void setFlat_buil_number(String flat_buil_number) {
        this.flat_buil_number = flat_buil_number;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public AddressEntity getState_id() {
        return state_id;
    }

    public void setState_id(AddressEntity state_id) {
        this.state_id = state_id;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
