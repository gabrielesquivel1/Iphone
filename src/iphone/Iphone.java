/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iphone;
/**
 *
 * @author DELL
 */
public class Iphone implements ReprodutorMusical,AparelhoTelefone {
    
    boolean reproduzirMusica, chamada;
    int faixa;
    int volume;

    public Iphone() {
        this.reproduzirMusica = false;
        this.chamada = false;
        this.faixa = 1;
        this.volume = 25;
    }

    
    
    
    public boolean isReproduzirMusica() {
        return reproduzirMusica;
    }

    public void setReproduzirMusica(boolean reproduzirMusica) {
        this.reproduzirMusica = reproduzirMusica;
    }

    public boolean isChamada() {
        return chamada;
    }

    public void setChamada(boolean chamada) {
        this.chamada = chamada;
    }

    public int getFaixa() {
        return faixa;
    }

    public void setFaixa(int faixa) {
        this.faixa = faixa;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
        

    @Override
    public void reproduzirMusica() {
        setReproduzirMusica(true);
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausarMusica() {
        setReproduzirMusica(false);
        System.out.println("MÚSICA PAUSADA");
    }

    @Override
    public void faixaSeguinte() {
        if(this.faixa > 0){
            this.setFaixa(this.getFaixa()+1);
            System.out.println("Reproduzindo a faixa: " + this.faixa);
        }
    }

    @Override
    public void faixaAnterior() {
        if(this.faixa>0){
            this.setFaixa(this.getFaixa()-1);
            System.out.println("Reproduzindo a faixa: "+ this.faixa);
        }
    }

    @Override
    public void aumentarVolume() {
        if(this.getVolume()>0){
        this.setVolume(this.getVolume()+5);
            System.out.println("Volume: "+ this.getVolume());
        }
    }

    @Override
    public void diminuirVolume() {
        if(this.getVolume()>0){
        this.setVolume(this.getVolume()-5);
            System.out.println("Volume: " + this.getVolume());
        }
    }

    @Override
    public void mudo() {
        if(this.getVolume()>0){
            this.setVolume(0);
            System.out.println("Volume: " + this.volume);
        }
        
    }

    @Override
    public void realizarChamada() {
        setChamada(true);
        System.out.println("Realizando chamada");
    }

    @Override
    public void encerrarChamada() {
        setChamada(false);
        System.out.println("Chamada encerrada");
    }

    @Override
    public void atenderChamada() {
        setChamada(true);
        System.out.println("Atendendo Chamada");
    }

    @Override
    public String toString() {
        return "Iphone: \n" + "Reproduzindo Música= " + reproduzirMusica + "\nChamada= " + chamada + "\nFaixa= " + faixa + "\nVolume= " + volume ;
    }
    
    
    
    
    public static void main(String[] args) {
        Iphone i1 = new Iphone();
        i1.toString();
        
        System.out.println(i1.toString());
        
        i1.atenderChamada();
        System.out.println(i1.toString());


    }
}
