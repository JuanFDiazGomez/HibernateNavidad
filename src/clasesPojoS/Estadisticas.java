package clasesPojoS;
// Generated 04-ene-2017 16:12:12 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Estadisticas generated by hbm2java
 */
public class Estadisticas  implements java.io.Serializable {


     private EstadisticasId id;
     private Jugadores jugadores;
     private BigDecimal puntosPorPartido;
     private BigDecimal asistenciasPorPartido;
     private BigDecimal taponesPorPartido;
     private BigDecimal rebotesPorPartido;

    public Estadisticas() {
    }

	
    public Estadisticas(EstadisticasId id, Jugadores jugadores) {
        this.id = id;
        this.jugadores = jugadores;
    }
    public Estadisticas(EstadisticasId id, Jugadores jugadores, BigDecimal puntosPorPartido, BigDecimal asistenciasPorPartido, BigDecimal taponesPorPartido, BigDecimal rebotesPorPartido) {
       this.id = id;
       this.jugadores = jugadores;
       this.puntosPorPartido = puntosPorPartido;
       this.asistenciasPorPartido = asistenciasPorPartido;
       this.taponesPorPartido = taponesPorPartido;
       this.rebotesPorPartido = rebotesPorPartido;
    }
   
    public EstadisticasId getId() {
        return this.id;
    }
    
    public void setId(EstadisticasId id) {
        this.id = id;
    }
    public Jugadores getJugadores() {
        return this.jugadores;
    }
    
    public void setJugadores(Jugadores jugadores) {
        this.jugadores = jugadores;
    }
    public BigDecimal getPuntosPorPartido() {
        return this.puntosPorPartido;
    }
    
    public void setPuntosPorPartido(BigDecimal puntosPorPartido) {
        this.puntosPorPartido = puntosPorPartido;
    }
    public BigDecimal getAsistenciasPorPartido() {
        return this.asistenciasPorPartido;
    }
    
    public void setAsistenciasPorPartido(BigDecimal asistenciasPorPartido) {
        this.asistenciasPorPartido = asistenciasPorPartido;
    }
    public BigDecimal getTaponesPorPartido() {
        return this.taponesPorPartido;
    }
    
    public void setTaponesPorPartido(BigDecimal taponesPorPartido) {
        this.taponesPorPartido = taponesPorPartido;
    }
    public BigDecimal getRebotesPorPartido() {
        return this.rebotesPorPartido;
    }
    
    public void setRebotesPorPartido(BigDecimal rebotesPorPartido) {
        this.rebotesPorPartido = rebotesPorPartido;
    }

    @Override
    public String toString() {
        return id.getTemporada()+"\t"
                + puntosPorPartido+"\t"
                + asistenciasPorPartido+"\t"
                + taponesPorPartido+"\t"
                + rebotesPorPartido;
    }
    
    



}


