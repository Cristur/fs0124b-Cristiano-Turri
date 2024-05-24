package it.epicode.gestioneDispositivi.repositories;

import it.epicode.gestioneDispositivi.data.Worker;
import org.hibernate.jdbc.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface WorkerRepository extends JpaRepository<Worker, Long>, PagingAndSortingRepository<Worker, Long> {

    List<Worker> getWorkers();
    Optional<Worker> getWorker(Long id);
    Worker save(Worker worker);
    Worker uodate(Long workerId, Worker worker);
    Worker delete(Long workerId);
}
