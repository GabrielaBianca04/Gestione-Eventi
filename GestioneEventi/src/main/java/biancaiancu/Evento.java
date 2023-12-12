package biancaiancu;

import java.time.LocalDate;

public class Evento {
    private int id;
   private String titolo;
   private LocalDate dataEvento;
   private String descrizione;
  private  tipoEvento tipo;
    private int numeroMassimoPartecipanti;

    public int getId() {
        return id;
    }
    public String getTitolo() {
        return titolo;
    }
    public LocalDate getDataEvento() {
        return dataEvento;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public tipoEvento getTipo() {
        return tipo;
    }
    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setTipo(tipoEvento tipo) {
        this.tipo = tipo;
    }
    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public Evento(int id,String titolo,LocalDate dataEvento) {
    }
}
