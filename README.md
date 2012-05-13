SABio
=====

Sistema de gerenciamento de Academias

## Configuração Inicial

1. Instale o [PostgreSQL][]:

   * Ubuntu:
       sudo apt-get install postgresql postgresql-client postgresql-contrib

   * Arch Linux:
       sudo pacman -S -pgsql postgresql

[PostgreSQL]: http://www.postgresql.org/

2. Pelo pqsl, crie o usuário *sabio* com a senha *sabio*:

        CREATE USER sabio WITH PASSWORD 'sabio' createdb;

3. Crie o banco de dados *sabiodb*:

        CREATE DATABASE saibiodb WITH OWNER = sabio ENCODING = 'UTF8';
