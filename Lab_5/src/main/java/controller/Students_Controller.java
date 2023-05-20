package controller;

import model.students;
import controller.DBM_Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Students_Controller {
    private static final Connection dbConnection = DBM_Manager.getDBConnection();

    public static List<students> findStudentsByMonthAndYear(int month, int year) {
        List<students> students = new ArrayList<>();

        try {
            String query = "SELECT * FROM students WHERE EXTRACT(MONTH FROM birth_date) = ? AND EXTRACT(YEAR FROM birth_date) = ?";
            PreparedStatement statement = dbConnection.prepareStatement(query);
            statement.setInt(1, month);
            statement.setInt(2, year);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");
                String patronymic = resultSet.getString("patronymic");
                Date birthDate = resultSet.getDate("birth_date");
                String studentId = resultSet.getString("student_id");

                students.add(new students (
                                id,
                                lastName,
                                firstName,
                                patronymic,
                                birthDate,
                                studentId
                        )
                );
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}