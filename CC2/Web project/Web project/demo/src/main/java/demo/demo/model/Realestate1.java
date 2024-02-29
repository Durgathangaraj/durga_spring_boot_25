package demo.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="real1")
public class Realestate1 {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 Long realid;
 String realname;
 String realarea;
 double realprice;
 public Long getRealid() {
     return realid;
    }
    public void setRealid(Long realid) {
        this.realid = realid;
    }
    public String getRealname() {
        return realname;
    }
    public void setRealname(String realname) {
        this.realname = realname;
    }
    
    public String getRealarea() {
        return realarea;
    }
    public void setRealarea(String realarea) {
        this.realarea = realarea;
    }
    public double getRealprice() {
       return realprice;
   }
   public void setRealprice(double realprice) {
       this.realprice = realprice;
   }
    
}
