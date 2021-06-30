package application.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "address")
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "street_name")
  private String streetName;

  @Column(name = "number")
  private String number;

  @Column(name = "plz")
  private int plz;

  @Column(name = "location")
  private String location;

  @OneToMany(mappedBy = "address")
  private Collection<RealEstate> realEstates;

  public Address() {

  }

  public Address(int id, String streetName, String number, int plz, String location) {
    this.id = id;
    new Address(streetName, number, plz, location);
  }

  public Address(String streetName, String number, int plz, String location) {
    this.streetName = streetName;
    this.number = number;
    this.plz = plz;
    this.location = location;
  }

  @Override
  public String toString() {
    return streetName + " Nr. " + number + ", " + plz + " " + location;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public int getPlz() {
    return plz;
  }

  public void setPlz(int plz) {
    this.plz = plz;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Collection<RealEstate> getRealEstates() {
    return realEstates;
  }

  public void setRealEstates(Collection<RealEstate> realEstates) {
    this.realEstates = realEstates;
  }
}
