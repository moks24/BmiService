public class BmiService {
    public float calculate (float bodyMass, float height){
        float bodyMassIndex = bodyMass/(height * height);
        return bodyMassIndex;
    }
}
