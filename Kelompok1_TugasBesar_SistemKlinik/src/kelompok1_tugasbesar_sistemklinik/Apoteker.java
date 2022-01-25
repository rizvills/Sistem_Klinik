package kelompok1_tugasbesar_sistemklinik;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Muhammad Rizki A. S. , Rianda Khusuma, Dista Nurdiana
 */
public class Apoteker extends Pegawai {
    
    private String codeApoteker;
    private ArrayList<String> resep = new ArrayList<String>();
    private ArrayList obat;
    public Apoteker(){
        
    }
    public Apoteker(String nama, String id){
        super(nama,id);  
    }

    public void setCodeApoteker(String nama, String id, String codeApoteker){
        this.codeApoteker = codeApoteker;
    }
    public void setObat(ArrayList resep){
        ArrayList<Obat> NHObat = new ArrayList<Obat>();
        if (resep.contains("Antipiretik")){
            NHObat.add(new Obat("Paracetamol",5000));           
        }
        if (resep.contains("Antiemetik")){
            NHObat.add(new Obat("Domperidone",6000));
        }
        if(resep.contains("Antidiare")){
            NHObat.add(new Obat("Loperamide",3000));
        }
        if(resep.contains("Mineral")){
            NHObat.add(new Obat("Bismuth Subsalicylate",18000));
        }
        if(resep.contains("Elektrolit")){
            NHObat.add(new Obat("Oralit",10000));
        }
        if(resep.contains("Antibiotik")){
            NHObat.add(new Obat("Cefixime",33700));    
        }
        if(resep.contains("Analgesik")){
            NHObat.add(new Obat("Paracetamol",5000));
        }
        if(resep.contains("Antiinflamasi Nonsteroid")){
            NHObat.add(new Obat("Ibuprofen",5500));
        }
        if(resep.contains("Pelega Pernapasan")){
            NHObat.add(new Obat("Dekongestan",18900));
        }
        if(resep.contains("Antibiotik Makrolida")){
            NHObat.add(new Obat("Azithromycin",17000));
        }
        if(resep.contains("Antivirus Neuraminidase Inhibitor")){
            NHObat.add(new Obat("Oseltamivir",130000));
        }
        if(resep.contains("Antivirus Influenza")){
            NHObat.add(new Obat("Favipiravir",35000));
        }
        if(resep.contains("Vitamin C")){
            NHObat.add(new Obat("Imboost Force Strip",44000));
        }
        if(resep.contains("Vitamin D")){
            NHObat.add(new Obat("Pure Encapsulations D3",46600));
        }
        this.obat = NHObat;
    }
    public void setResep(ArrayList resep){
        this.resep = resep;
    }
    public String getCodeApoteker(){
        return codeApoteker;
    }
    public ArrayList getResep(){
        return resep;
    }
    public ArrayList<Obat> getObat(){
        return obat;
    }
    public String jamKerja(String nama, Conn conn) throws SQLException{
        String sql = "SELECT Jam_Kerja FROM apoteker WHERE Nama = '"+ 
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
