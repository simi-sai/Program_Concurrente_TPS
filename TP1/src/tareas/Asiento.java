package tareas;

public class Asiento {
  // Atributos
  private int estado;
  private int fila;
  private int columna;

  // Constructor
  public Asiento(int f, int c) {
    // 0: Libre
    // 1: Ocupado
    // -1: Descartado
    this.estado = 0;
    this.fila = f;
    this.columna = c;
  }

  public synchronized int getEstado() {
    return estado;
  }

  public synchronized void setEstado(int estado) {
    this.estado = estado;
  }

  public synchronized void reservar() {
    setEstado(1);
  }

  public int getFila() {
    return fila;
  }

  public int getColumna() {
    return columna;
  }
}