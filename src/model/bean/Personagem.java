package model.bean;


public class Personagem {
    
    private int id;
    private String nome;
    private String sexo;
    private String classe;
    private Integer level;
    private Integer vida;
    private Integer mana;
    private Integer gold;
    
    @Override
    public String toString(){
        StringBuilder aux = new StringBuilder();
        aux.append("Nome personagem: ").append(nome).append("\n");
        aux.append("Level: ").append(level).append("\n");
        aux.append("Classe: ").append(classe).append("\n");
        aux.append("Sexo: ").append(sexo).append("\n");
        aux.append("HP: ").append(vida).append("\n");
        aux.append("MP: ").append(mana).append("\n");
        aux.append("Gold:").append(gold).append("\n");
        return aux.toString();
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
  

    public Personagem() {
    }
    

    public Personagem(String nome, String classe, String sexo) {
        super();
        Classe j1 = new Classe(classe);
        this.nome = nome;
        this.sexo = sexo;
        this.classe = classe;
        this.level = 1;
        this.gold = 0;
        this.vida = j1.getVida();
        this.mana = j1.getMana();
    }
    
    public void Character(int id, String name, String job, int level, String sexo , int health, int mana, int gold) {
        this.id = id;
        this.classe = job;
        this.nome = name;
        this.sexo = sexo;
        this.classe = job;
        this.level = level;
        this.vida = health;
        this.mana = mana;
        this.gold = gold;
    }

    public void setCharacter(String name, String sex, String job, int level, int health, int mana) {
        this.nome = name;
        this.sexo = sex;
        this.classe = job;
        this.level = level;
        this.vida = health;
        this.mana = mana;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sex) {
        this.sexo = sex;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String job) {
        this.classe = job;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer health) {
        this.vida = health;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

