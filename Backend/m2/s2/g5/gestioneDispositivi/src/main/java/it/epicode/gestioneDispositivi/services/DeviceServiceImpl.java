package it.epicode.gestioneDispositivi.services;

import it.epicode.gestioneDispositivi.data.Device;
import it.epicode.gestioneDispositivi.data.DeviceStatus;
import it.epicode.gestioneDispositivi.repositories.DeviceRepository;
import it.epicode.gestioneDispositivi.repositories.WorkerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Slf4j
public class DeviceServiceImpl implements DeviceService{
    @Autowired
    DeviceRepository devices;
    @Autowired
    WorkerRepository workers;

    @Override
    public List<Device> getDevices() {
        return devices.findAll();
    }

    @Override
    public Optional<Device> getDevice(Long id) {
        return devices.findById(id);
    }

    @Override
    public Optional<Device> save(Device device) {
        try{
            return Optional.of(devices.save(device));
        }
        catch (Exception e){
            log.error(String.format("Exception saving worker %s", device), e);
            return Optional.empty();
        }
    }

    @Override
    public Optional<Device> update(Long deviceId, Device device) {
        try{
            var d = devices.findById().orElseThrow();
            d.builder()
                    .withStatus(device.getStatus())
                    .withType(device.getType())
                    .withWorker(device.getWorker())
                    .build();
            return Optional.of(devices.save(d));
        }
        catch (NoSuchElementException e){
            log.error(String.format("Worker with id = %s not found", deviceId), e);
        }
        return Optional.empty();
    }

    @Override
    public Device delete(Long deviceId) {
        try {
            var d = devices.findById(deviceId).orElseThrow();
            devices.delete(d);
            return d;
        }
        catch (NoSuchElementException e){
            log.error(String.format("Worker with id %s not found", deviceId), e);
            throw new RuntimeException("Cannot find worker");
        }
    }

    @Override
    public Device assingDevice(Long workerId, Long deviceId) {
        var d = devices.findById(deviceId)
                .orElseThrow(() -> new RuntimeException("Device not found"));

        if (d.getStatus() != DeviceStatus.AVAILABLE) {
            throw new RuntimeException("Device is not available for assignment");
        }

        var w = workers.findById(workerId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        d.setWorker(w);
        d.setStatus(DeviceStatus.ASSIGNED);

        return devices.save(d);
    }

    @Override
    public Device unassignDevice(Long workerId, Long deviceId) {
        var d = devices.findById(deviceId)
                .orElseThrow(() -> new RuntimeException("Device not found"));
        d.setWorker(null);
        d.setStatus(DeviceStatus.AVAILABLE);

        return devices.save(d);
    }
}
}
}
