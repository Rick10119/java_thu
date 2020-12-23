// Example for PPT page No.8 and No.19

public class Student {
    /**
     * 学生类数据域
     */
    String name;
    String majorIn;
    char gender;

    /**
     * 学生对象构造方法
     */
    Student() {
    }

    Student(String name_i, String majorIn_i, char gender_i) {
        name = name_i;
        majorIn = majorIn_i;
        gender = gender_i;
    }

    /**
     * 获取学生性别方法
     */
    char getGender() {
        return gender;
    }
}