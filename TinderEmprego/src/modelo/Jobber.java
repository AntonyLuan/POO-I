package modelo;


public class Jobber {
	private Empresa empresa = new Empresa();

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public boolean isEmpty() {
		if(getEmpresa().getNome().compareTo("") == 0) {
			return true;
		}
		return false;
	}
}
