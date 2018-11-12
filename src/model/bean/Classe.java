package model.bean;

public class Classe {
    	private String nome;
	private Integer health;
	private Integer mana;
	
	public Classe(String nome) {
		
		if(nome.equals("Guerreiro")){
				this.setVida(200);
				this.setMana(40);
		}
		if(nome.equals("Mago")) {
				this.setVida(100);
				this.setMana(150);
		}
		if(nome.equals("Arqueiro")) {
				this.setVida(125);
				this.setMana(100);
		} 
	}

	public Integer getVida() {
		return health;
	}

	public void setVida(Integer health) {
		this.health = health;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

}
