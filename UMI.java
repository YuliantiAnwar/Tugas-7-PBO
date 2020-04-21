interface Kampus {
	
	void prodi();
	void fakultas();
	
}

abstract class swasta implements Kampus{
	
	
	 @Override
	    public void prodi() {
	        System.out.println("Prodi 	: Teknik Informatika");
	    }
	
	 @Override
	    public void fakultas() {
	        System.out.println("Fakultas: Ilmu Komputer");
	    }
	
	
}

public class UMI extends swasta {

	public static void main(String[] args) {
		
		UMI u = new UMI();
		u.prodi();
		u.fakultas();
		}
		
}

