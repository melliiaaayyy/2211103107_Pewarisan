package Pewarisan;

class Vivo implements Phone {
    private int volume = 0;
    public void powerOn() {
        System.out.println("Vivo telah menyala");
    }
    public void powerOff() {
        System.out.println("Vivo dimatikan");
    }
    public void volumeUp() {
        volume++;
        System.out.println("Volume Vivo dinaikkan menjadi " + volume);
    }
    public void volumeDown() {
        volume--;
        System.out.println("Volume Vivo diturunkan menjadi " + volume);
    }
    public int getVolume() {
        return volume;
    }
}