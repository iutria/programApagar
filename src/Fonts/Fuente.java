/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fonts;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author IVÁN UTRIA
 */
public class Fuente {
    private Font font = null;
    public String Marvelous = "Marvelous-Sans-Demo.otf";
    public String Multicolore= "Multicolore.otf";
    public Font getFont(String fuente, int estilo,float size){
        try{
            InputStream is = getClass().getResourceAsStream(fuente);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        }catch(Exception e){
            font = new Font("Arial", Font.PLAIN,14);
        }
        Font tfont = font.deriveFont(estilo,size);
        return tfont;
    }
}
