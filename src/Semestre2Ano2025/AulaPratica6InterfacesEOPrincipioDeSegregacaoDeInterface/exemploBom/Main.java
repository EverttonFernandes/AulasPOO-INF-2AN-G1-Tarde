package Semestre2Ano2025.AulaPratica6InterfacesEOPrincipioDeSegregacaoDeInterface.exemploBom;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        Corolla corolla = new Corolla();
        corolla.acelerar();
        corolla.frear();
        corolla.buzinar();
        corolla.ligarBluetooth();
        corolla.ligarWifi();
        corolla.abrirTetoSolar();
        System.out.println("-------------------------");
        TelevisaoOLED tvOled = new TelevisaoOLED();
        tvOled.ligar();
        tvOled.ligarWifi();
        tvOled.ligarBluetooth();
        tvOled.desligar();
        System.out.println("-------------------------");
    }
}
