package Semestre2Ano2025.AulaPratica6InterfacesEOPrincipioDeSegregacaoDeInterface.exemploRuim;

public class Jeep extends MeioDeTransporte implements Comportamentos {
    @Override
    protected void acelerar() {
        System.out.println("Jeep acelerando!");
    }

    @Override
    protected void frear() {
        System.out.println("Jeep freiando!");
    }

    @Override
    protected void buzinar() {
        System.out.println("Jeep buzinando!");
    }

    @Override
    public void ligarWifi() {
        System.out.println("Jeep ligando WiFi da central multimidia!");
    }

    @Override
    public void ligarBluetooth() {
        System.out.println("Jeep ligando Bluetooth da central multimidia!");
    }

    @Override
    public void abrirTetoSolar() {
        System.out.println("Jeep abrindo teto solar!");
    }
}
