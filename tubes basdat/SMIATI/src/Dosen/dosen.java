/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosen;

/**
 *
 * @author Acer id
 */
public class dosen {
    public String nip;
    public String nama;
    public String email;
    public dosen(String nip, String nama, String email){
        this.nip=nip;
        this.nama=nama;
        this.email=email;
    }
    
    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public String getEmail(){
        return email;
    }
}
