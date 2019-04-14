package com.jatauk.dao.entitty;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "city")
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(columnDefinition = "CHAR")
    private String name;
    
    @Column(name = "CountryCode", columnDefinition = "CHAR")
    private String countryCode;
    
    @Column(columnDefinition = "CHAR")
    private String district;
    
    private Integer population;
}
