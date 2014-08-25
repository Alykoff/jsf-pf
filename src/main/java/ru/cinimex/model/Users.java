package ru.cinimex.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

/**
 *
 * @author galykov
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "findAll", query = "select u from Users u")
})
public class Users implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @NotNull
    private String firstName;
    private String secondName;
    private String fromCity;
    private String livingCity;
    private Integer powerValue;
    private Boolean isActive;

    public Users() {
    }

    public Users(Long id, String firstName, String secondName, String fromCity, String livingCity, Integer powerValue, Boolean isActive) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.fromCity = fromCity;
        this.livingCity = livingCity;
        this.powerValue = powerValue;
        this.isActive = isActive;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getLivingCity() {
        return livingCity;
    }

    public void setLivingCity(String livingCity) {
        this.livingCity = livingCity;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getPowerValue() {
        return powerValue;
    }

    public void setPowerValue(Integer powerValue) {
        this.powerValue = powerValue;
    }

    @Override
    public int hashCode() {
        int hash = id == null ? 12403 : id.intValue();
        return hash / 12392;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Users other = (Users) obj;
        if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName)) {
            return false;
        }
        if ((this.secondName == null) ? (other.secondName != null) : !this.secondName.equals(other.secondName)) {
            return false;
        }
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.fromCity == null) ? (other.fromCity != null) : !this.fromCity.equals(other.fromCity)) {
            return false;
        }
        if ((this.livingCity == null) ? (other.livingCity != null) : !this.livingCity.equals(other.livingCity)) {
            return false;
        }
        if (this.isActive != other.isActive && (this.isActive == null || !this.isActive.equals(other.isActive))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id 
                + ", firstName=" + firstName 
                + ", secondName=" + secondName 
                + ", fromCity=" + fromCity 
                + ", livingCity=" + livingCity 
                + ", powerValue=" + powerValue 
                + ", isActive=" + isActive + '}';
    }

}
