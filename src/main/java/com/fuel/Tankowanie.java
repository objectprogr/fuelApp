package com.fuel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tankowanie {

    @Id
    @GeneratedValue
    private String dataTankowania;
    private double litry;
    private String rodzajPaliwa;
    private Double cena;
    private double kwotaTankowania;
    private double stanLicznika;
    private double przejechaneKm;
    private double spalanie;
    private double koszt100km;

    @Override
    public String toString() {
        return "Tankowanie{" +
                "dataTankowania='" + dataTankowania + '\'' +
                ", litry=" + litry +
                ", rodzajPaliwa='" + rodzajPaliwa + '\'' +
                ", cena=" + cena +
                ", kwotaTankowania=" + kwotaTankowania +
                ", stanLicznika=" + stanLicznika +
                ", przejechaneKm=" + przejechaneKm +
                ", spalanie=" + spalanie +
                ", koszt100km=" + koszt100km +
                '}';
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public String getDataTankowania() {
        return dataTankowania;
    }

    public void setDataTankowania(String dataTankowania) {
        this.dataTankowania = dataTankowania;
    }

    public double getLitry() {
        return litry;
    }

    public void setLitry(double litry) {
        this.litry = litry;
    }

    public String getRodzajPaliwa() {
        return rodzajPaliwa;
    }

    public void setRodzajPaliwa(String rodzajPaliwa) {
        this.rodzajPaliwa = rodzajPaliwa;
    }


    public double getKwotaTankowania() {
        return kwotaTankowania;
    }

    public void setKwotaTankowania(double kwotaTankowania) {
        this.kwotaTankowania = kwotaTankowania;
    }

    public double getStanLicznika() {
        return stanLicznika;
    }

    public void setStanLicznika(double stanLicznika) {
        this.stanLicznika = stanLicznika;
    }

    public double getPrzejechaneKm() {
        return przejechaneKm;
    }

    public void setPrzejechaneKm(double przejechaneKm) {
        this.przejechaneKm = przejechaneKm;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }

    public double getKoszt100km() {
        return koszt100km;
    }

    public void setKoszt100km(double koszt100km) {
        this.koszt100km = koszt100km;
    }
}
