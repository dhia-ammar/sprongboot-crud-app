package tn.enicarthage.tp7grpenum2.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.enicarthage.tp7grpenum2.models.Departement;
import tn.enicarthage.tp7grpenum2.models.Entreprise;
import tn.enicarthage.tp7grpenum2.repos.DepartementRepo;
import tn.enicarthage.tp7grpenum2.repos.EntrepriseRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class EntrepriseService {
    private final EntrepriseRepo entrepriseRepo;
    private final DepartementRepo departementRepo;

    public Long ajouterEntreprise(Entreprise entreprise){
        return entrepriseRepo.save(entreprise).getId();
    }

    public void deleteEntrepriseById(Long entrepriseId){
        entrepriseRepo.delete(entrepriseRepo.getById(entrepriseId));
    }

    public Entreprise getEntrepriseById(Long entrepriseId){
        return entrepriseRepo.getById(entrepriseId);
    }

    public Long ajouterDepartement(Departement departement){
        return departementRepo.save(departement).getId();
    }

    public void affecterDepartementAEntreprise(Long departementId,Long entrepriseId){
        Entreprise entreprise=entrepriseRepo.getById(entrepriseId);
        Departement departement = departementRepo.getById(departementId);

        entreprise.addDepartment(departement);
        departement.setEntreprise(entreprise);

        entrepriseRepo.save(entreprise);
        departementRepo.save(departement);
    }

    public List<String> getAllDepratmentsNamesByEntreprise(Long entrepriseId){
        Entreprise entreprise = entrepriseRepo.getById(entrepriseId);
        List<String> departmentNames=entreprise.getDepartements().stream().map((departement -> {return departement.getName();}));

    }
}
