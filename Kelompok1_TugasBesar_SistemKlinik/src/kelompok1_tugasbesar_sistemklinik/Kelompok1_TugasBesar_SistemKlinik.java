package kelompok1_tugasbesar_sistemklinik;

public class Kelompok1_TugasBesar_SistemKlinik {
    public static void main(String[] args)  {
        Resepsionis r = new Resepsionis();
        Conn conn = new Conn();
        Dokter d = new Dokter();
        Pasien p = new Pasien();
        r.berobat();
        
    }
    
}
