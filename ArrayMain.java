public class ArrayMain {
    public static void main(String[] args) {
        
        //String nama1 = "viola";
       // String nama2 = "Kusti";
        //String nama2 = "Azkia";

        //System.out.println(nama1);
        //System.out.println(nama2);
        //System.out.println(nama3);

        String[] daftarNama = {"viola","kusti","Azkia"};
        //System.out.println(daftarNama[1]);
        for (String nama : daftarNama){
            System.out.println(nama);
        }
          /*Deklarasi Array cara 2 */   
        String[] dataNama = new String[3];
        dataNama[0]="viola";
        dataNama[1]="kusti";
        dataNama[2]="azkia cantikkkkkkkk";

        for (String nama : dataNama) {
            System.out.println(nama);
            
        }


    }
}
