package tareas;

public class Asiento {
  // Atributos
  private int estado;
  private int fila;
  private int columna;
  private int checked;
  private EstadoReserva estadoReserva;

  private enum EstadoReserva {
    DISPONIBLE, PENDIENTE, CONFIRMADA, CANCELADA, VERIFICADA;
  }

  // Constructor
  public Asiento(int f, int c) {
    // 0: Libre
    // 1: Ocupado
    // -1: Descartado
    this.estado = 0;
    this.fila = f;
    this.columna = c;
    this.checked = 0;
    this.estadoReserva = EstadoReserva.DISPONIBLE;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public void reservar() {
    setEstado(1);
    if (estadoReserva == EstadoReserva.DISPONIBLE) {
      estadoReserva = EstadoReserva.PENDIENTE;
    }
  }

  public int getFila() {
    return fila;
  }

  public int getColumna() {
    return columna;
  }

  public void confirmarReserva() {
    if (estadoReserva == EstadoReserva.PENDIENTE) {
      estadoReserva = EstadoReserva.CONFIRMADA;
    }
  }

  public void cancelarReserva() {
    setEstado(-1);
    if (estadoReserva == EstadoReserva.PENDIENTE || estadoReserva == EstadoReserva.CONFIRMADA) {
      estadoReserva = EstadoReserva.CANCELADA;
    }
  }

  public void verificarReserva() {
    if (estadoReserva == EstadoReserva.CONFIRMADA) {
      estadoReserva = EstadoReserva.VERIFICADA;
    }
  }

  public int getEstadoReserva() {
    synchronized (this) {
      return estadoReserva.ordinal();
    }
  }

  public int getChecked() {
    return checked;
  }

  public void setChecked() {
    this.checked = 1;
  }
}
