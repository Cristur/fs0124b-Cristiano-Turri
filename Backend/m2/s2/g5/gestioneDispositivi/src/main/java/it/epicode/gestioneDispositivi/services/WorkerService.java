package it.epicode.gestioneDispositivi.services;

import it.epicode.gestioneDispositivi.data.Worker;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface WorkerService {
    List<Worker> getWorkers();
    Optional<Worker> getWorker(Long id);
    Optional<Worker> save(Worker worker);
    Optional<Worker> update(Long workerId, Worker worker);
    Worker delete(Long workerId);
}
