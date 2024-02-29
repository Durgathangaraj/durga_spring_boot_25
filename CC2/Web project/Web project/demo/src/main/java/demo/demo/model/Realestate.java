package demo.demo.model;

import jakarta.persistence.CascadeType;

// import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Realestate")
public class Realestate {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    int    estateId;
    String estatename;
    String description;
    String area;
    double rent;
    @OneToOne(cascade=CascadeType.ALL)
    Realestate1 realestate1;
    public int getEstateId() {
        return estateId;
    }
    public void setEstateId(int estateId) {
        this.estateId = estateId;
    }
    public String getEstatename() {
        return estatename;
    }
    public void setEstatename(String estatename) {
        this.estatename = estatename;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public double getRent() {
        return rent;
    }
    public void setRent(double rent) {
        this.rent = rent;
    }
    public Realestate1 getRealestate1() {
        return realestate1;
    }
    public void setRealestate1(Realestate1 realestate1) {
        this.realestate1 = realestate1;
    }
    
   
    
    
}
