package calcproject;

public class Calculator implements CalcMethod {
    private float divres;
    private float no1;
    private float no2;

    public void setNo1(float no1) {
        this.no1 = no1;
    }

    public void setNo2(float no2) {
        this.no2 = no2;
    }

    @Override
    public float add(float no1, float no2) {
        return (float) (no1+no2);
    }

    @Override
    public float subtract(float no1, float no2) {
        return (float) (no1-no2);
    }

    @Override
    public float multiply(float no1, float no2) {
        return (float) (no1*no2);
    }

    @Override
    public float divison(float no1, float no2) {
        if(no1>=no2){
            divres=no1/no2;
        }
        else{
            divres=no2/no1;
        }
        return (float) (divres);
    }
}
