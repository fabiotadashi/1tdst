package conversao;

import javax.swing.*;

public class ConversaoAplicacao {

    public static void main(String[] args) {

        String byteString = JOptionPane.showInputDialog("Digite um byte");
        byte byteValue = Byte.parseByte(byteString);

        String shortString = JOptionPane.showInputDialog("Digite um short");
        short shortValue = Short.parseShort(shortString);

        String intString = JOptionPane.showInputDialog("Digite um inteiro");
        int intValue = Integer.parseInt(intString);

        String longString = JOptionPane.showInputDialog("Digite um long");
        long longValue = Long.parseLong(longString);

        String floatString = JOptionPane.showInputDialog("Digite um float");
        float floatValue = Float.parseFloat(floatString);

        String doubleString = JOptionPane.showInputDialog("Digite um double");
        double doubleValue = Double.parseDouble(doubleString);

        String booleanString = JOptionPane.showInputDialog("Digite um boolean");
        boolean booleanValue = Boolean.parseBoolean(booleanString);

        JOptionPane.showMessageDialog(null,
                "Byte: "+byteValue+" - Short: "+shortValue +
                        " - Int: "+intValue+ " - Long: "+longValue +
                        " - Float: "+floatValue+" - Double: "+doubleValue +
                        " - Boolean: "+booleanValue
                );
    }

}
