class Circle {
    public static void main(String[] args) {
        double radius=7.5;
        final double PI = 3.14159;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius; // Math.PI is loaded from java.lang package, which is automatically imported in every Java program.
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
        
    }
}
