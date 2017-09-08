package com.fuel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Interfejs extends JpaRepository<Spalanie, Long> {
    Iterable<Spalanie> findByLitry(double litry);
//    Iterable<Spalanie> findaAll();
}
