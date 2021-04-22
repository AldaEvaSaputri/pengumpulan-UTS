
/**
 *
 * @author AldaEva
 */
public class MatematikaCanggih {
    int tambah;
    int kali;
    int modulus;
    
    void pertambahan(int c, int d){
        tambah = c + d;
        System.out.println("c + d = "+tambah);
    }
    int getTambah(){
        return tambah;
    }
    
    void perkalian(int c, int d){
        kali = c * d;
        System.out.println("c * d = "+kali);
    }
    
     int getKali(){
        return kali;
    }
     
     void modulus(int c, int d){
         modulus = c % d;
         System.out.println("c % d = "+ modulus);
    }
     
     int getModulus(){
         return modulus;
    }
  }
