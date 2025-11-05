-- Inserir Gêneros
INSERT INTO genero (nome) VALUES ('Ação');
INSERT INTO genero (nome) VALUES ('Aventura');
INSERT INTO genero (nome) VALUES ('Comédia');
INSERT INTO genero (nome) VALUES ('Drama');
INSERT INTO genero (nome) VALUES ('Terror');
INSERT INTO genero (nome) VALUES ('Ficção Científica');
INSERT INTO genero (nome) VALUES ('Romance');
INSERT INTO genero (nome) VALUES ('Suspense');
INSERT INTO genero (nome) VALUES ('Animação');
INSERT INTO genero (nome) VALUES ('Documentário');
INSERT INTO genero (nome) VALUES ('Musical');
INSERT INTO genero (nome) VALUES ('Fantasia');

-- Inserir Diretores
INSERT INTO diretor (nome, nacionalidade) VALUES ('Steven Spielberg', 'Americano');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Christopher Nolan', 'Britânico');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Quentin Tarantino', 'Americano');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Martin Scorsese', 'Americano');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Alfred Hitchcock', 'Britânico');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Stanley Kubrick', 'Americano');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Francis Ford Coppola', 'Americano');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Ridley Scott', 'Britânico');
INSERT INTO diretor (nome, nacionalidade) VALUES ('James Cameron', 'Canadense');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Peter Jackson', 'Neozelandês');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Denis Villeneuve', 'Canadense');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Greta Gerwig', 'Americano');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Bong Joon-ho', 'Sul-coreano');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Guillermo del Toro', 'Mexicano');
INSERT INTO diretor (nome, nacionalidade) VALUES ('Akira Kurosawa', 'Japonês');

-- Inserir Filmes
-- Steven Spielberg
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('E.T. - O Extraterrestre', '1982-06-11', 7.9, 1, 6);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Jurassic Park', '1993-06-11', 8.2, 1, 2);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('A Lista de Schindler', '1993-11-30', 9.0, 1, 4);

-- Christopher Nolan
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('A Origem', '2010-07-16', 8.8, 2, 6);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Interestelar', '2014-11-07', 8.7, 2, 6);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('O Cavaleiro das Trevas', '2008-07-18', 9.0, 2, 1);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Dunkirk', '2017-07-21', 7.8, 2, 4);

-- Quentin Tarantino
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Pulp Fiction', '1994-10-14', 8.9, 3, 4);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Django Livre', '2012-12-25', 8.5, 3, 1);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Kill Bill Vol. 1', '2003-10-10', 8.2, 3, 1);

-- Martin Scorsese
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Taxi Driver', '1976-02-08', 8.2, 4, 4);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Os Infiltrados', '2006-10-06', 8.5, 4, 8);

-- Alfred Hitchcock
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Psicose', '1960-06-16', 8.5, 5, 8);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Janela Indiscreta', '1954-08-01', 8.5, 5, 8);

-- Stanley Kubrick
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('O Iluminado', '1980-05-23', 8.4, 6, 5);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('2001: Uma Odisseia no Espaço', '1968-04-02', 8.3, 6, 6);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Laranja Mecânica', '1971-12-19', 8.3, 6, 6);

-- Francis Ford Coppola
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('O Poderoso Chefão', '1972-03-24', 9.2, 7, 4);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('O Poderoso Chefão II', '1974-12-20', 9.0, 7, 4);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Apocalipse Now', '1979-08-15', 8.4, 7, 4);

-- Ridley Scott
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Blade Runner', '1982-06-25', 8.1, 8, 6);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Gladiador', '2000-05-05', 8.5, 8, 1);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Alien', '1979-05-25', 8.5, 8, 5);

-- James Cameron
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Titanic', '1997-12-19', 7.9, 9, 7);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Avatar', '2009-12-18', 7.9, 9, 6);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('O Exterminador do Futuro 2', '1991-07-03', 8.6, 9, 1);

-- Peter Jackson
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('O Senhor dos Anéis: A Sociedade do Anel', '2001-12-19', 8.9, 10, 12);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('O Senhor dos Anéis: O Retorno do Rei', '2003-12-17', 9.0, 10, 12);

-- Denis Villeneuve
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Duna', '2021-10-22', 8.0, 11, 6);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Blade Runner 2049', '2017-10-06', 8.0, 11, 6);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('A Chegada', '2016-11-11', 7.9, 11, 6);

-- Bong Joon-ho
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Parasita', '2019-05-30', 8.5, 13, 8);

-- Guillermo del Toro
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('O Labirinto do Fauno', '2006-10-11', 8.2, 14, 12);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('A Forma da Água', '2017-12-01', 7.3, 14, 7);

-- Akira Kurosawa
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Os Sete Samurais', '1954-04-26', 8.6, 15, 1);
INSERT INTO filme (titulo, ano_lancamento, nota_imbd, diretor_id, genero_id) VALUES ('Rashomon', '1950-08-26', 8.2, 15, 4);

