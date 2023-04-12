package com.driver;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        Product p = new Product();
        int output;
        output = p.product(x, y);
        //System.out.println(output);
        int output2;
        output2 = p.product(x, y, z);
        //System.out.println(output2);
        double output3;
        output3 = p.product(x, y);
        //System.out.println(output3);
    }

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

}

