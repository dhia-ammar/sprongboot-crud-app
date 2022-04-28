package tn.enicarthage.tp7grpenum2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity @Getter @Setter@NoArgsConstructor
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String prenom;
    String nom;
    String email;
    boolean isActif;
    Role role;
    @ManyToMany
    List<Departement> departements;
    @OneToOne
    @JoinColumn
    Contrat contrat;
    @ManyToMany
    List<Mission> missions;
    @OneToMany(mappedBy = "employes")
    List<Timesheet> timesheets;
}