interface Pabrik{
    static final String PROVINSI = "Sulawesi Selatan";
	public void setNama(String namaBaru);
	public void setAlamat(String alamatBaru);
 	public String getNama();
 	public String getAlamat();
}

class PabrikSepatu implements Pabrik{
     String nama, alamat;
	public PabrikSepatu(String namaBaru, String alamatBaru){
	nama = namaBaru;
	alamat = alamatBaru;
   }
	public void setNama(String namaBaru){
 	nama = namaBaru;
 }
	public void setAlamat(String alamatBaru){
	alamat = alamatBaru;
 }
 	public String getNama(){
 	return nama;
 }
  	public String getAlamat(){
 	return alamat;
 }
  	public String getProvinsi(){
 	return PROVINSI;
 }
 public String toString(){
return
"Nama       : "+nama+"\n"+
"Alamat     : "+alamat+"\n"+
"Provinsi   : "+PROVINSI+"\n"; 
 }
}



public class ProgramInterface{
 	public static void main (String[] args) {
test();
 }
 static void test(){
 PabrikSepatu SupplierSepatu;
 SupplierSepatu = new PabrikSepatu("All Star","Pinrang");
 System.out.println("Informasi perusahaan : "+"\n"+SupplierSepatu);
}
}
