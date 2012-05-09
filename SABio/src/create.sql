DROP TABLE IF EXISTS usuario CASCADE;
DROP TABLE IF EXISTS instrutor CASCADE;
DROP TABLE IF EXISTS atendente CASCADE;
DROP TABLE IF EXISTS cliente CASCADE;
DROP TABLE IF EXISTS treino CASCADE;
DROP TABLE IF EXISTS avaliacao_fisica CASCADE;
DROP TABLE IF EXISTS exercicio CASCADE;
DROP TABLE IF EXISTS supervisiona CASCADE;


CREATE TABLE usuario
(
    login VARCHAR(15) CONSTRAINT usuario_login_pk PRIMARY KEY,
    senha CHAR(32) CONSTRAINT usuario_senha_nn NOT NULL
);


CREATE TABLE instrutor
(
    login                    VARCHAR(15),
    nome                     VARCHAR(50),
    cpf                      VARCHAR(11),
    rg                       VARCHAR(9) CONSTRAINT instrutor_rg_nn NOT NULL,
    endereco                 VARCHAR(50),
    carga_horaria            INTEGER,
    numero_carteira_trabalho VARCHAR(10) CONSTRAINT instrutor_nct_nn NOT NULL
    UNIQUE,
    registro_profissional    VARCHAR(10),
    data_contratacao         DATE,
    CONSTRAINT instrutor_fk FOREIGN KEY (login) REFERENCES usuario(login),
    CONSTRAINT instrutor_pk PRIMARY KEY (login)
);


CREATE TABLE atendente
(
    login                       VARCHAR(15),
    nome                        VARCHAR(50),
    cpf                         VARCHAR(11),
    rg                          VARCHAR(9) CONSTRAINT atendente_rg_nn NOT NULL,
    endereco                    VARCHAR(50),
    numero_carteira_trabalho VARCHAR(20) CONSTRAINT atendente_nct_nn NOT NULL
    UNIQUE,
    data_contratacao            DATE,
    CONSTRAINT atendente_fk FOREIGN KEY (login) REFERENCES usuario(login),
    CONSTRAINT atendente_pk PRIMARY KEY (login)
);


CREATE TABLE cliente
(
    login               VARCHAR(15),
    nome_cliente        VARCHAR(50) CONSTRAINT cliente_nome_nn NOT NULL,
    cpf                 VARCHAR(11),
    rg                  VARCHAR(9) CONSTRAINT cliente_rg_nn NOT NULL,
    data_ingresso       DATE,
    telefone            INTEGER,
    atestado_medico     VARCHAR(20) CONSTRAINT cliente_atestado_medico_nn NOT
    NULL,
    data_nascimento     DATE,
    mensalidades_abertas VARCHAR(50),
    status              BOOLEAN CONSTRAINT cliente_status_nn NOT NULL,
    CONSTRAINT cliente_fk FOREIGN KEY (login) REFERENCES usuario(login),
    CONSTRAINT cliente_pk PRIMARY KEY (login)
);


CREATE TABLE treino
(
    login         VARCHAR(15),
    treino_id     INTEGER,
    tipo_treino   VARCHAR(15),
    data_inicio   DATE,
    nivel         INTEGER,
    numero_dias   INTEGER,
    nome_treino   VARCHAR(20),
    carga         INTEGER CONSTRAINT treino_carga_nn NOT NULL,
    numero_series INTEGER CONSTRAINT treino_numero_series_nn NOT NULL,
    CONSTRAINT treino_fk FOREIGN KEY (login) REFERENCES cliente(login),
    CONSTRAINT treino_pk PRIMARY KEY (treino_id)
);


CREATE TABLE avaliacao_fisica
(
    login_cliente         VARCHAR (15),
    login_instrutor       VARCHAR (15),
    id                    VARCHAR (4),
    data_realizacao       DATE,
    observacoes           VARCHAR (100),
    CONSTRAINT af_fk FOREIGN KEY (login_cliente) REFERENCES cliente(login),
    CONSTRAINT af_log_fk FOREIGN KEY (login_instrutor) REFERENCES instrutor(login),
    CONSTRAINT af_id_pk PRIMARY KEY (id)
);


