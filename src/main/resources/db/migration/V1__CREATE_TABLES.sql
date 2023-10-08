-- TABELA DE LINKS
CREATE TABLE dbcdb.links (
	id int NOT NULL,
	link varchar NOT NULL,
	texto varchar NOT NULL,
	id_usuario int NOT NULL,
	id_tipo int NOT NULL,
	id_organizacao int NOT NULL,
	data_criacao timestamp NOT NULL,
	data_exclusao timestamp NULL,
	data_modificacao timestamp NULL,
	CONSTRAINT links_pk PRIMARY KEY (id)
);

-- TABELA DE ACTION_BUTTON
CREATE TABLE dbcdb.action_buttons (
	id int NOT NULL,
	link varchar NOT NULL,
	icone_url varchar NOT NULL,
	descricao varchar NULL,
	style_nameid varchar NOT NULL,
	id_usuario int NOT NULL,
	id_organizacao int NOT NULL,
	data_criacao timestamp NOT NULL,
	data_exclusao timestamp NULL,
	data_modificacao timestamp NULL,
	CONSTRAINT action_button_pk PRIMARY KEY (id)
);

-- TABELA DE CONTACT_LINKS
CREATE TABLE dbcdb.contact_links (
	id int NOT NULL,
	whatsapp varchar NOT NULL,
	email varchar NOT NULL,
	telefone varchar NOT NULL,
	download_link varchar NOT NULL,
	id_usuario int NOT NULL,
	id_organizacao int NOT NULL,
	data_criacao timestamp NOT NULL,
	data_exclusao timestamp NULL,
	data_modificacao timestamp NULL,
	CONSTRAINT contact_links_pk PRIMARY KEY (id)
);

-- TABELA DE OPTIONAL_BUTTONS
CREATE TABLE dbcdb.optional_buttons (
	id int NOT NULL,
	pix_enable boolean NOT NULL,
	avaliacao_enable boolean NOT NULL,
	newsletter_enable boolean NOT NULL,
	anotacao_enable boolean NOT NULL,
	email_rapido_enable boolean NOT NULL,
	chave_pix varchar NULL,
	email_rapido_endereco varchar NULL,
	id_usuario int NOT NULL,
	id_organizacao int NOT NULL,
	data_criacao timestamp NOT NULL,
	data_exclusao timestamp NULL,
	data_modificacao timestamp NULL,
	CONSTRAINT optional_buttons_pk PRIMARY KEY (id)
);

-- TABELA DE STYLES
CREATE TABLE dbcdb.styles (
	id int NOT NULL,
	style_name varchar NOT NULL,
	id_organizacao int NOT NULL,
	data_criacao timestamp NOT NULL,
	data_exclusao timestamp NULL,
	data_modificacao timestamp NULL,
	CONSTRAINT styles_pk PRIMARY KEY (id)
);

-- TABELA DE TIPO_LINKS
CREATE TABLE dbcdb.tipo_links (
	id int NOT NULL,
	descricao varchar NOT NULL,
	id_organizacao int NOT NULL,
	data_criacao timestamp NOT NULL,
	data_exclusao timestamp NULL,
	data_modificacao timestamp NULL,
	CONSTRAINT tipo_links_pk PRIMARY KEY (id)
);

-- TABELA DE LINK_STYLES
CREATE TABLE dbcdb.link_styles (
	id int NULL,
	id_link int NULL,
	id_style int NULL,
	id_organizacao int NOT NULL,
	data_criacao timestamp NOT NULL,
	data_exclusao timestamp NULL,
	data_modificacao timestamp NULL,
	CONSTRAINT link_styles_pk PRIMARY KEY (id)
);

-- TABELA DE ACTION_BUTTON_STYLES
CREATE TABLE dbcdb.action_button_styles (
	id int NOT NULL,
	id_action_button int NOT NULL,
	id_style int NOT NULL,
	id_organizacao int NOT NULL,
	data_criacao timestamp NOT NULL,
	data_exclusao timestamp NULL,
	data_modificacao timestamp NULL,
	CONSTRAINT action_button_styles_pk PRIMARY KEY (id)
);

-- TABELA DE USER
CREATE TABLE dbcdb."users" (
	id int NOT NULL,
	username varchar NOT NULL,
	id_organizacao int NOT NULL,
	data_criacao timestamp NOT NULL,
	data_exclusao timestamp NULL,
	data_modificacao timestamp NULL,
	CONSTRAINT user_pk PRIMARY KEY (id)
);