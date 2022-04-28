package tn.enicarthage.tp7grpenum2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity @Getter@Setter @NoArgsConstructor
public class Timesheet {
    @Id
    @GeneratedValue
    Long id;
    Date dateDebut;
    Date dateFin;
    boolean isValide;
    @ManyToOne
    Mission mission;
    @ManyToOne
    Employe employe;


}
