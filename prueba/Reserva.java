package com.guia2;

import java.time.LocalDate;
import java.util.UUID;

public class Reserva {
    private UUID id;
    private Pasajero pas;
    private Habitacion hab;
    private LocalDate llegada;
    private LocalDate partida;

    public Reserva(Pasajero pas, Habitacion hab, LocalDate llegada, LocalDate partida) {
        this.id = UUID.randomUUID();
        this.pas = pas;
        this.hab = hab;
        this.llegada = llegada;
        this.partida = partida;
    }
    
    public UUID getId(){
        return id;
    }
    public Pasajero getPas() {
        return pas;
    }
    public void setPas(Pasajero pas) {
        this.pas = pas;
    }
    public Habitacion getHab() {
        return hab;
    }
    public void setHab(Habitacion hab) {
        this.hab = hab;
    }
    public LocalDate getLlegada() {
        return llegada;
    }
    public void setLlegada(LocalDate llegada) {
        this.llegada = llegada;
    }
    public LocalDate getPartida() {
        return partida;
    }
    public void setPartida(LocalDate partida) {
        this.partida = partida;
    }
    
}
