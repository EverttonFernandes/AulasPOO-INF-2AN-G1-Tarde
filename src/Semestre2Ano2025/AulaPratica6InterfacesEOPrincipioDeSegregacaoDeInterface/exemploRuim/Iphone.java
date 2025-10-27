package Semestre2Ano2025.AulaPratica6InterfacesEOPrincipioDeSegregacaoDeInterface.exemploRuim;

public class Iphone extends DispositivoEletronico implements Comportamentos{
    @Override
    protected void ligar() {
        System.out.println("Iphone ligando!");
    }

    @Override
    protected void desligar() {
        System.out.println("Iphone desligando!");
    }

    @Override
    protected void emitirSom() {
        System.out.println("Iphone emitindo som!");
    }

    @Override
    public void ligarWifi() {
        System.out.println("Iphone ligando WiFi!");
    }

    @Override
    public void ligarBluetooth() {
        System.out.println("Iphone ligando Bluetooth!");
    }

    @Override
    public void abrirTetoSolar() {
        throw new UnsupportedOperationException("Iphone nao possui teto solar!");
    }
}
