package OOPS.ComplexNo;

public class ComplexNumbers {
        // Complete this class
        private int real;
        private int imaginary;
        public ComplexNumbers(int real, int imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }
        public void plus(ComplexNumbers c2) {
            this.real = this.real + c2.real;
            this.imaginary = this.imaginary + c2.imaginary;
        }
        public void multiply(ComplexNumbers c2) {
            int temp = this.real;
            this.real = (this.real * c2.real) - (this.imaginary * c2.imaginary);
            this.imaginary = (temp * c2.imaginary) + (this.imaginary * c2.real);
        }
        public void print() {
            if (imaginary <0) {
                System.out.print(real+ " - " + "i" +imaginary);
            }
            else {
            System.out.print(real+ " + " + "i" +imaginary);
        }
        }
}
