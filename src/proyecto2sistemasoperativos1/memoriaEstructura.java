/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2sistemasoperativos1;

import java.util.ArrayList;
import jdk.nashorn.internal.ir.CatchNode;

/**
 *
 * @author Erick
 */
public class memoriaEstructura {

    private int uso = 0;

    private int tamano = 200000;

    private int timerterminarproceso;

    private int disponible = tamano;

    private int UID;

    //LOGICA DE PROCESOS INTERNOS
    public ArrayList<proceso> procesosInternos = new ArrayList();

    public StringBuilder getListaProcesosInternos() {
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < this.procesosInternos.size(); i++) {
            lista.append(this.procesosInternos.get(i).getNombre() + " ");
        }
        return lista;
    }

    public void agregarProcesoAMemoria(proceso procesoNuevo) {
        procesosInternos.add(procesoNuevo);
    }

    public void eliminarProceso(int uid) {
        for (int i = 0; i < this.procesosInternos.size(); i++) {
            if (uid == procesosInternos.get(i).getUID()) {
                disponible = disponible + procesosInternos.get(i).getMemoria();
                procesosInternos.remove(i);
            }
        }
    }

    public void setearUltimaMemoria() {
        this.procesosInternos.get(procesosInternos.size() - 1).setMemoria(200000);
    }

    public int obtenerUIDPrimerProceso() {
        try {
            return procesosInternos.get(0).getUID();
        } catch (Exception e) {
            return -1;
        }
    }

    //<---------->
    public int getTimerterminarproceso() {
        return timerterminarproceso;
    }

    memoriaEstructura() {
        int min = 2;
        int max = 3;
        timerterminarproceso = (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public void disminuirTimer() {
        this.timerterminarproceso--;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getUso() {
        uso = 0;
        for (int i = 0; i < this.procesosInternos.size(); i++) {
            uso = uso + this.procesosInternos.get(i).getMemoria();
        }
        return uso;
    }

    public int getDisponible() {
        disponible = 200000;
        for (int i = 0; i < this.procesosInternos.size(); i++) {
            disponible = disponible - this.procesosInternos.get(i).getMemoria();
        }
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

}
