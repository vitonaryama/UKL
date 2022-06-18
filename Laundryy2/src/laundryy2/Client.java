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
public class Client implements User{
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public int size(){
        return this.namaClient.size();
    }
    
    public Client(){
        this.namaClient.add("Wira");
        this.alamat.add("Surabaya");
        this.telepon.add("08982916070");
        this.saldo.add(100000);
        
        this.namaClient.add("Vito");
        this.alamat.add("Jogja");
        this.telepon.add("0895368724855");
        this.saldo.add(150000);
        
    }
    
    public int getId(String nama){
        return this.namaClient.indexOf(nama);
    }
    
    @Override
    public void setNama(String nama) {
        this.namaClient.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    public void addSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    public void setSaldo(int id,int saldo){
        this.saldo.set(id,saldo);
    }

    @Override
    public String getNama(int id) {
        return this.namaClient.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    public int getSaldo(int id){
        return this.saldo.get(id);
    }
    
    public void tampilClient(){
        int n = this.namaClient.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Saldo   = "+getSaldo(i));
        }
    }

    @Override
    public void setJabatan(Integer jabatan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getJabatan(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


