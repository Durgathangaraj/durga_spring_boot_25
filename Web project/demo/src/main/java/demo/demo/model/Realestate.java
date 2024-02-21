package demo.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    String rent;
    String supplier;
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
    public String getRent() {
        return rent;
    }
    public void setRent(String rent) {
        this.rent = rent;
    }
    public String getSupplier() {
        return supplier;
    }
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    
    
}
