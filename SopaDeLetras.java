package edu.fje.dam2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Classe que hereta de la classe Activity
 * Utilitza un layout XML per a definir la interfície amb diversos ginys
 * i un layout de tipus TableLayout.
 * @author sergi.grau@fje.edu
 * @version 1.0, 18/11/2012
 * @version 2.0, 1/10/2020, actualització a API.30
 */
public class SopaDeLetras extends AppCompatActivity{

    Button a1, a2, a3, a4, a5, a6, a7, a8, a9,
            b1, b2, b3, b4, b5, b6, b7, b8, b9,
            c1, c2, c3, c4, c5, c6, c7, c8, c9,
            d1, d2, d3, d4, d5, d6, d7, d8, d9,
            e1, e2, e3, e4, e5, e6, e7, e8, e9,
            f1, f2, f3, f4, f5, f6, f7, f8, f9,
            g1, g2, g3, g4, g5, g6, g7, g8, g9,
            h1, h2, h3, h4, h5, h6, h7, h8, h9,
            i1, i2, i3, i4, i5, i6, i7, i8, i9,
            randomH, randomV;
    Button [] arrayBotonesHorizontal = new Button[81];
    Button [] arrayBotonesVertical = new Button[81];
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.sopadeletras);
        arrayButtons();
        //letrashorizontal2();
        //letrasvertical2();
        //letrashorizontal();
        //letrasvertical();
        rellenar();
    }

    private void letrashorizontal2() {
        String palabra = "CABRAS";
        int nAleat = 10 - palabra.length();
        Random random = new Random();
        int randomInt = random.nextInt(nAleat) + 9* random.nextInt(9);
        int n = 0;

        for (int i = randomInt; i < randomInt+palabra.length(); i ++){
            arrayBotonesHorizontal[i].setText(String.valueOf(palabra.charAt(n++)));
            arrayBotonesHorizontal[i].setOnClickListener(this::botonVerde);

        }
    }
    private void letrasvertical2() {
        String palabra = "CABRAS";
        int nAleat = 10 - palabra.length();
        Random random = new Random();
        int randomInt = random.nextInt(nAleat) + 9* random.nextInt(9);
        int n = 0;

        for (int i = randomInt; i < randomInt+palabra.length(); i ++){
            arrayBotonesVertical[i].setText(String.valueOf(palabra.charAt(n++)));
            arrayBotonesVertical[i].setOnClickListener(this::botonVerde);

        }
    }

    public void letrashorizontal(){
        String palabra = "OREJA";
        for (int i = 0; i <5; i ++){
            arrayBotonesHorizontal[i].setText(String.valueOf(palabra.charAt(i)));
            arrayBotonesHorizontal[i].setOnClickListener(this::botonVerde);
        }
    }
    public void letrasvertical(){
        String palabra = "OREJA";
        for (int i = 0; i <5; i += 9){
            arrayBotonesHorizontal[i].setText(String.valueOf(palabra.charAt(i)));
            arrayBotonesHorizontal[i].setOnClickListener(this::botonVerde);
        }
    }

    public String RandomChar(){
        Random random = new Random();

        String setOfCharacters = "ABCDEFGHIJKLMNÑOPQRSTUVXYZ";
        int randomInt = random.nextInt(setOfCharacters.length());
        String randomChar = String.valueOf(setOfCharacters.charAt(randomInt));
        return randomChar;
    }

    public void rellenar(){
        for(int i = 0; i < arrayBotonesHorizontal.length; ++i) {
            if(arrayBotonesHorizontal[i].getText() == ""){
                arrayBotonesHorizontal[i].setText(RandomChar());
                arrayBotonesHorizontal[i].setOnClickListener(this::botonRojo);
            }

        }
    }
    public void vaciar(){
        for(int i = 0; i < arrayBotonesHorizontal.length; ++i) {
            arrayBotonesHorizontal[i].setText("");
            arrayBotonesHorizontal[i].setOnClickListener(this::botonNada);
            arrayBotonesHorizontal[i].setBackgroundColor(Color.parseColor("#787c7f"));
            }
    }
    public void arrayButtons(){
        a1 = findViewById(R.id.a1);arrayBotonesHorizontal[0] = a1;arrayBotonesVertical [0] = a1;
        a2 = findViewById(R.id.a2);arrayBotonesHorizontal[1] = a2;arrayBotonesVertical [9] = a2;
        a3 = findViewById(R.id.a3);arrayBotonesHorizontal[2] = a3;arrayBotonesVertical [18] = a3;
        a4 = findViewById(R.id.a4);arrayBotonesHorizontal[3] = a4;arrayBotonesVertical [27] = a4;
        a5 = findViewById(R.id.a5);arrayBotonesHorizontal[4] = a5;arrayBotonesVertical [36] = a5;
        a6 = findViewById(R.id.a6);arrayBotonesHorizontal[5] = a6;arrayBotonesVertical [45] = a6;
        a7 = findViewById(R.id.a7);arrayBotonesHorizontal[6] = a7;arrayBotonesVertical [54] = a7;
        a8 = findViewById(R.id.a8);arrayBotonesHorizontal[7] = a8;arrayBotonesVertical [63] = a8;
        a9 = findViewById(R.id.a9);arrayBotonesHorizontal[8] = a9;arrayBotonesVertical [72] = a9;
        b1 = findViewById(R.id.b1);arrayBotonesHorizontal[9] = b1;arrayBotonesVertical [1] = b1;
        b2 = findViewById(R.id.b2);arrayBotonesHorizontal[10] = b2;arrayBotonesVertical [10] = b2;
        b3 = findViewById(R.id.b3);arrayBotonesHorizontal[11] = b3;arrayBotonesVertical [19] = b3;
        b4 = findViewById(R.id.b4);arrayBotonesHorizontal[12] = b4;arrayBotonesVertical [28] = b4;
        b5 = findViewById(R.id.b5);arrayBotonesHorizontal[13] = b5;arrayBotonesVertical [37] = b5;
        b6 = findViewById(R.id.b6);arrayBotonesHorizontal[14] = b6;arrayBotonesVertical [46] = b6;
        b7 = findViewById(R.id.b7);arrayBotonesHorizontal[15] = b7;arrayBotonesVertical [55] = b7;
        b8 = findViewById(R.id.b8);arrayBotonesHorizontal[16] = b8;arrayBotonesVertical [64] = b8;
        b9 = findViewById(R.id.b9);arrayBotonesHorizontal[17] = b9;arrayBotonesVertical [73] = b9;
        c1 = findViewById(R.id.c1);arrayBotonesHorizontal[18] = c1;arrayBotonesVertical [2] = c1;
        c2 = findViewById(R.id.c2);arrayBotonesHorizontal[19] = c2;arrayBotonesVertical [11] = c2;
        c3 = findViewById(R.id.c3);arrayBotonesHorizontal[20] = c3;arrayBotonesVertical [20] = c3;
        c4 = findViewById(R.id.c4);arrayBotonesHorizontal[21] = c4;arrayBotonesVertical [29] = c4;
        c5 = findViewById(R.id.c5);arrayBotonesHorizontal[22] = c5;arrayBotonesVertical [38] = c5;
        c6 = findViewById(R.id.c6);arrayBotonesHorizontal[23] = c6;arrayBotonesVertical [47] = c6;
        c7 = findViewById(R.id.c7);arrayBotonesHorizontal[24] = c7;arrayBotonesVertical [56] = c7;
        c8 = findViewById(R.id.c8);arrayBotonesHorizontal[25] = c8;arrayBotonesVertical [65] = c8;
        c9 = findViewById(R.id.c9);arrayBotonesHorizontal[26] = c9;arrayBotonesVertical [74] = c9;
        d1 = findViewById(R.id.d1);arrayBotonesHorizontal[27] = d1;arrayBotonesVertical [3] = d1;
        d2 = findViewById(R.id.d2);arrayBotonesHorizontal[28] = d2;arrayBotonesVertical [12] = d2;
        d3 = findViewById(R.id.d3);arrayBotonesHorizontal[29] = d3;arrayBotonesVertical [21] = d3;
        d4 = findViewById(R.id.d4);arrayBotonesHorizontal[30] = d4;arrayBotonesVertical [30] = d4;
        d5 = findViewById(R.id.d5);arrayBotonesHorizontal[31] = d5;arrayBotonesVertical [39] = d5;
        d6 = findViewById(R.id.d6);arrayBotonesHorizontal[32] = d6;arrayBotonesVertical [48] = d6;
        d7 = findViewById(R.id.d7);arrayBotonesHorizontal[33] = d7;arrayBotonesVertical [57] = d7;
        d8 = findViewById(R.id.d8);arrayBotonesHorizontal[34] = d8;arrayBotonesVertical [66] = d8;
        d9 = findViewById(R.id.d9);arrayBotonesHorizontal[35] = d9;arrayBotonesVertical [75] = d9;
        e1 = findViewById(R.id.e1);arrayBotonesHorizontal[36] = e1;arrayBotonesVertical [4] = e1;
        e2 = findViewById(R.id.e2);arrayBotonesHorizontal[37] = e2;arrayBotonesVertical [13] = e2;
        e3 = findViewById(R.id.e3);arrayBotonesHorizontal[38] = e3;arrayBotonesVertical [22] = e3;
        e4 = findViewById(R.id.e4);arrayBotonesHorizontal[39] = e4;arrayBotonesVertical [31] = e4;
        e5 = findViewById(R.id.e5);arrayBotonesHorizontal[40] = e5;arrayBotonesVertical [40] = e5;
        e6 = findViewById(R.id.e6);arrayBotonesHorizontal[41] = e6;arrayBotonesVertical [49] = e6;
        e7 = findViewById(R.id.e7);arrayBotonesHorizontal[42] = e7;arrayBotonesVertical [58] = e7;
        e8 = findViewById(R.id.e8);arrayBotonesHorizontal[43] = e8;arrayBotonesVertical [67] = e8;
        e9 = findViewById(R.id.e9);arrayBotonesHorizontal[44] = e9;arrayBotonesVertical [76] = e9;
        f1 = findViewById(R.id.f1);arrayBotonesHorizontal[45] = f1;arrayBotonesVertical [5] = f1;
        f2 = findViewById(R.id.f2);arrayBotonesHorizontal[46] = f2;arrayBotonesVertical [14] = f2;
        f3 = findViewById(R.id.f3);arrayBotonesHorizontal[47] = f3;arrayBotonesVertical [23] = f3;
        f4 = findViewById(R.id.f4);arrayBotonesHorizontal[48] = f4;arrayBotonesVertical [32] = f4;
        f5 = findViewById(R.id.f5);arrayBotonesHorizontal[49] = f5;arrayBotonesVertical [41] = f5;
        f6 = findViewById(R.id.f6);arrayBotonesHorizontal[50] = f6;arrayBotonesVertical [50] = f6;
        f7 = findViewById(R.id.f7);arrayBotonesHorizontal[51] = f7;arrayBotonesVertical [59] = f7;
        f8 = findViewById(R.id.f8);arrayBotonesHorizontal[52] = f8;arrayBotonesVertical [68] = f8;
        f9 = findViewById(R.id.f9);arrayBotonesHorizontal[53] = f9;arrayBotonesVertical [77] = f9;
        g1 = findViewById(R.id.g1);arrayBotonesHorizontal[54] = g1;arrayBotonesVertical [6] = g1;
        g2 = findViewById(R.id.g2);arrayBotonesHorizontal[55] = g2;arrayBotonesVertical [15] = g2;
        g3 = findViewById(R.id.g3);arrayBotonesHorizontal[56] = g3;arrayBotonesVertical [24] = g3;
        g4 = findViewById(R.id.g4);arrayBotonesHorizontal[57] = g4;arrayBotonesVertical [33] = g4;
        g5 = findViewById(R.id.g5);arrayBotonesHorizontal[58] = g5;arrayBotonesVertical [42] = g5;
        g6 = findViewById(R.id.g6);arrayBotonesHorizontal[59] = g6;arrayBotonesVertical [51] = g6;
        g7 = findViewById(R.id.g7);arrayBotonesHorizontal[60] = g7;arrayBotonesVertical [60] = g7;
        g8 = findViewById(R.id.g8);arrayBotonesHorizontal[61] = g8;arrayBotonesVertical [69] = g8;
        g9 = findViewById(R.id.g9);arrayBotonesHorizontal[62] = g9;arrayBotonesVertical [78] = g9;
        h1 = findViewById(R.id.h1);arrayBotonesHorizontal[63] = h1;arrayBotonesVertical [7] = h1;
        h2 = findViewById(R.id.h2);arrayBotonesHorizontal[64] = h2;arrayBotonesVertical [16] = h2;
        h3 = findViewById(R.id.h3);arrayBotonesHorizontal[65] = h3;arrayBotonesVertical [25] = h3;
        h4 = findViewById(R.id.h4);arrayBotonesHorizontal[66] = h4;arrayBotonesVertical [34] = h4;
        h5 = findViewById(R.id.h5);arrayBotonesHorizontal[67] = h5;arrayBotonesVertical [43] = h5;
        h6 = findViewById(R.id.h6);arrayBotonesHorizontal[68] = h6;arrayBotonesVertical [52] = h6;
        h7 = findViewById(R.id.h7);arrayBotonesHorizontal[69] = h7;arrayBotonesVertical [61] = h7;
        h8 = findViewById(R.id.h8);arrayBotonesHorizontal[70] = h8;arrayBotonesVertical [70] = h8;
        h9 = findViewById(R.id.h9);arrayBotonesHorizontal[71] = h9;arrayBotonesVertical [79] = h9;
        i1 = findViewById(R.id.i1);arrayBotonesHorizontal[72] = i1;arrayBotonesVertical [8] = i1;
        i2 = findViewById(R.id.i2);arrayBotonesHorizontal[73] = i2;arrayBotonesVertical [17] = i2;
        i3 = findViewById(R.id.i3);arrayBotonesHorizontal[74] = i3;arrayBotonesVertical [26] = i3;
        i4 = findViewById(R.id.i4);arrayBotonesHorizontal[75] = i4;arrayBotonesVertical [35] = i4;
        i5 = findViewById(R.id.i5);arrayBotonesHorizontal[76] = i5;arrayBotonesVertical [44] = i5;
        i6 = findViewById(R.id.i6);arrayBotonesHorizontal[77] = i6;arrayBotonesVertical [53] = i6;
        i7 = findViewById(R.id.i7);arrayBotonesHorizontal[78] = i7;arrayBotonesVertical [62] = i7;
        i8 = findViewById(R.id.i8);arrayBotonesHorizontal[79] = i8;arrayBotonesVertical [71] = i8;
        i9 = findViewById(R.id.i9);arrayBotonesHorizontal[80] = i9;arrayBotonesVertical [80] = i9;
        randomH = findViewById(R.id.randomH);randomH.setOnClickListener(this::randomH);
        randomV = findViewById(R.id.randomV);randomV.setOnClickListener(this::randomV);

    }

    public void botonVerde(View view) {

        view.setBackgroundColor(Color.parseColor("#43a047"));

    }
    public void botonRojo(View view) {

        view.setBackgroundColor(Color.parseColor("#e8656a"));

    }
    public void botonNada(View view) {

    }

    public void randomV(View view) {
        vaciar();
        letrasvertical2();
        rellenar();
    }
    public void randomH(View view) {
        vaciar();
        letrashorizontal2();
        rellenar();
    }
}
