package com.jdvpl.users.users.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    private String cellPhone;
    private String password;
    @Column(name = "document_number", unique = true, nullable = false)
    private String documentNumber;
    @Column(name = "enabled", nullable = false)
    private Boolean enabled = true;

}
