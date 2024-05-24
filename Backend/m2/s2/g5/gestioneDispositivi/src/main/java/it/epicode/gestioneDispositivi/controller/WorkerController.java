package it.epicode.gestioneDispositivi.controller;

import it.epicode.gestioneDispositivi.data.Worker;
import it.epicode.gestioneDispositivi.services.WorkerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/workers")
public class WorkerController {
    @Autowired
    WorkerServiceImpl workerService;

    @GetMapping
    public List<Worker> getAllWorkers() {
        return workerService.getWorkers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> getWorkerById(@PathVariable Long id) {
        return ResponseEntity.ok(workerService.getWorker(id)
                .orElseThrow(() -> new RuntimeException("Worker not found")));
    }

    @PostMapping
    public ResponseEntity<Optional<Worker>> createWorker(@RequestBody Worker worker) {
        Optional<Worker> createdWorker = workerService.save(worker);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdWorker);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Worker> updateWorker(@PathVariable Long id, @RequestBody Worker worker) {
        Worker updatedWorker = workerService.update(id, worker)
                .orElseThrow(() -> new RuntimeException("Worker not found"));
        return ResponseEntity.ok(updatedWorker);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorker(@PathVariable Long id) {
        workerService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
