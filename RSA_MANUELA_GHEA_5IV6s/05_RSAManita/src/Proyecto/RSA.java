package Proyecto;

import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class RSA {

    private int tamprimo;
    private BigInteger p, q, n;
    private BigInteger fi;
    private BigInteger e, d;

    public RSA(int tamprimo) {
        this.tamprimo = tamprimo;
    }

    // Primos
    protected void generarPrimos() {
        p = new BigInteger(tamprimo, 10, new Random());

        do {
            q = new BigInteger(
                    tamprimo, 10, new Random());
        } while (q.compareTo(p) == 0);
    }

    // Llaves
    protected void generarClaves() {
        n = p.multiply(q);

        fi = p.subtract(BigInteger.valueOf(1));

        fi = fi.multiply(q.subtract(BigInteger.valueOf(1)));

        do {
            e = new BigInteger(2 * tamprimo, new Random());
        } while (((e.compareTo(fi)) != 1) || (e.gcd(fi).compareTo(BigInteger.valueOf(1)) != 0));

        d = e.modInverse(fi);
    }

    // Cifrado
    protected BigInteger[] cifrar(String message) {
        int i;
        byte[] temp = new byte[1];
        byte[] digitos = message.getBytes();

        BigInteger[] bigDigitos = new BigInteger[digitos.length];

        for (i = 0; i < bigDigitos.length; i++) {
            temp[0] = digitos[i];
            bigDigitos[i] = new BigInteger(temp);
        }

        BigInteger[] cifrado = new BigInteger[bigDigitos.length];

        for (i = 0; i < bigDigitos.length; i++) {
            cifrado[i] = bigDigitos[i].modPow(e, n);
        }

        return cifrado;

    }

    // Descifrado
    protected String descifrar(BigInteger[] cifrado) {
        int i;
        BigInteger[] descifrado = new BigInteger[cifrado.length];

        for (i = 0; i < descifrado.length; i++) {
            descifrado[i] = cifrado[i].modPow(d, n);
        }

        char[] charArray = new char[descifrado.length];

        for (i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (descifrado[i].intValue());
        }

        return (new String(charArray));
    }
}