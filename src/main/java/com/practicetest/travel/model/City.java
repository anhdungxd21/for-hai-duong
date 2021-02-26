package com.practicetest.travel.model;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "City")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "lỗi")
    private String nameCity;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Min(value = 500, message = "max 500")
    private Double  area;
    @Min(value = 100, message = "min 100")
    private Long populationData;
    private Double gdpCity;
    private String description;

    public City() {
    }

    public City(Long id, @NotEmpty(message = "lỗi") String nameCity, Country country, @Min(value = 500, message = "max 500") Double area, @Min(value = 100, message = "min 100") Long populationData, Double gdpCity, String description) {
        this.id = id;
        this.nameCity = nameCity;
        this.country = country;
        this.area = area;
        this.populationData = populationData;
        this.gdpCity = gdpCity;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Long getPopulationData() {
        return populationData;
    }

    public void setPopulationData(Long populationData) {
        this.populationData = populationData;
    }

    public Double getGdpCity() {
        return gdpCity;
    }

    public void setGdpCity(Double gdpCity) {
        this.gdpCity = gdpCity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
