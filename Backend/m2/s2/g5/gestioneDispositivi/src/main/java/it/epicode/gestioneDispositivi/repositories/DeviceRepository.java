package it.epicode.gestioneDispositivi.repositories;

import it.epicode.gestioneDispositivi.data.Device;
import it.epicode.gestioneDispositivi.data.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface DeviceRepository extends JpaRepository<Device, Long>, PagingAndSortingRepository<Device, Long> {
    List<Device> getDevices();
    Optional<Device> getDevice(Long id);
    Device save(Device device);
    Device uodate(Long devideId, Device device);
    Device delete(Long devideId);
}
