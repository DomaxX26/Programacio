package calculadora;

import java.util.Stack;

public class operacionsCalculadora extends Calculadora{
    protected static float primerNumero;
    protected static float segonNumero;
    protected static String operador;

    protected static void casillaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    protected static void casilla0ActionPerformed(java.awt.event.ActionEvent evt) {
        casilla.setText(casilla.getText()+"0");
    }

    protected static void casilla9ActionPerformed(java.awt.event.ActionEvent evt) {
        casilla.setText(casilla.getText()+"9");
    }

    protected static void casilla8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8ActionPerformed
        casilla.setText(casilla.getText()+"8");
    }

    protected static void casilla7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7ActionPerformed
        casilla.setText(casilla.getText()+"7");
    }

    protected static void casilla6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6ActionPerformed
        casilla.setText(casilla.getText()+"6");
    }

    protected static void casilla5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5ActionPerformed
        casilla.setText(casilla.getText()+"5");
    }

    protected static void casilla4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4ActionPerformed
        casilla.setText(casilla.getText()+"4");
    }

    protected static void casilla3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3ActionPerformed
        casilla.setText(casilla.getText()+"3");
    }

    protected static void casilla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2ActionPerformed
        casilla.setText(casilla.getText()+"2");
    }

    protected static void casilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1ActionPerformed
        casilla.setText(casilla.getText()+"1");
    }

    protected static void igualActionPerformed(java.awt.event.ActionEvent evt) {
        String str = casilla.getText();
        casilla.setText(str);


        casilla.setText(llevarCero(evaluar(str)));
    }

    protected static void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed
        primerNumero = Float.parseFloat(casilla.getText());
        operador =  "+";
        casilla.setText("");
    }

    protected static void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
        primerNumero = Float.parseFloat(casilla.getText());
        operador =  "-";
        casilla.setText("");
    }

    protected static void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        primerNumero = Float.parseFloat(casilla.getText());
        operador =  "x";
        casilla.setText("");
    }
    protected static void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        primerNumero = Float.parseFloat(casilla.getText());
        operador =  "/";
        casilla.setText("");
    }

    protected static void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        casilla.setText("");
    }

    protected static void puntoActionPerformed(java.awt.event.ActionEvent evt) {
        if (!(casilla.getText().contains("."))){
            casilla.setText(casilla.getText() + ".");
        }
    }

    protected static String llevarCero(float resultat){
        String retorna = "";
        retorna = Float.toString(resultat);

        if(resultat % 1 == 0){
            retorna = retorna.substring(0, retorna.length()-2);
        }
        return retorna;
    }
    public static boolean ordrePreferencia(char pre1, char pre2){
        if (pre2 == '(' || pre2 == ')'){
            return false;
        }
        if ((pre1 == '*' || pre1 == '/') && (pre2 == '+' || pre2 == '-')){
            return false;
        }
        else {
            return true;
        }
    }

    public static float aplicarOperacio (char operador, float num1, float num2){
        switch(operador){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '/':
                return num1 / num2;
            case 'x':
                return num1 * num2;
        }
        return 0;
    }

    public static float evaluar (String expressio) {
        char[] caracters = expressio.toCharArray();


        Stack<Character> operadors = new Stack<Character>();

        Stack<Float> valors = new Stack<Float>();


        for(int i = 0; i < caracters.length; i++){


            if(caracters[i] == ' ') {
                continue;
            }

            if(caracters[i] >= '0' && caracters[i] <= '9'){
                StringBuffer sbuf = new StringBuffer();


                while(i < caracters.length && caracters[i] >= '0' && caracters[i] <= '9')
                    sbuf.append(caracters[i++]);
                valors.push(Float.parseFloat(sbuf.toString()));

                i--;
            }

            else if(caracters[i] == '(')
                operadors.push(caracters[i]);

            else if(caracters[i] == ')'){
                while(operadors.peek() != '(')
                    valors.push(aplicarOperacio(operadors.pop(), valors.pop(), valors.pop()));
                operadors.pop();
            }

            else if(caracters[i] == '+' || caracters[i] == '-' || caracters[i] == '*' || caracters[i] == '/') {
                while (!operadors.empty() && ordrePreferencia(caracters[i], operadors.peek()))
                    valors.push(aplicarOperacio(operadors.pop(), valors.pop(), valors.pop()));
                operadors.push(caracters[i]);
            }
        }

        // aplicar les operacions restants als valors restants
        while (!operadors.empty())
            valors.push(aplicarOperacio(operadors.pop(), valors.pop(), valors.pop()));

        return valors.pop();
    }
}
