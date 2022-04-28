package tn.enicarthage.tp7grpenum2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity@Getter @Setter @NoArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long reference;
    Date dateDebut;
    String typeContrat;
    float salaire;
    @OneToOne
    Employe employe;
}
