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
public class encripsi {
    
    private String Key_Enkripsi;
    private String Pesan_Enkripsi;
    
    public encripsi(String Key_Enkripsi,String Pesan_Enkripsi){
        this.Key_Enkripsi = Key_Enkripsi;
        this.Pesan_Enkripsi = Pesan_Enkripsi;
    }
    
    public String GetKey(){
        return Key_Enkripsi;
    }
    public void SetKey(String Key_Enkripsi){
        this.Key_Enkripsi = Key_Enkripsi;
    }
    public String GetPesan(){
        return Pesan_Enkripsi;
    }
    public void SetPesan(String Pesan_Enkripsi){
        this.Pesan_Enkripsi=Pesan_Enkripsi;
    }
    
    public String encripsi(String Key_Enkripsi,String Pesan_Enkripsi){
        int y = 0,x;
        int i ;
        int j =0;
        String Pesan ="";
        this.Pesan_Enkripsi = Pesan_Enkripsi;
        this.Key_Enkripsi = Key_Enkripsi;
        
        
        /*for(x = 0; x < Pesan_Enkripsi.length(); x++)
        {
            char huruf = Pesan_Enkripsi.charAt(x);
            int nilai = (int)Pesan_Enkripsi.charAt(x);
            
            if(nilai >= 48 && nilai <= 57){
                
                Pesan = Pesan + (char) ((huruf - 48 + (Key_Enkripsi.charAt(y) - 'A'))%10 + 48);
                
            }
            else if(nilai >= 65 && 90 >= nilai){
                   Pesan = Pesan + (char)((huruf + Key_Enkripsi.charAt(y) - 2 * 'A' ) % 26 + 'A');    
              
             }
            y = ++y % Key_Enkripsi.length();
                 
        }*/
        
        
        int k= 0;
        int jumlah = (Pesan_Enkripsi.length() / Key_Enkripsi.length())+1;
        int[][] matrixA=new int[Pesan_Enkripsi.length()][Pesan_Enkripsi.length()];
        for(i = 0; i < Key_Enkripsi.length(); i++){
            for(j=0; j <Key_Enkripsi.length(); j++ ){
                char huruf  = Pesan_Enkripsi.charAt(k);
                int nilai = (int)Pesan_Enkripsi.charAt(k);
                   matrixA[i][j]=k;
                k++;
            }
        }
        
        for( i=0;i<Key_Enkripsi.length();i++){
            for( j=0;j<Key_Enkripsi.length();j++){
                System.out.print(matrixA[i][j]+" ");
            }
            System.out.println();
        }
        
        
        /*for(x = 0; x < Pesan_Enkripsi.length(); x++){
            {
                for(int a = 0; a < Key_Enkripsi.length(); a++){
                    if
                }
            }
        }*/
        
        
        //return Pesan;
        return null;
    }
    
}
