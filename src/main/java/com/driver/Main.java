package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y){
            return x+y;
        }
        public int product(int x, int y, int z){
            return x+y+z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }
    public static void main(String[] args) {

        Product p = new Product();
        int output;
        output = p.product(1, 2);
        //System.out.println(output);
        int output2;
        output2 = p.product(1, 2, 3);
        //System.out.println(output2);
        double output3;
        output3 = p.product(2.5, 3.5);
        //System.out.println(output3);
    }
}

