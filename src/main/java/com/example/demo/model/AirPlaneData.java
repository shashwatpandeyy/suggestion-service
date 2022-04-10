package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Air plane raw data model.
 */
@Entity
@Table(name = "cleaned_2018_flights")
public class AirPlaneData {
    @Id
    @Column(name = "MyUnknownColumn")
    Long id;

    @Column(name = "ItinID")
    long ItinID;

    @Column(name = "MktID")
    long MktID;

    @Column(name = "MktCoupons")
    int MktCoupons;

    @Column(name = "Quarter")
    int Quarter;

    @Column(name = "Origin")
    String Origin;

    @Column(name = "OriginWac")
    int OriginWac;

    @Column(name = "Dest")
    String Dest;

    @Column(name = "DestWac")
    int DestWac;

    @Column(name = "Miles")
    double Miles;

    @Column(name = "ContiguousUSA")
    int ContiguousUSA;

    @Column(name = "NumTicketsOrdered")
    double NumTicketsOrdered;

    @Column(name = "AirlineCompany")
    String AirlineCompany;

    @Column(name = "PricePerTicket")
    double PricePerTicket;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getItinID() {
        return ItinID;
    }

    public void setItinID(long itinID) {
        ItinID = itinID;
    }

    public long getMktID() {
        return MktID;
    }

    public void setMktID(long mktID) {
        MktID = mktID;
    }

    public int getMktCoupons() {
        return MktCoupons;
    }

    public void setMktCoupons(int mktCoupons) {
        MktCoupons = mktCoupons;
    }

    public int getQuarter() {
        return Quarter;
    }

    public void setQuarter(int quarter) {
        Quarter = quarter;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public int getOriginWac() {
        return OriginWac;
    }

    public void setOriginWac(int originWac) {
        OriginWac = originWac;
    }

    public String getDest() {
        return Dest;
    }

    public void setDest(String dest) {
        Dest = dest;
    }

    public int getDestWac() {
        return DestWac;
    }

    public void setDestWac(int destWac) {
        DestWac = destWac;
    }

    public double getMiles() {
        return Miles;
    }

    public void setMiles(double miles) {
        Miles = miles;
    }

    public int getContiguousUSA() {
        return ContiguousUSA;
    }

    public void setContiguousUSA(int contiguousUSA) {
        ContiguousUSA = contiguousUSA;
    }

    public double getNumTicketsOrdered() {
        return NumTicketsOrdered;
    }

    public void setNumTicketsOrdered(double numTicketsOrdered) {
        NumTicketsOrdered = numTicketsOrdered;
    }

    public String getAirlineCompany() {
        return AirlineCompany;
    }

    public void setAirlineCompany(String airlineCompany) {
        AirlineCompany = airlineCompany;
    }

    public double getPricePerTicket() {
        return PricePerTicket;
    }

    public void setPricePerTicket(double pricePerTicket) {
        PricePerTicket = pricePerTicket;
    }
}
