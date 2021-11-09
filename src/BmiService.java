public class BmiService {
    public float calculate (float bodyMass, float height){
        float BodyMassIndex = bodyMass/(height * height);
        return BodyMassIndex;
    }
}
