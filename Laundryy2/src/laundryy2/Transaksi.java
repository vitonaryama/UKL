/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryy2;

import java.util.ArrayList;

/**
 *
 * @author CATURWARGA COMPUTER
 */
public class Transaksi { 
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
   
    public JenisLaundry laundry = new JenisLaundry();
    
    public int size(){//size:menghitung arraylist
        return this.idClient.size();
    }
    
    public Transaksi(){ //konstruktor
        this.idClient.add(12345);
        this.idClient.add(54321);
        for(int i=0;i<laundry.size();i++){
            this.idJenisLaundry.add(i);
        }
    }
    //menambah nilai variable
    public void setIDClient(int id){
        this.idClient.add(id);
    }
    
    public void setIDJenisLaundry(int id){
        this.idJenisLaundry.add(id);
    }
    
    public void setBanyak(int banyak){
        this.banyak.add(banyak);
    }
    //mengambil nilai variable
    public int getClient(int id){
        return this.idClient.indexOf(id);
    }
    
    public int getIDClient(int id){
        return this.idClient.get(id);
    }
    
    public int getIDJenisLaundry(int id){
        return this.idJenisLaundry.get(id);
    }
    
    public int getBanyak(int id){
        return this.banyak.get(id);
    }
    
    public int getIDBanyak(int banyak){
        return this.banyak.indexOf(banyak);
    }
}

