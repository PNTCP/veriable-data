public class VariableDemo {

    public static void main(String[] args) {

        // ตัวแปรชนิดจำนวนเต็ม
        int age = 20;
        long population = 7000000000L;

        // ตัวแปรชนิดเลขทศนิยม
        float height = 170.5f;
        double weight = 60.75;

        // ตัวแปรชนิดตัวอักษร
        char grade = 'A';

        // ตัวแปรชนิดตรรกะ
        boolean isStudent = true;

        // ตัวแปรชนิดข้อความ
        String name = "สมชาย";

        // แสดงผลค่าตัวแปร
        System.out.println("ชื่อ: " + name);
        System.out.println("อายุ: " + age);
        System.out.println("ส่วนสูง: " + height);
        System.out.println("น้ำหนัก: " + weight);
        System.out.println("เกรด: " + grade);
        System.out.println("เป็นนักเรียนหรือไม่: " + isStudent);
        System.out.println("จำนวนประชากรโลก: " + population);
    }
}
