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
        Iterable<Spalanie> cena = interfejs.findByLitry(40.31);
//        Iterable<Spalanie> cena = interfejs.findaAll();
        Spalanie rodzajPaliwa = cena.iterator().next();
        System.out.println("Kwota: " + rodzajPaliwa);
    }
}
