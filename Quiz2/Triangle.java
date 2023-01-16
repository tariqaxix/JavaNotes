package Quiz2;

import Quiz2.TriangleException;

class Triangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    Triangle(double firstSide, double secondSide, double thirdSide) throws TriangleException {

        this.firstSide=firstSide;
        this.secondSide=secondSide;
        this.thirdSide=thirdSide;
    }

    boolean isEquilateral() {
        return this.firstSide==this.secondSide && this.secondSide==this.thirdSide;
    }

    boolean isIsosceles() {
        return firstSide==secondSide || firstSide==thirdSide || thirdSide==secondSide;
    }

    boolean isScalene() {
        return firstSide != secondSide && firstSide !=thirdSide && secondSide != thirdSide;
    }

}