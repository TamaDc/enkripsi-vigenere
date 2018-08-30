/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fungsi;

/**
 *
 * @author Asus A455L
 */
public class decripsi {
    
    private String Key_Dekripsi;
    private String Pesan_Dekripsi;
    
    public decripsi(String Key_Dekripsi,String Pesan_Dekripsi){
        this.Key_Dekripsi = Key_Dekripsi;
        this.Pesan_Dekripsi = Pesan_Dekripsi;
    }
    
    public String GetKey(){
        return Key_Dekripsi;
    }
    public void SetKey(String Key_Dekripsi){
        this.Key_Dekripsi = Key_Dekripsi;
    }
    public String GetPesan(){
        return Pesan_Dekripsi;
    }
    public void SetPesan(String Pesan_Dekripsi){
        this.Pesan_Dekripsi=Pesan_Dekripsi;
    }
    
    public String decripsi(String Key_Dekripsi,String Pesan_Dekripsi)
    {
        
        this.Key_Dekripsi = Key_Dekripsi;
        this.Pesan_Dekripsi = Pesan_Dekripsi;
        
        String hasil = "";
        int y = 0 , x;
        Pesan_Dekripsi = Pesan_Dekripsi.toUpperCase();
        
        for (x = 0; x < Pesan_Dekripsi.length(); x++)
        {
            char pesan = Pesan_Dekripsi.charAt(x);
            int nilai = (int) Pesan_Dekripsi.charAt(x);
            if (pesan >= 65 && pesan <= 90){
                hasil = hasil + (char)((pesan - Key_Dekripsi.charAt(y) + 26) % 26 + 'A');
            }else if (nilai >= 48 && nilai <= 57){
                hasil = hasil + (char) ((((pesan - 48 - (Key_Dekripsi.charAt(y) - 'A'))+10)%10) + 48);
            }
            y = ++y % Key_Dekripsi.length();
        }
        return hasil;
    
    }
}