package Semestre2Ano2025.AulaPratica6InterfacesEOPrincipioDeSegregacaoDeInterface.exemploBom;

public class TelevisaoOLED extends DispositivoEletronicoExemploBom implements Wifi, Bluetooth{
    @Override
    public void ligarBluetooth() {
        System.out.println("Televisao OLED ligando Bluetooth!");
    }

    @Override
    protected void ligar() {
        System.out.println("Televisao OLED ligando!");
    }

    @Override
    protected void desligar() {
        System.out.println("Televisao OLED desligando!");
    }

    @Override
    protected void emitirSom() {
        System.out.println("Televisao OLED emitindo som!");
    }

    @Override
    public void ligarWifi() {
        System.out.println("Televisao OLED ligando WiFi!");
    }
}
