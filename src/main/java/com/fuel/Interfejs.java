package com.fuel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Interfejs extends JpaRepository<Tankowanie, Long> {
    Iterable<Tankowanie> findByRodzajPaliwa(String rodzaj_paliwa);
//    Iterable<Tankowanie> findaAll();
}