CREATE TABLE exercicio
(
    id_ex            INTEGER,
    carga            INTEGER CONSTRAINT ex_carga_nn NOT NULL,
    numero_de_series INTEGER CONSTRAINT ex_nds_nn NOT NULL,
    exercicio        VARCHAR (20),
    cpf_cliente      VARCHAR (11),
    login_cliente    VARCHAR (15),
    CONSTRAINT ex_id_fk FOREIGN KEY (id_ex, cpf_cliente, login_cliente)
    REFERENCES treino(treino_id, cpf, login),
    CONSTRAINT ex_exid_pk PRIMARY KEY (exercicio, id_ex, cpf_cliente,
    login_cliente)
);


CREATE TABLE supervisiona
(
    cpf_cliente           VARCHAR (11),
    login_cliente         VARCHAR (15),
    login_instrutor       VARCHAR (15),
    cpf_instrutor         VARCHAR (11),
    registro_profissional VARCHAR (20),
    id_super              INTEGER,
    CONSTRAINT super_rp_fk FOREIGN KEY (registro_profissional, cpf_instrutor,
    login_instrutor) REFERENCES instrutor(registro_profissional, cpf, login),
    CONSTRAINT super_id_fk FOREIGN KEY (id_super, cpf_cliente, login_cliente)
    REFERENCES treino(treino_id, cpf, login),
    CONSTRAINT super_rpid_pk PRIMARY KEY (registro_profissional, id_super,
    cpf_cliente, login_cliente, cpf_instrutor, login_instrutor)
);


INSERT INTO usuario (login, senha) VALUES ('atendente01', md5('stuvwx'));
INSERT INTO usuario (login, senha) VALUES ('atendente02', md5('010203'));
INSERT INTO usuario (login, senha) VALUES ('atendente03', md5('yzabcd'));
INSERT INTO usuario (login, senha) VALUES ('cliente01', md5('012345'));
INSERT INTO usuario (login, senha) VALUES ('cliente02', md5('abcdef'));
INSERT INTO usuario (login, senha) VALUES ('cliente03', md5('654321'));
INSERT INTO usuario (login, senha) VALUES ('instrutor01', md5('ghijkl'));
INSERT INTO usuario (login, senha) VALUES ('instrutor02', md5('123456'));
INSERT INTO usuario (login, senha) VALUES ('instrutor03', md5('mnopqr'));
INSERT INTO usuario (login, senha) VALUES ('instrutor04', md5('678910'));



INSERT INTO instrutor (login, nome, cpf, rg, endereco, carga_horaria,numero_carteira_trabalho, registro_profissional, data_contratacao)
VALUES ('instrutor01', 'ronaldo', '48288636489', '911225341', 'sao carlos', 6, '100', 'reg01', '2007-05-22');
INSERT INTO instrutor (login, nome, cpf, rg, endereco, carga_horaria, numero_carteira_trabalho, registro_profissional, data_contratacao)
VALUES ('instrutor02', 'jose', '15558633700', '475769872', 'sao carlos', 7, '200', 'reg02', '2006-08-23');
INSERT INTO instrutor (login, nome, cpf, rg, endereco, carga_horaria, numero_carteira_trabalho, registro_profissional, data_contratacao)
VALUES ('instrutor03', 'joao', '96565461309', '458357596', 'sao carlos', 8, '300', 'reg03', '2009-04-10');
INSERT INTO instrutor (login, nome, cpf, rg, endereco, carga_horaria, numero_carteira_trabalho, registro_profissional, data_contratacao)
VALUES ('instrutor04', 'gabriel', '79612191700', '405286480', 'araraquara', 9, '400', 'reg04', '2010-02-04');


