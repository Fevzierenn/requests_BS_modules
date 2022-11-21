package AnthonySoprano;

public class Futbolcu {
	private String ismi;
	private int yasi;
	public String unvan;
	private int formanumarasi;
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public int getFormanumarasi() {
		return formanumarasi;
	}
	public void setFormanumarasi(int formanumarasi) {
		this.formanumarasi = formanumarasi;
	}
	public String getIsmi() {
		return ismi;
	}
	public void setIsmi(String ismi) {
		this.ismi = ismi;
	}
	public int getYasi(){
		return this.yasi;
	}
	public void setYasi(int yas){
		if(yas<22){
			this.unvan="Genç";
			this.yasi=yas;
		}
		else if(yas >=22 && yas<32){
			this.unvan="prime";
			this.yasi=yas;
		}
		else{
			this.unvan="yaþlý";
			this.yasi=yas;
		}
	}
	
	
}
