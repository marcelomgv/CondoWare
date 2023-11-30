CREATE ROLE Sindico WITH
LOGIN
PASSWORD 'root'
CREATEROLE;

GRANT ALL ON Area_Lazer, Apartamento, Pessoa, Funcionario, Condomino, Veiculo TO Sindico;