CREATE TABLE produto (
    produto_id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    marca VARCHAR(100) NOT NULL,
    tamanho VARCHAR(100) NOT NULL,
    itens_inclusos VARCHAR(100) NOT NULL,
    valor DECIMAL(5,2) NOT NULL,
    PRIMARY KEY(produto_id)
);

DESCRIBE produto;

