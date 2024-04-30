package tareas;

public class Asiento {
  private int estado;
  private int fila;
  private int columna;
  private boolean checked;

  public Asiento(int f, int c) {
    this.estado = 0; // 0: Libre // 1: Ocupado // -1: Descartado
    this.fila = f;
    this.columna = c;
    this.checked = false;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public int getFila() {
    return fila;
  }

  public int getColumna() {
    return columna;
  }

  public boolean getChecked() {
    return checked;
  }

  public void setChecked() {
    this.checked = true;
  }
}
