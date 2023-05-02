public class orang implements superhero, skill{
    private String senjata;
    private String attack;
    private String defend;
    private String namaSuperhero;

    public void senjata(String senjata) {
        this.senjata = senjata;
    }

    public String getSenjata() {
        return this.senjata;
    }

    public void attack(String attack){
        this.attack = attack;
    }

    public String getAttack() {
        return this.attack;
    }

    public void defend(String defend) {
        this.defend = defend;
    }

    public String getDefend() {
        return this.defend;
    }

    public void siapaNamaSuperhero(String namaSuperhero) {
        this.namaSuperhero = namaSuperhero;
    }

    public String getSiapaNamaSuperhero() {
        return this.namaSuperhero;
    }

    public void display() {
        System.out.println(this.namaSuperhero);
        System.out.println(this.senjata);
        System.out.println(this.attack);
        System.out.println(this.defend);
    }
}
