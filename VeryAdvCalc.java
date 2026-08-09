//Multiple inheritance hariarchy in java as AdvCalc inherit Calc and then VeryAdvCalc inherit AdvCalc, so VeryAdvCalc use both Calc and AdvCalc methods.
public class VeryAdvCalc extends AdvCalc {
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}
