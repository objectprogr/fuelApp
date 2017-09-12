package com.fuel;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Interfejs extends JpaRepository<Spalanie, Long> {
    Iterable<Spalanie> findByLitry(double litry);

    @Override
    List<Spalanie> findAll();
    //    Iterable<Spalanie> findaAll();
}
