import java.lang.reflect.Method;

public class TestSprint4 {
    public static class MonControleur {
        public String methodeString() {
            return "Je suis la valeur de retour de la methode";
        }
        public int methodeInt() {
            return 42;
        }
    }

    public static void main(String[] args) throws Exception {
        MonControleur ctrl = new MonControleur();

        Method m1 = ctrl.getClass().getMethod("methodeString");
        Method m2 = ctrl.getClass().getMethod("methodeInt");

        InvokerUtil.invoquerEtAfficher(ctrl, m1);
        InvokerUtil.invoquerEtAfficher(ctrl, m2);
    }
}
