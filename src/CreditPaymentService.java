public class CreditPaymentService {
    public int calculate(int month, int sum, float per) {

        float result;
        float del;
        float det;
        float step;
        float c;
        float coff; // коэффициент аннуитетного платежа, рассчитываемый по формуле

        c = 1 + per;
        step = (float) Math.pow(c, month);
        del = per * step;
        det = step - 1;
        coff = del / det;
        result = coff * sum; // умножение коэффициента на сумму платежа, для выяснения ежемесячного платежа
        return (int) result; // итоговый результат в целочисленном значении
    }


}
