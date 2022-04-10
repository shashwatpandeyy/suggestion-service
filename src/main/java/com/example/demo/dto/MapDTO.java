package com.example.demo.dto;

public class MapDTO {
    String AirlineCompany;
    long ItinID;
    double PricePerTicket;

    public MapDTO(String airlineCompany, long itinID, double pricePerTicket) {
        AirlineCompany = airlineCompany;
        ItinID = itinID;
        PricePerTicket = pricePerTicket;
    }

    public String getAirlineCompany() {
        return AirlineCompany;
    }

    public void setAirlineCompany(String airlineCompany) {
        AirlineCompany = airlineCompany;
    }

    public long getItinID() {
        return ItinID;
    }

    public void setItinID(long itinID) {
        ItinID = itinID;
    }

    public double getPricePerTicket() {
        return PricePerTicket;
    }

    public void setPricePerTicket(double pricePerTicket) {
        PricePerTicket = pricePerTicket;
    }
}
