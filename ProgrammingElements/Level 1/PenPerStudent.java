public class PenPerStudent{
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int each = pens / students;
        int remaining = pens % students;
        System.out.println("The Pen Per Student is " + each + " and the remaining pen not distributed is " + remaining);
    }
}
