package laba7_2_2;

public class Pickup implements PassangerAuto, CargoAuto {
    public void CarAut(){
        System.out.println("Перевозка груза");
    }
    public void PasAut(){
        System.out.println("Перевозка пассажиров");
    }
}
