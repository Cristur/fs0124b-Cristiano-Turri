package it.epicode.gestioneDispositivi.repositories;

import it.epicode.gestioneDispositivi.data.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long>, PagingAndSortingRepository<Worker, Long> {


}
