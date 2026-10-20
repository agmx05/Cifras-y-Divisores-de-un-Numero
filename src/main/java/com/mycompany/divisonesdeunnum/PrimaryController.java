package com.mycompany.divisonesdeunnum;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML TextField txtnumero;

    @FXML Label lbl0;
    @FXML Label lbl1;
    @FXML Label lbl2;
    @FXML Label lbl3;
    @FXML Label lbl4;
    @FXML Label lbl5;
    @FXML Label lbl6;

    @FXML
    private void btnAnalizar_click() {

        int numero, cantidad, cifra, sumaImpares = 0, sumaPares = 0;

        numero = Integer.parseInt(txtnumero.getText());

        // Obtener la cantidad de cifras
        cantidad = String.valueOf(numero).length();

        // Convertir el número en positivo
        int auxiliar = numero;
        if (auxiliar < 0) {
            auxiliar = auxiliar * -1;
        }

        int mayor = 0;
        int menor = 9;

        do {
            cifra = auxiliar % 10;

            if (cifra % 2 == 0) {
                sumaPares = sumaPares + cifra;
            } else {
                sumaImpares = sumaImpares + cifra;
            }

            if (cifra > mayor) {
                mayor = cifra;
            }

            if (cifra < menor) {
                menor = cifra;
            }

            auxiliar = auxiliar / 10;

        } while (auxiliar > 0);

        lbl1.setText("Cantidad de cifras: " + cantidad);
        lbl2.setText("Suma de cifras impares: " + sumaImpares);
        lbl3.setText("Suma de cifras pares: " + sumaPares);
        lbl4.setText("Suma total de cifras: " + (sumaImpares + sumaPares));
        lbl5.setText("Cifra mayor: " + mayor);
        lbl6.setText("Cifra menor: " + menor);

        // Obtener los divisores del número
        String divisores = "";
        int positivo = numero;
        if (positivo < 0) {
            positivo = positivo * -1;
        }
        
            for (int i = 1; i <= positivo; i++) {
                if (positivo % i == 0) {
                    divisores = divisores + i + " ";
                }
            }
      
        lbl0.setText("Divisores: " + divisores);
    }

    @FXML
    private void btnLimpiar_click() {

        txtnumero.clear();

        lbl0.setText("Divisores del número");
        lbl1.setText("Cantidad de cifras");
        lbl2.setText("Suma de cifras impares");
        lbl3.setText("Suma de cifras pares");
        lbl4.setText("Suma total de cifras");
        lbl5.setText("Cifra mayor");
        lbl6.setText("Cifra menor");
    }
}
