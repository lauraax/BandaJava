/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.lnpaezc.banda.logica;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Banda {

    private instrumento[] instrumentos;
    
    public void conformarBanda(int cantidadInstrumentos){
        Random r = new Random();
        this.instrumentos = new instrumento[cantidadInstrumentos];
        
        for(int i = 0; i< cantidadInstrumentos; i++){
            int aleatorio = r.nextInt(1,4);
            this.instrumentos[i] = this.generarInstrumento(aleatorio);
        }
    }
    public void afinarBanda(){
        for (instrumento instr: instrumentos) {
            System.out.println(instr.afinar());
            
        }
    }
    public void tocarBanda(){
        for (instrumento instr: instrumentos) {
            System.out.println(instr.tocar());
            
        }
    }
    public instrumento generarInstrumento(int opcion){
        switch (opcion){
            case 1:
                return new Guitarra();
            case 2:
                return new Tiple();
            case 3:
                return new Tambor();
            default:
                throw new AssertionError();
        }
    }
}
