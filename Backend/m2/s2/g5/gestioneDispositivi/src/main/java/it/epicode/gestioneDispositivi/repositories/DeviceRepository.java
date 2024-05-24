package it.epicode.gestioneDispositivi.repositories;

import it.epicode.gestioneDispositivi.data.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DeviceRepository extends JpaRepository<Device, Long>, PagingAndSortingRepository<Device, Long> {
}
