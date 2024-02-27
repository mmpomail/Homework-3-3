public class CreditPaymentService {
    public int calculate(int month, int sum, float per) {

        float result;

        float c = 1 + per;
        float step = (float) Math.pow(c, month);
        float del = per * step;
        float det = step - 1;
        float coff = del / det; // коэффициент аннуитетного платежа, рассчитываемый по формуле
        result = coff * sum; // умножение коэффициента на сумму платежа, для выяснения ежемесячного платежа
        return (int) result; // итоговый результат в целочисленном значении

    }
}
