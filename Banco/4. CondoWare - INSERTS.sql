INSERT INTO Condominio VALUES ('Condominio Manauara', 'Rua das Lamentações, 60, Jd. Porto Bello', 15, 30);

INSERT INTO Pessoa VALUES (12345678900, 'Algusto Barreto Costa', 'sindico@gmail.com', 'root');
INSERT INTO Pessoa VALUES (23456789001, 'Desmond Eixo Feitosa', 'desmond@gmail.com', 'root');
INSERT INTO Pessoa VALUES (45678900123, 'Gustavo Heitor Iano', 'gustavo@gmail.com', 'root');
INSERT INTO Pessoa VALUES (67890012345, 'João Kamilo Lorenzote', 'joao@gmail.com', 'root');
INSERT INTO Pessoa VALUES (89001234567, 'Marcos Neto Oppenheimer', 'marcos@gmail.com', 'root');
INSERT INTO Pessoa VALUES (34567890012, 'Antônio Gomes Pinto', 'antonio@gmail.com', 'root');
INSERT INTO Pessoa VALUES (90123456789, 'Paula Queiroz Rossi', 'paula@gmail.com', 'root');
INSERT INTO Pessoa VALUES (91234567890, 'Laura Silva Costa', 'laura@gmail.com', 'root');
INSERT INTO Pessoa VALUES (56789001234, 'Brenda Solom Bastos', 'brenda@gmail.com', 'root');
INSERT INTO Pessoa VALUES (78900123456, 'Sofia Ramos Evergreen', 'sofia@gmail.com', 'root');
INSERT INTO Pessoa VALUES (90012345678, 'Matheus Souza Batista', 'matheus@gmail.com', 'root');

INSERT INTO Funcionario VALUES (12345678900, 4000.00, 'Síndico');
INSERT INTO Funcionario VALUES (23456789001, 2500.00, 'Zelador');
INSERT INTO Funcionario VALUES (45678900123, 3000.00, 'Porteiro');
INSERT INTO Funcionario VALUES (67890012345, 3000.00, 'Porteiro');
INSERT INTO Funcionario VALUES (89001234567, 2500.00, 'Zelador');

INSERT INTO Condomino VALUES (12345678900, 1, 1);
INSERT INTO Condomino VALUES (34567890012, 1, 20);
INSERT INTO Condomino VALUES (90123456789, 1, 5);
INSERT INTO Condomino VALUES (91234567890, 1, 30);
INSERT INTO Condomino VALUES (56789001234, 4, 8);
INSERT INTO Condomino VALUES (78900123456, 5, 10);
INSERT INTO Condomino VALUES (90012345678, 15, 20);

INSERT INTO Veiculo VALUES (12345678900, 'ABC-123');
INSERT INTO Veiculo VALUES (23456789001, 'XYZ-987');
INSERT INTO Veiculo VALUES (45678900123, 'DEF-456');
INSERT INTO Veiculo VALUES (67890012345, 'GHI-789');
INSERT INTO Veiculo VALUES (34567890012, 'JKL-012');
INSERT INTO Veiculo VALUES (90123456789, 'MNO-345');
INSERT INTO Veiculo VALUES (91234567890, 'PQR-678');
INSERT INTO Veiculo VALUES (56789001234, 'STU-901');
INSERT INTO Veiculo VALUES (78900123456, 'VWX-234');
INSERT INTO Veiculo VALUES (78900123456, 'YZA-567');

INSERT INTO Area_Lazer VALUES (101, 'Espaço Festa', 70, 100);
INSERT INTO Area_Lazer VALUES (102, 'Espaço com Churrasqueira', 40, 70);
INSERT INTO Area_Lazer VALUES (401, 'Espaço Festa', 100, 100);
INSERT INTO Area_Lazer VALUES (402, 'Piscina', 50, 100);
INSERT INTO Area_Lazer VALUES (403, 'Espaço Festa', 50, 70);
INSERT INTO Area_Lazer VALUES (1101, 'Espaço com Churrasqueira', 40, 70);
INSERT INTO Area_Lazer VALUES (1102, 'Piscina', 50, 100);

--REALIZAR NOVAMENTE APÓS ADD TODOS
INSERT INTO Areas_Alug VALUES (102, '2023-12-20', 12345678900);
INSERT INTO Areas_Alug VALUES (402, '2023-9-10', 90123456789);
INSERT INTO Areas_Alug VALUES (1101, '2025-10-19', 56789001234);

INSERT INTO Visita VALUES ('Antonio', 1, 20, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO Visita VALUES ('Luiz Castro', 1, 20, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO Visita VALUES ('José Gomes', 4, 8, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO Visita VALUES ('Marcelo', 15, 20, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO Visita VALUES ('João', 1, 5, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO Reg_Problemas VALUES (34567890012, 'Grande quantidade de lixo acumulado na entrada', NULL, CURRENT_TIMESTAMP);
INSERT INTO Reg_Problemas VALUES (34567890012, 'Muito barulho durante a noite no apartamento 5', 1, CURRENT_TIMESTAMP);
INSERT INTO Reg_Problemas VALUES (91234567890, 'Piscina com lixo', 4, CURRENT_TIMESTAMP);
INSERT INTO Reg_Problemas VALUES (78900123456, 'Os porteiros estão passando muito tempo fora da portaria', NULL, CURRENT_TIMESTAMP);
INSERT INTO Reg_Problemas VALUES (90012345678, 'Vazamento da torneira no salão de festa', 1, CURRENT_TIMESTAMP);

INSERT INTO Emp_Contrat VALUES ('Limpeza Certa', '64956489253', 'Augusto Santos Costa', 'Serviços terceirizados de limpeza das áreas de lazer');
INSERT INTO Emp_Contrat VALUES ('Clean Piscinas', '64956489253', NULL, 'Serviços terceirizados de limpeza de piscina');
INSERT INTO Emp_Contrat VALUES ('Conserta Tudo', '64956489253', 'Gilberto Castro Silva', 'Serviços terceirizados de consertos e manutenção em geral do condomínio');
INSERT INTO Emp_Contrat VALUES ('Vida Salva', '64956489253', 'José Silva Santos', 'Serviços terceirizados de segurança e monitoramento');