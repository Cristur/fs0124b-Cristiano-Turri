package it.epicode.gestioneDispositivi.services;

import it.epicode.gestioneDispositivi.data.Device;
import it.epicode.gestioneDispositivi.data.Worker;

import java.util.List;
import java.util.Optional;

public interface DeviceService {
    List<Device> getDevices();
    Optional<Device> getDevice(Long id);
    Optional<Device> save(Device device);
    Optional<Device> update(Long deviceId, Device device);
    Device delete(Long deviceId);
    Device assingDevice(Long workerId, Long deviceId);
    Device unassignDevice(Long deviceId);
}
