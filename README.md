SABio
=====

Sistema de gerenciamento de Academias.

## Configuração Inicial

Para evitar possiveis problemas, recomendamos instalar os mesmos softwares
utilizados para o desenvolvimento deste sitema:
*   [PostgreSQL 9.1.3][postgre]
*   [jdk 7u3-1][jdk]
*   [NetBeans 7.1.2][netbeans]
*   [PostgreSQL JDBC driver 9.1-902][jdbc]
*   [Plugin JUnit 4.11](http://www.junit.org)

[postgre]: http://www.postgresql.org/
[jdk]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[netbeans]: http://netbeans.org/
[jdbc]: http://jdbc.postgresql.org/download.html


1. Instale o PostgreSQL:

    * Ubuntu:
        sudo apt-get install postgresql postgresql-client postgresql-contrib
    * Arch Linux:
        sudo pacman -S -pgsql postgresql

2. Pelo pqsl, crie o usuário *sabio* com a senha *sabio*:

        CREATE USER sabio WITH PASSWORD 'sabio' createdb;

3. Crie o banco de dados *sabiodb*:

        CREATE DATABASE saibiodb WITH OWNER = sabio ENCODING = 'UTF8';

4. Conecte o NetBeans ao BD (Services -> Databases -> New connection...):
    * Driver: PostgreSQL
    * Driver File(s): /usr/share/netbeans/ide/modules/ext/postgresql-9.1-902.jdbc4.jar
    * Driver Name: PostgreSQL
    * Host: localhost
    * Port: 5432
    * Database: sabiodb
    * User Name: sabio
    * Password: sabio
    * JDBC URL: jdbc:postgresql://localhost:5432/sabiodb

5. Execute o script *create.sql* para criar as tabelas e preenchê-las com
exemplos.

## TODO
- Teste de cobertura
- Caso de uso *gerar relatório*
