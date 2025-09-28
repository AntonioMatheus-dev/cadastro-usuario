package com.MatheusDev.cadastro_usuario.infrastructure.entitys;
import jakarta.persistence.*;
import lombok.*;
import  lombok.Getter;

import java.security.cert.CertPathBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    @Column(name = "email", unique = true)
    private  String  email;

    @Column(name = "nome")
    private  String nome;

}
