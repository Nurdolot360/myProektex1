public class Car implements Kali{
    private String morka;
    private String mopdel;

    private String color;

    private String wheel;

    private String salon;

    private String colorSalon;

    private String discs;
    private String nomber;

    public Car() {
    }

    public Car(String morka, String mopdel, String color, String wheel, String salon, String colorSalon, String discs ,
               String nomber
    ) {
        this.morka = morka;
        this.mopdel = mopdel;
        this.color = color;
        this.wheel = wheel;
        this.salon = salon;
        this.colorSalon = colorSalon;
        this.discs = discs;
        this.nomber = nomber;
    }

    public String getMorka() {
        return morka;
    }

    public void setMorka(String morka) {
        this.morka = morka;
    }

    public String getMopdel() {
        return mopdel;
    }

    public void setMopdel(String mopdel) {
        this.mopdel = mopdel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getColorSalon() {
        return colorSalon;
    }

    public void setColorSalon(String colorSalon) {
        this.colorSalon = colorSalon;
    }

    public String getDiscs() {
        return discs;
    }

    public String getNomber() {
        return nomber;
    }

    public void setNomber(String nomber) {
        this.nomber = nomber;
    }

    public void setDiscs(String discs) {
        this.discs = discs;
    }
    public void Caros(){
        if (this.morka.equals("Mersedes bens")) {
            System.out.println("Dalshe");
        }else
            System.out.println("у нас Mersedes компания  ");
    }

    @Override
    public void Compania() {
        System.out.println("Companie Mersedes");
    }
}