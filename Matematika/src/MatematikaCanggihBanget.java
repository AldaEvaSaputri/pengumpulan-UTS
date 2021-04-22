
public class MatematikaCanggihBanget extends MatematikaCanggih{
    int tambahEmpat;
    void pertambahanEmpat(int a, int b, int c, int d){
        tambahEmpat = a+b+c+d;
        System.out.println("a + b + c + d = "+tambahEmpat);
    }
    int getJumlahEmpat(){
    return tambahEmpat;
    }
}
