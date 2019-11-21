package com.company;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    //region Getter and Setter


    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    //endregion


    public void calculatePerimeter() {
        int perimeter = this.sideA + this.sideB + this.sideC;
        System.out.println("Perimeter = "+ perimeter);
    }
    public void calculateArea(){
        double halfPerimeter = (this.sideA+this.sideB+this.sideC)/2;
        double area = Math.sqrt(halfPerimeter*(halfPerimeter*this.sideA)*(halfPerimeter-this.sideB)*(halfPerimeter-this.sideC));
        System.out.println("Area = " + area);
    }
    //region Constructor
    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
    }
    //endregion
}
