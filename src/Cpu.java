public class Cpu {
    public class Processor{
        private int gen = 13;
        public void getProcessor(){
            System.out.println("Procesorul dvs este de generatia:" + gen);

        }
    }
    public class Ram {
        private int ram = 16;
        public void getRam(){
            System.out.println("Calculatorul are "+ram+" memorie Ram");
        }
    }
}
