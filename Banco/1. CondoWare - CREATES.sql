CREATE TABLE Condominio(
	nome VARCHAR(45) NOT NULL,
	endereco VARCHAR(60) NOT NULL,
	quant_blocos INT NOT NULL,
	quant_ap_bloco INT NOT NULL
);

CREATE TABLE Area_Lazer(
	id INT NOT NULL,
	tipo VARCHAR(45) NOT NULL,
	capacidade INT,
	aluguel FLOAT
);

CREATE TABLE Areas_Alug(
	id INT NOT NULL,
	data_aluguel DATE,
	locador BIGINT
);

CREATE TABLE Apartamento(
	bloco INT NOT NULL,
	numero INT NOT NULL,
	ocupado BOOLEAN NOT NULL
);

CREATE TABLE Pessoa(
	cpf BIGINT NOT NULL,
    nome VARCHAR(45) NOT NULL,
	email VARCHAR(45) NOT NULL,
	senha VARCHAR(30) NOT NULL
);

CREATE TABLE Funcionario(
	cpf BIGINT NOT NULL,
    salario NUMERIC(6,2) NOT NULL,
    cargo VARCHAR(40) NOT NULL
);

CREATE TABLE Condomino(
	cpf BIGINT NOT NULL,
	bloco INT NOT NULL,
    apartamento INT NOT NULL
);

CREATE TABLE Veiculo(
	cpf BIGINT,
    placa VARCHAR(7) UNIQUE
);

CREATE TABLE Visita(
	nome VARCHAR(45) NOT NULL,
	bloco_vis INT NOT NULL,
	apartamento_vis INT NOT NULL,
	entrada TIMESTAMP,
	saida TIMESTAMP
);

CREATE TABLE Reg_Problemas(
	condomino BIGINT NOT NULL,
	descricao VARCHAR(100) NOT NULL,
	bloco INT,
	data TIMESTAMP
);

CREATE TABLE Emp_Contrat(
	nome VARCHAR(30) NOT NULL,
	contato VARCHAR(15) NOT NULL,
	responsavel VARCHAR(45),
	serv_atr VARCHAR(100) NOT NULL
);

ALTER TABLE Pessoa ADD PRIMARY KEY (cpf);

ALTER TABLE Area_Lazer ADD PRIMARY KEY (id);

ALTER TABLE Areas_Alug ADD FOREIGN KEY (id) REFERENCES Area_Lazer(id);
ALTER TABLE Areas_Alug ADD FOREIGN KEY (locador) REFERENCES Pessoa(cpf);

ALTER TABLE Apartamento ADD PRIMARY KEY (bloco, numero);

ALTER TABLE Funcionario ADD PRIMARY KEY (cpf);
ALTER TABLE Funcionario ADD FOREIGN KEY (cpf) REFERENCES Pessoa(cpf);

ALTER TABLE Condomino ADD PRIMARY KEY (cpf);
ALTER TABLE Condomino ADD FOREIGN KEY (cpf) REFERENCES Pessoa(cpf);

ALTER TABLE Veiculo ADD FOREIGN KEY (cpf) REFERENCES Pessoa(cpf);

ALTER TABLE Reg_Problemas ADD FOREIGN KEY (condomino) REFERENCES Pessoa(cpf);