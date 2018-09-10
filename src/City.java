public class City {
    String name;
    private int size;
    private boolean isCapital;
    private boolean hasMetro;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public boolean isCapital() {
        return isCapital;
    }

    private void setCapital(boolean capital) {
        isCapital = capital;
    }

    public boolean isHasMetro() {
        return hasMetro;
    }

    private void setHasMetro(boolean hasMetro) {
        this.hasMetro = hasMetro;
    }

    public City(String name) {
        this.name = name;
    }

    public City(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public City(String name, int size, boolean isCapital) {
        this.name = name;
        this.size = size;
        this.isCapital = isCapital;
    }

    public City(String name, int size, boolean isCapital, boolean hasMetro) {
        this.name = name;
        this.size = size;
        this.isCapital = isCapital;
        this.hasMetro = hasMetro;
    }

    public void cityInfo() {
        System.out.println("Name: " + this.name + " Size: " + this.size + " Is it capital?: " + this.isCapital + " Has it metro?: " + this.hasMetro);
    }
}
