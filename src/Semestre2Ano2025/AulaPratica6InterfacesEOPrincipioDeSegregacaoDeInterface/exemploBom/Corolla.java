package Semestre2Ano2025.AulaPratica6InterfacesEOPrincipioDeSegregacaoDeInterface.exemploBom;

public class Corolla extends MeioDeTransporteExemploBom implements Wifi, Bluetooth, TetoSolar {
    @Override
    public void ligarBluetooth() {
        System.out.println("Corolla ligando Bluetooth da central multimidia!");
    }

    @Override
    protected void acelerar() {
        System.out.println("Corolla acelerando!");
    }

    @Override
    protected void frear() {
        System.out.println("Corolla freiando!");
    }

    @Override
    protected void buzinar() {
        System.out.println("Corolla buzinando!");
    }

    @Override
    public void ligarWifi() {
        System.out.println("Corolla ligando WiFi da central multimidia!");
    }

    @Override
    public void abrirTetoSolar() {
        System.out.println("Corolla abrindo teto solar!");
    }
}
