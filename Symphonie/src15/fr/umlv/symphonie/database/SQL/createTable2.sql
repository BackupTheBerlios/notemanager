CREATE TABLE courses(id_course SERIAL, courselabel VARCHAR(1000), PRIMARY KEY (courselabel));
CREATE TABLE intitulate_course(id_course INTEGER,id_intitulate INTEGER, PRIMARY KEY(id_course,id_intitulate));
CREATE TABLE intitulates(id_intitulate SERIAL, intitulatelabel VARCHAR(1000), coeff INTEGER NOT NULL, PRIMARY KEY (intitulatelabel));
CREATE TABLE notes(id_intitulate INTEGER,id_course INTEGER, id_student INTEGER,note FLOAT, PRIMARY KEY(id_intitulate,id_student,id_course));
CREATE TABLE students(id_student SERIAL, name VARCHAR(1000), firstname VARCHAR(1000) ,comment VARCHAR(2000), PRIMARY KEY (firstname,name));
CREATE TABLE admin(login VARCHAR(10),pwd VARCHAR(10), PRIMARY KEY (login));
