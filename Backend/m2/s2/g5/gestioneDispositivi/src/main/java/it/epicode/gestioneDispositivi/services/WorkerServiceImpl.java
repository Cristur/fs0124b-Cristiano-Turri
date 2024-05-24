package it.epicode.gestioneDispositivi.services;

import it.epicode.gestioneDispositivi.data.Worker;
import it.epicode.gestioneDispositivi.repositories.WorkerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Slf4j
public class WorkerServiceImpl implements WorkerService{

    @Autowired
    WorkerRepository workers;


    @Override
    public List<Worker> getWorkers() {
        return workers.findAll();
    }

    @Override
    public Optional<Worker> getWorker(Long id) {
        try{
            return workers.findById(id);
        }
        catch (Exception e){
            log.error(String.format("No user with such id found %s", id));
            return Optional.empty();
        }
    }

    @Override
    public Optional<Worker> save(Worker worker) {
        try{
            return Optional.of(workers.save(worker));
        }
        catch (Exception e){
            log.error(String.format("Exception saving worker %s", worker), e);
            return Optional.empty();
        }
    }

    @Override
    public Optional<Worker> update(Long workerId, Worker worker) {
        try{
            var w = workers.findById().orElseThrow();
            w.builder()
                    .withEmail(worker.getEmail())
                    .withDevices(worker.getDevices())
                    .withLastname(worker.getLastname())
                    .withName(worker.getName())
                    .withUsername(worker.getUsername())
                    .build();
            return Optional.of(workers.save(w));
        }
        catch (NoSuchElementException e){
            log.error(String.format("Worker with id = %s not found", workerId), e);
        }
        return Optional.empty();
    }

    @Override
    public Worker delete(Long workerId) {
        try {
            var w = workers.findById(workerId).orElseThrow();
            workers.delete(w);
            return w;
        }
        catch (NoSuchElementException e){
            log.error(String.format("Worker with id %s not found", workerId), e);
            throw new RuntimeException("Cannot find worker");
        }
    }

}
