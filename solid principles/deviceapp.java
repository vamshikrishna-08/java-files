interface Device {
    void turnon();
}                            //dip
class bulb implements Device {
    @Override
    public void turnon() {
        System.out.println("bulb on");
    }
}
class fan implements Device {
    @Override
    public void turnon() {
        System.out.println("fan on");
    }
}
class switchButton {
    private final  Device device;
    switchButton(Device device) {
        this.device = device ;
    }
    void press() {
        device.turnon();
    }
}
public class deviceapp {
    public static void main(String[] args) {
        Device bulb = new bulb();
        switchButton switch1 = new switchButton(bulb);
        switch1.press();
        Device fan = new fan();
        switchButton switch2 = new switchButton(fan);
        switch2.press();
    }
}
