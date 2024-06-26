package tn.esprit.ecommerceespritpi.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class AdresseLivraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdresse;
    private String rue;
    private String ville;
    private Integer codePostal;
}

