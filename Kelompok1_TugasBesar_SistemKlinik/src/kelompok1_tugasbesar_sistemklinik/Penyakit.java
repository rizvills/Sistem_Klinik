package kelompok1_tugasbesar_sistemklinik;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Penyakit {
    private ArrayList<String> gejalaDBD = new ArrayList<String>();
    private ArrayList<String> gejalaFlu = new ArrayList<String>();
    private ArrayList<String> gejalaDiare = new ArrayList<String>();
    private ArrayList<String> gejalaCovid = new ArrayList<String>();

    public Penyakit(){
        gejalaDBD.add("DEMAM");
        gejalaDBD.add("MUAL");
        gejalaDBD.add("BINTIK KEMERAHAN");
        
        gejalaDiare.add("SAKIT PERUT");
        gejalaDiare.add("MUAL");
        gejalaDiare.add("MULES");
        
        gejalaFlu.add("PILEK");
        gejalaFlu.add("PUSING");
        gejalaFlu.add("BATUK");
        gejalaFlu.add("DEMAM");
        
        gejalaCovid.add("ANOSMIA");
        gejalaCovid.add("PILEK");
        gejalaCovid.add("BATUK");          
    }

    public ArrayList<String> getGejalaDBD(){
        return gejalaDBD;
    }
    public ArrayList<String> getGejalaFlu(){
        return gejalaFlu;
    }
    public ArrayList<String> getGejalaDiare(){
        return gejalaDiare;
    }
    public ArrayList<String> getGejalaCovid(){
        return gejalaCovid;
    }    
    
            
}
