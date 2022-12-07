package com.audisoft.crud.infrastructure.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name ="productos")
public class ProductEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;
	
    @Column(name="nombre")
	private String name;
    
    @Column(name="descripcion")
	private String description;
    
    @Column(name="precio")
	private double price;

    @Column(name="existencia")
    private int existence;



}