INSERT INTO atendente (login, nome, cpf, rg, endereco, numero_carteira_trabalho, data_contratacao)
VALUES ('atendente01', 'eduardo', '46754463708', '812835341', 'araraquara', '500', '10-07-2000');
INSERT INTO atendente (login, nome, cpf, rg, endereco, numero_carteira_trabalho, data_contratacao)
VALUES ('atendente02', 'stefano', '11165868350', '409289440', 'sao carlos', '600', '10-07-2000');
INSERT INTO atendente (login, nome, cpf, rg, endereco, numero_carteira_trabalho, data_contratacao)
VALUES ('atendente03', 'julio', '88962615703', '403289440', 'sao paulo', '700', '10-07-2000');



INSERT INTO cliente (login, nome_cliente, cpf, rg, data_ingresso, telefone, atestado_medico, data_nascimento, mensalidades_abertas, status)
VALUES ('cliente01', 'andre', '37513012911', '429434121', '2008-07-28', 39210605, 'em dia', '1990-05-10', 'janeiro', True);
INSERT INTO cliente (login, nome_cliente, cpf, rg, data_ingresso, telefone, atestado_medico, data_nascimento, mensalidades_abertas, status)
VALUES ('cliente02', 'tulio', '29642217589', '433279470', '2008-07-28', 34156000, 'em dia', '1989-05-10', 'fevereiro, março', True);
INSERT INTO cliente (login, nome_cliente, cpf, rg, data_ingresso, telefone, atestado_medico, data_nascimento, mensalidades_abertas, status)
VALUES ('cliente03', 'pedro', '71224314875', '307298450', '2008-07-28', 34210000, 'em dia', '1989-05-10', '', False);



INSERT INTO treino (login, treino_id, cpf, tipo_treino, data_inicio, nivel, numero_dias, nome_treino, carga, numero_series)
VALUES('cliente01', 1, '37513012911', 'supino', '2012-01-01', 2, 3, 'supino inclinado', 50, 10);
INSERT INTO treino (login, treino_id, cpf, tipo_treino, data_inicio, nivel, numero_dias, nome_treino, carga, numero_series)
VALUES('cliente02', 2, '29642217589', 'agachamento', '2012-01-01', 1, 4, 'agachamento', 30, 10);
INSERT INTO treino (login, treino_id, cpf, tipo_treino, data_inicio, nivel, numero_dias, nome_treino, carga, numero_series)
VALUES('cliente03', 3, '71224314875', 'tipo2', '2012-01-01', 2, 3, 'crucifixo', 10, 10);


INSERT INTO avaliacao_fisica (cpf_cliente, login_cliente, login_instrutor, cpf_instrutor,
    registro_profissional, id, data_realizacao, observacoes)
VALUES ('37513012911', 'cliente01', 'instrutor01', '48288636489', 'reg01', '1', '2012-01-01', 'Tudo ok');



INSERT INTO exercicio (id_ex, carga, numero_de_series, exercicio, cpf_cliente, login_cliente)
VALUES (1, 3 , 5, 'supino', '37513012911','cliente01');

INSERT INTO exercicio (id_ex, carga, numero_de_series, exercicio, cpf_cliente, login_cliente)
VALUES (2, 5 , 2, 'flexao', '29642217589','cliente02');


INSERT INTO exercicio (id_ex, carga, numero_de_series, exercicio, cpf_cliente, login_cliente)
VALUES (3, 4 , 4, 'agachamento', '71224314875','cliente03');


INSERT INTO supervisiona (cpf_cliente, login_cliente, login_instrutor, cpf_instrutor, registro_profissional, id_super)
VALUES ('37513012911','cliente01','instrutor01', '48288636489','reg01', 1);

INSERT INTO supervisiona (cpf_cliente, login_cliente, login_instrutor, cpf_instrutor, registro_profissional, id_super)
VALUES ('29642217589','cliente02','instrutor02', '15558633700','reg02', 2);
 
INSERT INTO supervisiona (cpf_cliente, login_cliente, login_instrutor, cpf_instrutor, registro_profissional, id_super)
VALUES ('71224314875','cliente03','instrutor03', '96565461309','reg03', 3);
