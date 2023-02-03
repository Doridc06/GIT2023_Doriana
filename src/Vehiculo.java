
public class Vehiculo {

  private String marca;
  private String modelo;
  private String matricula;
  
  
  public Vehiculo(String marca, String modelo, String matricula) {
    super();
    this.marca = marca;
    this.modelo = modelo;
    this.matricula = matricula;
  }


  @Override
  public String toString() {
    return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
  }

  
}

