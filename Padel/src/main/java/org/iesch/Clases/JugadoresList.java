package org.iesch.Clases;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "Jugadores")
public class JugadoresList {
    private List<Jugadores> listaJugadores;

    public JugadoresList() {
    }
    public JugadoresList(List<Jugadores> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
    @XmlElement(name = "jugador")
    public List<Jugadores> getListaJugadores() {
        return listaJugadores;
    }
    public void setListaJugadores(List<Jugadores> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
}
