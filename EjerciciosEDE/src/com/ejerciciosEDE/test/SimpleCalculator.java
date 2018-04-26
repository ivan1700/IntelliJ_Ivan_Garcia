package com.ejerciciosEDE.test;

import java.util.ArrayList;
import java.util.List;

public class SimpleCalculator {
    /**
     * n1 + n2.
     *
     * @param n1 First number.
     * @param n2 Second number.
     * @return n1 + n2.
     */
    public float add(float n1, float n2) {
        return n1 + n2;
    }
    /**
     * n1 - n2.
     *
     * @param n1 First number.
     * @param n2 Second number.
     * @return n1 - n2.
     */
    public float subtract(float n1, float n2) {
        return n1 - n2;
    }
    /**
     * n1 * n2.
     *
     * @param n1 First number.
     * @param n2 Second number.
     * @return n1 * n2.
     */
    public float multiply(float n1, float n2) {
        return n1 * n2;
    }
    /**
     * n1 / n2.
     *
     * @param n1 First number.
     * @param n2 Second number (divisor).
     * @return n1 / n2.
     * @throws ArithmeticException If the divisor is 0.
     */
    public float divide(float n1, float n2) throws ArithmeticException {
        if ((int)n2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return n1 / n2;
    }

    public boolean isEvenNumber(int number){

        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }

    public String povOf2(int exp) {
        if (exp == 0)
            return "1";

        List<Integer> digits = new ArrayList<Integer>();
        digits.add(1);
        int size = 1;
        int tmp;
        int ac = 0;

        for (int i = 0; i < exp; i++) {

            for (int c = 0; c < size; c++) {
                tmp = digits.get(c);
                tmp *= 2;
                tmp += ac;

                if (tmp > 9) {
                    tmp -= 10;
                    ac = 1;
                } else {
                    ac = 0;
                }
                digits.set(c, tmp);

            }
            if (ac == 1) {
                digits.add(ac);
                size++;
                ac = 0;
            }

        }

        String s = "";
        for (int i = digits.size()-1; i >= 0; i--) {
            s += digits.get(i);
        }
        return s;
    }

}