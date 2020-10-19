package com.gonzalo_zelinka.contactos;

public class Informacion {
    private String nombreC;
    private String fechaN;
    private String tel;
    private String email;
    private String descrip;

    public Informacion(String nombreC, String tel) {
        this.nombreC = nombreC;
        this.tel = tel;
    }

    public Informacion(String nombreC, String fechaN, String tel, String email, String descrip) {
        this.nombreC = nombreC;
        this.fechaN = fechaN;
        this.tel = tel;
        this.email = email;
        this.descrip = descrip;
    }
    public Informacion(String nombreC, String fechaN, String tel, String email) {
        this.nombreC = nombreC;
        this.fechaN = fechaN;
        this.tel = tel;
        this.email = email;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
