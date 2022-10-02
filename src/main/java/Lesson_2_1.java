public class Lesson_2_1 {
    /**
     * Задания урока 2.1
     *
     *
      * @param args
     */

    public static void main(String[] args) {

    }

    public static int leapYearCount(int year) {
        /**
         * Задание: Реализуйте метод, вычисляющий количество високосных лет с начала эры до заданного года включительно
         */
        return (year/4 - year/100 + year/400);
    }
}
