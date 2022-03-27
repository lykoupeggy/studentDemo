I created a database at postgreSQL with the name "students", username "postgres" and password "password"


I created a table named students by typing the following on postgres:

CREATE TABLE students (
studentid INT PRIMARY KEY,
firstname VARCHAR(20),
lastname VARCHAR(20),
dateofbirth VARCHAR(10)
);

Then I inserted some rows on the table:

INSERT INTO students (studentid, firstname, lastname, dateofbirth)
VALUES
('1','Panagiota','Lykou','07/09/1998'),
('2','Nikos','Papadopoulos','14/12/1994'),
('3','Kwnstantinos','Skaliwths','18/02/1998'),
('4','Eleni','Trixaki','19/03/1993'),
('5','Irida','Alexiou','18/02/1998')

I checked that all the values inserted by typing:

SELECT * FROM students;








