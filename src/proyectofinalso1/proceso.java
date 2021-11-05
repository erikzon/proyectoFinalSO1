/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalso1;

/**
 *
 * @author Erick
 */
class proceso {
    private String Nombre;
    private int UID;
    private String Estado;
    private int Memoria;
    private int timerInternoParaAsignarAMemoria;

    public int getTimerInternoParaAsignarAMemoria() {
        return timerInternoParaAsignarAMemoria;
    }

    public void setTimerInternoParaAsignarAMemoria(int timerInternoParaAsignarAMemoria) {
        this.timerInternoParaAsignarAMemoria = timerInternoParaAsignarAMemoria;
    }
    
    public void disminuirTimer(){
        this.timerInternoParaAsignarAMemoria--;
    }
        
    proceso(){
        int min = 1;
        int max = 2;
        timerInternoParaAsignarAMemoria = (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
    
    public proceso copia(proceso otro){
        proceso nuevoproceso = new proceso();
        nuevoproceso.Nombre = otro.Nombre;
        nuevoproceso.UID = otro.UID;
        nuevoproceso.Estado = otro.Estado;
        nuevoproceso.Memoria = otro.Memoria;
        nuevoproceso.timerInternoParaAsignarAMemoria = otro.timerInternoParaAsignarAMemoria;
        return nuevoproceso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int Memoria) {
        this.Memoria = Memoria;
    }
}
