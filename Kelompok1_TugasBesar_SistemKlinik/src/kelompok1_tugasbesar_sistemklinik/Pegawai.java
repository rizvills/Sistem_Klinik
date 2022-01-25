package kelompok1_tugasbesar_sistemklinik;

import java.sql.SQLException;

/**
 *
 * @author Muhammad Rizki A. S. , Rianda Khusuma, Dista Nurdiana
 */
public abstract class Pegawai implements Berobat{
    private String nama;
    private String id;
    public Pegawai(){
        
    }
    public Pegawai(String nama, String id){
        setNama(nama);
        setID(id);
    }
    public abstract String jamKerja(String nama, Conn conn)throws SQLException;
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setID(String id){
        this.id = id;
    }
    public String getNama(){
        return nama;
    }
    public String getID(){
        return id;
    }
}
