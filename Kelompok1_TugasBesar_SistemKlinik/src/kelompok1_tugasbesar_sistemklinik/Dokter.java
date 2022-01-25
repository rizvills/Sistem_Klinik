package kelompok1_tugasbesar_sistemklinik;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Muhammad Rizki A. S. , Rianda Khusuma, Dista Nurdiana
 */
public class Dokter extends Pegawai {
    private String  codeDokter;
    private String[] hasilCheck;
    private String hasilDiagnosa;
    public Dokter(){
        
    }
    public Dokter(String nama, String id, String code,  Pasien pasien){
        super(nama,id);  
               
    }
    public void setCodeDokter(String codeDokter){
        this.codeDokter =  codeDokter;
    }
    public void setHasilCheck(String[]  hasilCheck){
        this.hasilCheck =  hasilCheck;
    }
    public void setHasilDiagnosa(String  hasilDiagnosa){
        this.hasilDiagnosa =  hasilDiagnosa;
    }
    public String getCodeDokter(){
        return codeDokter;
    }
    public String[]  getHasilCheck(){
        return hasilCheck;
    }
    public String getHasilDiagnosa(){
        return hasilDiagnosa;
    }
    public void checkPasien(Pasien pasien,String value, Conn conn)throws SQLException{       
        String sql = "SELECT * FROM pasien WHERE Nama = '"+ 
                    value +"'";
        ResultSet rs = conn.getData(sql);  
        String nama = null, tgl_lahir = null, keluhan = null, riwayat_penyakit = null, suhu_tubuh = null, tekanan_darah = null;
        while(rs.next()){
            nama = rs.getString("Nama");
            tgl_lahir = rs.getString("Tanggal_Lahir");
            keluhan = rs.getString("Keluhan");
            riwayat_penyakit = rs.getString("Riwayat_Penyakit");
            suhu_tubuh = rs.getString("Suhu_Tubuh");
            tekanan_darah = rs.getString("Tekanan_Darah");
        }
        String[] hasilCheckk = {nama,tgl_lahir,keluhan,riwayat_penyakit, suhu_tubuh, tekanan_darah};  
        setHasilCheck(hasilCheckk);

    }
    public String diagnosa(String[]  hasilCheck){
        String hasilDiagnosa;
        Penyakit penyakit = new Penyakit();
        String keluhan = hasilCheck[2].toUpperCase();   
        System.out.println(keluhan);
        int suhu_tubuh = Integer.parseInt(hasilCheck[4]);       
        int tekanan_darah = Integer.parseInt(hasilCheck[5]);
        if(penyakit.getGejalaDBD().contains(keluhan) && suhu_tubuh >=37 && tekanan_darah < 90){
            hasilDiagnosa = "Demam Berdarah";
        }else if(penyakit.getGejalaDiare().contains(keluhan)){
            hasilDiagnosa = "Diare";
        }else if(penyakit.getGejalaFlu().contains(keluhan) && suhu_tubuh >= 37 ){
            hasilDiagnosa = "Flu";                    
        }else if(penyakit.getGejalaCovid().contains(keluhan) && suhu_tubuh >= 37 ){
            hasilDiagnosa = "Covid";
        }else{
            hasilDiagnosa = "Penyakit Tidak Dikenali";            
        }   
        setHasilDiagnosa(hasilDiagnosa);
        return hasilDiagnosa;
    }
    public ArrayList buatResep(String hasilDiagnosa){
        ArrayList resep = new ArrayList();
        if(hasilDiagnosa == "Demam Berdarah"){
            resep.add("Antipiretik");
            resep.add("Antiemetik");
        }else if (hasilDiagnosa == "Diare"){
            resep.add("Antidiare");
            resep.add("Mineral");
            resep.add("Elektrolit");
            resep.add("Antibiotik");
        }else if (hasilDiagnosa == "Flu"){
            resep.add("Analgesik");
            resep.add("Antiinflamasi Nonsteroid");
            resep.add("Pelega Pernapasan");
        }else if (hasilDiagnosa == "Covid"){
            resep.add("Antibiotik Makrolida");
            resep.add("Antivirus Neuraminidase Inhibitor");
            resep.add("Antivirus Influenza");
            resep.add("Antipiretik");
            resep.add("Vitamin C");
            resep.add("Vitamin D");
        }
        return resep;
    }
    public String jamKerja(String nama, Conn conn) throws SQLException{
        String sql = "SELECT Jam_Kerja FROM dokter WHERE Nama = '"+ 
                    (nama) +"'";;
        ResultSet rs = conn.getData(sql);
        String jk = null;
        while(rs.next()){
            jk = rs.getString("Jam_Kerja");
        }
        return jk;
    }

    @Override
    public void berobat() {
        
        
        
        
        
        
        
        
        
        
        
        
        Pasien p = new Pasien();
        p.berobat();
    }


}
