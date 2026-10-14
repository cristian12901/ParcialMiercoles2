/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alex
 */
public class Profesor extends Persona {
    private String cedula;
    private String area;
    private int horasDictadas;
    private double salarioHora;

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento, String cedula, String area, int horasDictadas, double salarioHora) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.horasDictadas = horasDictadas;
        this.salarioHora = salarioHora;
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
    public int getHorasDictadas() { return horasDictadas; }
    public void setHorasDictadas(int horasDictadas) { this.horasDictadas = horasDictadas; }
    public double getSalarioHora() { return salarioHora; }
    public void setSalarioHora(double salarioHora) { this.salarioHora = salarioHora; }

    public double getSalarioBase() {
        return horasDictadas * salarioHora;
    }

    public double getPrestaciones() {
        double salarioDevengado = getSalarioBase() * 1.30;
        return salarioDevengado * 0.19;
    }

    public double getSalarioTotal() {
        return (getSalarioBase() * 1.30) + getPrestaciones();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " | Cedula: " + cedula + " | Area: " + area + " | Salario Total: " + getSalarioTotal();
    }
}
