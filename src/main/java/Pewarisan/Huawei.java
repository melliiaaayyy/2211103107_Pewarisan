package Pewarisan;

class Huawei implements Phone {
    private int volume = 0;
    public void powerOn() {
        System.out.println("Huawei telah menyala");
    }
    public void powerOff() {
        System.out.println("Huawei dimatikan");
    }
    public void volumeUp() {
        volume++;
        System.out.println("Volume Huawei dinaikkan menjadi " + volume);
    }
    public void volumeDown() {
        volume--;
        System.out.println("Volume Huawei diturunkan menjadi " + volume);
    }
    public int getVolume() {
        return volume;
    }
}
