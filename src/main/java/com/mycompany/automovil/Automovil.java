package com.mycompany.automovil;
import com.mycompany.automovil.igu.Principal;


 
public class Automovil {

    public static void main(String[] args) {
        
        //llamamos y hacemos visible nuestra IGU
        Principal princ =  new Principal ();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
