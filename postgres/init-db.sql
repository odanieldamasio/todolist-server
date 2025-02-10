-- Cria um usuário se ele não existir
DO
$do$
BEGIN
   IF NOT EXISTS (SELECT FROM pg_roles WHERE rolname = 'meu_usuario') THEN
      CREATE ROLE meu_usuario WITH LOGIN PASSWORD 'minha_senha';
      ALTER ROLE meu_usuario CREATEDB;
   END IF;
END
$do$;

-- Cria um banco de dados se ele não existir
CREATE DATABASE meu_banco OWNER meu_usuario;
