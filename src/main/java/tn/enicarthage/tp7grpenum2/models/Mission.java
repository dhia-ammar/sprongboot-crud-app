package tn.enicarthage.tp7grpenum2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity @Getter @Setter @NoArgsConstructor
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;
    @ManyToMany(mappedBy = "missions")
    List<Employe> employes;
    @OneToMany(mappedBy = "missions")
    List<Timesheet> timesheets;
}
