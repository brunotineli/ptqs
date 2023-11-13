CREATE TABLE itemincluso (
itemincluso_id INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(200) NOT NULL,
quantidade INT NOT NULL,
produto_id INT NOT NULL,
PRIMARY KEY(itemincluso_id),
FOREIGN KEY(produto_id) REFERENCES produto(produto_id)
);

ALTER TABLE itemincluso
ADD COLUMN quantidade INT NOT NULL;

INSERT INTO itemincluso (
nome, quantidade, produto_id) values (
"Controles", 2, 1
);

INSERT INTO itemincluso (
nome, quantidade, produto_id) values (
"Jogos", 3, 1
);


INSERT INTO itemincluso (
nome, quantidade, produto_id) values (
"Controles", 3, 2
);

INSERT INTO itemincluso (
nome, quantidade, produto_id) values (
"Jogos", 3, 2
);


INSERT INTO itemincluso (
nome, quantidade, produto_id) values (
"Controles", 3, 3
);

INSERT INTO itemincluso (
nome, quantidade, produto_id) values (
"Jogos", 4, 3
);



INSERT INTO itemincluso (
nome, quantidade, produto_id) values (
"Controles", 4, 4
);

INSERT INTO itemincluso (
nome, quantidade, produto_id) values (
"Jogos", 4, 4
);


ALTER TABLE produto DROP COLUMN itens_inclusos;

select * from produto join itemincluso on itemincluso.produto_id = itemincluso.produto_id;