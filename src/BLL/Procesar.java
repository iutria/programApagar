/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.IOException;

public class Procesar {
    public boolean Proceso(String cmd){
        try {
            Process ejecutar = Runtime.getRuntime().exec(cmd);
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
}
