CREATE TABLE students (
  id INT PRIMARY KEY AUTO_INCREMENT,
  last_name VARCHAR(50),
  first_name VARCHAR(50),
  middle_name VARCHAR(50),
  birth_date DATE,
  student_id VARCHAR(20)
);

insert into students values (1, 'Thompson', 'Oliver', 'William', '2003-07-04', '123456789')
insert into students values (2, 'Parker', 'Emma', 'Grace', '2003-01-15', '987654321')
insert into students values (3, 'Reynolds', 'Ethan', 'Alexander', '2003-09-15', '516372846')
insert into students values (4, 'Jenkins', 'Sophia', 'Rose', '2003-07-12', '123456789')
insert into students values (5, 'Collins', 'Liam', 'Matthew', '2003-10-12', '000000000')
