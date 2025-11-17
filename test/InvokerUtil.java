import java.lang.reflect.Method;

/**
 * Sprint 4 : executer dynamiquement la methode trouvee, PUIS verifier
 * si la valeur de retour est une chaine de caracteres (String) ou autre chose.
 * Sujet : "tester si chaine de caractere valeurs de retour / add.print / printwritter"
 */
public class InvokerUtil {
    public static void invoquerEtAfficher(Object instance, Method m) throws Exception {
        Object valeur = m.invoke(instance);
        if (valeur instanceof String) {
            // Equivalent de resp.getWriter().println(value) dans le vrai FrontController
            System.out.println("[PrintWriter simule] " + valeur);
        } else {
            System.out.println("[Valeur non-String, type=" + valeur.getClass().getSimpleName() + "] " + valeur);
        }
    }
}
