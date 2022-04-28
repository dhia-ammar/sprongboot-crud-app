package tn.enicarthage.tp7grpenum2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity@Getter @Setter@NoArgsConstructor
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String raisonSocial;
    @OneToMany
    List<Departement> departements;


    public void addDepartment(Departement departement){
        departements.add(departement);
    }
}
