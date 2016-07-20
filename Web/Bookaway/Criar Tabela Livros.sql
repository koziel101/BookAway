CREATE TABLE Livros(
	ID 		int(10) 		NOT NULL	PRIMARY KEY,
	Titulo varchar(80) 		NOT NULL, 
    Coleção varchar(80) 	NOT NULL, 
    Genero varchar(55) 		NOT NULL,
    Autor varchar(80) 		NOT NULL,
    Capa varchar(100) 		NOT NULL
    );