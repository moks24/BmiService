public class main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bodyMass = 90;
        float height = (float) 1.80;
        float bodyMassIndex = service.calculate(bodyMass, height);
        System.out.println(bodyMassIndex);
    }
}
