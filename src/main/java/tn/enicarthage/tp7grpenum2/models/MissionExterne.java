package tn.enicarthage.tp7grpenum2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity @Getter@Setter@NoArgsConstructor
public class MissionExterne extends Mission{
    String emailFacultatif;
    float tauxJournalierMoyen;

}
