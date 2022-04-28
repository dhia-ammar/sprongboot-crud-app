package tn.enicarthage.tp7grpenum2.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.enicarthage.tp7grpenum2.models.Timesheet;

public interface TimesheetRepo extends JpaRepository<Timesheet,Long> {
}
