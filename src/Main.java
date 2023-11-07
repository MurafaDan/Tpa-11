public class Main {
    public static void main(String[] args) {
//        1.	Creați o clasă numită CPU  care va avea în ea o clasele Inner Processor și RAM
//        2.	Creați cîte un obiect de tip CPU, Processor, RAM
//        3.	Creați o clasă MotherBoard care va conține în ea o clasa static USB
//        4.	Creați cîte un obiect de tip MotherBoard, USB

Cpu cpuMain = new Cpu();

Cpu.Processor CPU = cpuMain.new Processor();
CPU.getProcessor();

Cpu.Ram RAM = cpuMain.new Ram();
RAM.getRam();

MotherBoard motherBoard = new MotherBoard();
motherBoard.getPrice();
MotherBoard.USB USBGB = new MotherBoard.USB();
USBGB.getUsb();

    }
}
