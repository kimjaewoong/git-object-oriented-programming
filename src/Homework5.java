class Computer {
    private String cpu = "Core i7";
    private String memory = "16GB";
    private String hd = "2TB";
    private String color = "White";
    private String power = "500W";

    public void turnOn() {
        System.out.println("Truning on the computer");
    }
    public void pritninfo1() {
        System.out.println("The spec of the computer"
                +"\n\tCPU : " + cpu
                +"\n\tMemory : " + memory
                +"\n\tHDD : " + hd
                +"\n\tColor : " + color
                +"\n\tPower : " + power);
    }
}
class Monitor {
    private String size = "24inch";
    private String color = "Black";
    private String power = "45W";

    public void turnOn() {
        System.out.println("Turning on the monitor");
    }
    public void pritninfo2() {
        System.out.println("The spec of the monitor"
                +"\n\tSize : " + size
                +"\n\tColor : " + color
                +"\n\tPower : " + power);
    }
}
class PC {
    public Computer compu = new Computer();
    public Monitor moni = new Monitor();
}
public class Homework5 {
    public static void main(String[] args) {
    PC myPC = new PC();
    myPC.compu.turnOn();
    myPC.moni.turnOn();
    myPC.compu.pritninfo1();
    myPC.moni.pritninfo2();
    }
}
