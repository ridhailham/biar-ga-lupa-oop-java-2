public class main {
    public static void main(String[] args) {
        orang spiderman = new orang();
        spiderman.siapaNamaSuperhero("Peter Parker");
        spiderman.senjata("jaring laba - laba");
        spiderman.attack("menggunakan laba - laba untuk menembak dan mengikat lawan");
        spiderman.defend("menggunakan jaring untuk berlindung dan kabur");
        spiderman.display();
        

        orang ironman = new orang();
        ironman.siapaNamaSuperhero("Tony Stark");
        ironman.senjata("teknologi senjata dan AI Jarvis");
        ironman.attack("Menembakkan senjata, memukul, dan terbang dengan kecerdasan");
        ironman.defend("Menggunakan teknologi perlindungan dan terbang");
        ironman.display();
    }
}
