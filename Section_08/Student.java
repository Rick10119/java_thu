// Example for PPT page No.8 and No.19

public class Student {
    /**
     * ѧ����������
     */
    String name;
    String majorIn;
    char gender;

    /**
     * ѧ�������췽��
     */
    Student() {
    }

    Student(String name_i, String majorIn_i, char gender_i) {
        name = name_i;
        majorIn = majorIn_i;
        gender = gender_i;
    }

    /**
     * ��ȡѧ���Ա𷽷�
     */
    char getGender() {
        return gender;
    }
}