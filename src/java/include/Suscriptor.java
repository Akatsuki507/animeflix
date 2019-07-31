/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package include;

/**
 *
 * @author Alfonso
 */
public class Suscriptor {


    private String cuenta;
    private String email;
    private String password;
    private String Foto_perfil;
    
    public Suscriptor() {
    }

    public Suscriptor(String cuenta, String email, String password , String Foto_perfil) {
        this.cuenta = cuenta;
        this.email = email;
        this.password = password;
        this.Foto_perfil = Foto_perfil;
    }

    
    
    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

        /**
     * @return the Foto_perfil
     */
    public String getFoto_perfil() {
        return Foto_perfil;
    }

    /**
     * @param Foto_perfil the Foto_perfil to set
     */
    public void setFoto_perfil(String Foto_perfil) {
        this.Foto_perfil = Foto_perfil;
    }

}
