package kelompok1_tugasbesar_sistemklinik;
/**
 *
 * @author Muhammad Rizki A. S. , Rianda Khusuma, Dista Nurdiana
 */
public class Pasien   {
    private String nama;
    private String keluhan;
    private String tgl_lahir;
    private String riwayat_penyakit;
    private String nomor_hp;
    private String jenis_kelamin;
    public Pasien(){
             
    }
    public Pasien(String  nama, String keluhan, String tgl_lahir,  
            String riwayat_penyakit, String nomor_hp, String jenis_kelamin){
             
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setKeluhan(String keluhan){
        this.keluhan = keluhan;
    }
    public void setTglLahir(String TglLahir){
        this.tgl_lahir = TglLahir;
    }
    public void setRiwayatPenyakit(String RiwayatPenyakit){
        this.riwayat_penyakit = RiwayatPenyakit;
    }
    public void setNomorHP(String nomor_hp){
        this.nomor_hp = nomor_hp;
    }    
    public void setJenisKelamin(String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }
    public String getNama( ){
        return nama;
    }
    public String getKeluhan( ){
        return keluhan;
    }
    public String getTglLahir( ){
        return tgl_lahir;
    }
    public String getRiwayatPenyakit( ){
        return riwayat_penyakit;
    }
    public String getNomorHP( ){
        return nomor_hp;
    }    
    public String getJenisKelamin( ){
        return jenis_kelamin;
    }
    public void berobat(){
        MainFrame mainframe =  new MainFrame();
        mainframe.setVisible(true);
        mainframe.pack();
        mainframe.setLocationRelativeTo(null);
        mainframe.tambahDaftar();        
        mainframe.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
        
    }
    
}
