package pckg1;

public class Medoc{
	private int cis;
	private int cip7;
	private String name;
	private String substance_active;
	private String dosage_sub_active;
	private String forme_pharmaceutique;
	private String voie_administration;
	private float prix;
	private String condition_prescrip_delivrance;
	
	
	
	public Medoc(int ci, int cip, String n, String sub,String dosage,String f, String v,float p,String cpd) {
		this.cis = ci;
		this.cip7 = cip;
		this.name = n;
		this.substance_active = sub;
		this.dosage_sub_active =  dosage;
		this.forme_pharmaceutique = f;
		this.voie_administration = v;
		this.prix = p;
		this.condition_prescrip_delivrance = cpd;
	}
	
	
	
	
	


	public int getCis() {
		return cis;
	}







	public void setCis(int cis) {
		this.cis = cis;
	}







	public int getCip7() {
		return cip7;
	}







	public void setCip7(int cip7) {
		this.cip7 = cip7;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public String getSubstance_active() {
		return substance_active;
	}







	public void setSubstance_active(String substance_active) {
		this.substance_active = substance_active;
	}







	public String getDosage_sub_active() {
		return dosage_sub_active;
	}







	public void setDosage_sub_active(String dosage_sub_active) {
		this.dosage_sub_active = dosage_sub_active;
	}







	public String getForme_pharmaceutique() {
		return forme_pharmaceutique;
	}







	public void setForme_pharmaceutique(String forme_pharmaceutique) {
		this.forme_pharmaceutique = forme_pharmaceutique;
	}







	public String getVoie_administration() {
		return voie_administration;
	}







	public void setVoie_administration(String voie_administration) {
		this.voie_administration = voie_administration;
	}







	public float getPrix() {
		return prix;
	}







	public void setPrix(float prix) {
		this.prix = prix;
	}







	public String getCondition_prescrip_delivrance() {
		return condition_prescrip_delivrance;
	}







	public void setCondition_prescrip_delivrance(String condition_prescrip_delivrance) {
		this.condition_prescrip_delivrance = condition_prescrip_delivrance;
	}







	@Override
	public String toString() {
		return "Medoc [cis=" + cis + ", cip7=" + cip7 + ", name=" + name + ", substance_active=" + substance_active
				+ ", dosage_sub_active=" + dosage_sub_active + ", forme_pharmaceutique=" + forme_pharmaceutique
				+ ", voie_administration=" + voie_administration + ", prix=" + prix + ", condition_prescrip_delivrance="
				+ condition_prescrip_delivrance + "]";
	}
	
	
	
	
}