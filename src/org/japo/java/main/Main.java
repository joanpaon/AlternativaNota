/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Nombre calificaciones
        final String NOMBRE_NOTA_MD = "Muy deficiente";
        final String NOMBRE_NOTA_IN = "Insuficiente";
        final String NOMBRE_NOTA_SF = "Suficiente";
        final String NOMBRE_NOTA_BN = "Bien";
        final String NOMBRE_NOTA_NT = "Notable";
        final String NOMBRE_NOTA_SB = "Sobresaliente";
        final String NOMBRE_NOTA_NO = "Indefinida";

        // Nombre calificaciones
        final double NUMERO_NOTA_MN = 0.0;
        final double NUMERO_NOTA_IN = 3.0;
        final double NUMERO_NOTA_SF = 5.0;
        final double NUMERO_NOTA_BN = 6.0;
        final double NUMERO_NOTA_NT = 7.0;
        final double NUMERO_NOTA_SB = 9.0;
        final double NUMERO_NOTA_MX = 10.0;

        // Instancia un objeto Scanner
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        scn.useLocale(Locale.ENGLISH);

        try {
            // Introduce el mes a analizar
            System.out.print("Nota numérica ...: ");
            double numeroNota = scn.nextDouble();
            scn.nextLine();

            // Analiza el valor introducido
            String nombreNota;
            if (numeroNota < NUMERO_NOTA_MN) {
                nombreNota = NOMBRE_NOTA_NO;
            } else if (numeroNota < NUMERO_NOTA_IN) {
                nombreNota = NOMBRE_NOTA_MD;
            } else if (numeroNota < NUMERO_NOTA_SF) {
                nombreNota = NOMBRE_NOTA_IN;
            } else if (numeroNota < NUMERO_NOTA_BN) {
                nombreNota = NOMBRE_NOTA_SF;
            } else if (numeroNota < NUMERO_NOTA_NT) {
                nombreNota = NOMBRE_NOTA_BN;
            } else if (numeroNota < NUMERO_NOTA_SB) {
                nombreNota = NOMBRE_NOTA_NT;
            } else if (numeroNota < NUMERO_NOTA_MX) {
                nombreNota = NOMBRE_NOTA_SB;
            } else {
                nombreNota = NOMBRE_NOTA_NO;
            }

            // Muestra el mes equivalente
            System.out.printf("Calificación ....: %s\n", nombreNota);
        } catch (Exception e) {
            System.out.println(">>> Error de entrada");
        }
    }
}
