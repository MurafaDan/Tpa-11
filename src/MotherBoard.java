public class MotherBoard {
    private int price = 208;

    public void getPrice(){
        System.out.println("Pretul placii mame este de : "+price+"$");
    }

    static class USB {
        int GB = 64;
        public void getUsb(){
            System.out.println("Stick-ul dvs are "+GB+" GB memorie");
        }
    }
}
