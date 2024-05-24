package it.epicode.gestioneDispositivi.controller;


import it.epicode.gestioneDispositivi.data.Device;
import it.epicode.gestioneDispositivi.data.Worker;
import it.epicode.gestioneDispositivi.services.DeviceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/devices")
public class DeviceController {
    @Autowired
    DeviceServiceImpl deviceService;


    @GetMapping
    public List<Device> getAllDevices() {
        return deviceService.getDevices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Device> getDeviceById(@PathVariable Long id) {
        return ResponseEntity.ok(deviceService.getDevice(id)
                .orElseThrow(() -> new RuntimeException("Device not found")));
    }

    @PostMapping
    public ResponseEntity<Optional<Device>> createDevice(@RequestBody Device device) {
        Optional<Device> createdDevice = deviceService.save(device);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDevice);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Device> updateDevice(@PathVariable Long id, @RequestBody Device device) {
        Device updatedDevice = deviceService.update(id, device)
                .orElseThrow(() -> new RuntimeException("Device not found"));
        return ResponseEntity.ok(updatedDevice);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDevice(@PathVariable Long id) {
        deviceService.delete(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/{deviceId}/assign")
    public ResponseEntity<Device> assignDevice(@PathVariable Long deviceId, @RequestParam Long workerId) {
        Device assignedDevice = deviceService.assingDevice(deviceId, workerId);
        return ResponseEntity.ok(assignedDevice);
    }

    @PostMapping("/{deviceId}/unassign")
    public ResponseEntity<Device> unassignDevice(@PathVariable Long deviceId) {
        Device unassignedDevice = deviceService.unassignDevice(deviceId);
        return ResponseEntity.ok(unassignedDevice);
    }
}

