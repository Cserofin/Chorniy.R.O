package model;

import java.util.Date;

public class students {
    private Integer recordId;
    private String studentFirstName;
    private String studentLastName;
    private String studentPatronymic;
    private Date studentBirthDate;
    private String contactNumber;

    public students(Integer recordId, String studentFirstName, String studentLastName, String studentPatronymic, Date studentBirthDate, String contactNumber) {
        this.recordId = recordId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentPatronymic = studentPatronymic;
        this.studentBirthDate = studentBirthDate;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Student Record " + recordId + ": {\n" +
                "First Name: " + studentFirstName + "\n" +
                "Last Name: " + studentLastName + "\n" +
                "Patronymic: " + studentPatronymic + "\n" +
                "Birth Date: " + studentBirthDate + "\n" +
                "Contact Number: " + contactNumber + '\n' +
                "}";
    }
}