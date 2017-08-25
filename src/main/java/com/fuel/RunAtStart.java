package com.fuel;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class RunAtStart {
    private final Interfejs interfejs;

    public RunAtStart(Interfejs interfejs) {
        this.interfejs = interfejs;
    }

    @PostConstruct
    public void select(){
        Iterable<Tankowanie> cena = interfejs.findByRodzajPaliwa("LPG");
//        Iterable<Tankowanie> cena = interfejs.findaAll();
        Tankowanie rodzajPaliwa = cena.iterator().next();
        System.out.println("Kwota: " + rodzajPaliwa);
    }
}
