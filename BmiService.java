public class BmiService {
    public float calculate(float height, float weight) {
        float bodyMassIndex = weight / ((height * height) / 100 / 100);
        return bodyMassIndex;
    }
}
