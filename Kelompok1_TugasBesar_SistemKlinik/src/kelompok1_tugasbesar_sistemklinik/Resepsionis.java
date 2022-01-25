package kelompok1_tugasbesar_sistemklinik;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Muhammad Rizki A. S. , Rianda Khusuma, Dista Nurdiana
 */
public class Resepsionis extends Pegawai{
    private String codeResepsionis;
    private String tanggal;

    public Resepsionis(){
        
    }
    public Resepsionis(String nama, String id,String code, String tanggal, Dokter dokter, Pasien  pasien, Apoteker apoteker){
        super(nama,id);  
        setCodeResepsionis(code);
        setTanggal(tanggal);
               
    }

    public void setCodeResepsionis(String codeResepsionis){
        this.codeResepsionis =  codeResepsionis;
    }
    public void setTanggal(String  tanggal){
        this.tanggal = tanggal;
    }
    public void buatBill(Pasien  pasien,Dokter dokter, Apoteker apoteker, Bill bill){
        apoteker.setResep(dokter.buatResep(dokter.getHasilDiagnosa()));
        apoteker.setObat(apoteker.getResep());       
        bill.setVisible(true);
        bill.pack();
        bill.setLocationRelativeTo(null);
        bill.setDefaultCloseOperation(bill.HIDE_ON_CLOSE);
        System.out.println(pasien.getNama());
        bill.tambahDaftar(pasien.getNama(),apoteker.getObat());

        
    }
    public String getCodeResepsionis(){
        return codeResepsionis;
    }
    public String  getTanggal(){
        return tanggal;
    }

    
    public String cariDokter(Dokter dokter, Conn conn) throws SQLException{
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");  
        String now = date.format(format); 
        String[] x = now.split(":",2);
        int number = Integer.parseInt(x[0]);
        String sql = null;
        if ((number >= 0)&&(number<=8)){
            sql = "SELECT Nama FROM dokter WHERE Jam_Kerja LIKE'00%'"; 
        }else if((number >= 8)&&(number<=16)){
            sql = "SELECT Nama FROM dokter WHERE Jam_Kerja LIKE'08%'"; 
        }else{
            sql = "SELECT Nama FROM dokter WHERE Jam_Kerja LIKE'16%'"; 
        }
        ResultSet rs = conn.getData(sql);
        String nama = null;
        while(rs.next()){
            nama = rs.getString("Nama");
        }
        return nama;

    }
    public void pendaftaranPasien(Pendaftaran pendaftaran){
        pendaftaran.setVisible(true);
        pendaftaran.pack();
        pendaftaran.setLocationRelativeTo(null);
        pendaftaran.setDefaultCloseOperation(Pendaftaran.EXIT_ON_CLOSE);        
    }
    public String jamKerja(String nama, Conn conn) throws SQLException{
        String sql = "SELECT Jam_Kerja FROM resepsionis WHERE Nama = '"+ 
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
