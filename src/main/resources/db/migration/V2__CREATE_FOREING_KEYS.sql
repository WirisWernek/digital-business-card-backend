-- CHAVE ESTRANGEIRA DE TIPO LINKS NA TABELA LINKS
ALTER TABLE dbcdb.links ADD CONSTRAINT tipo_link_fk FOREIGN KEY (id_tipo) REFERENCES dbcdb.tipo_links(id);

-- CHAVE ESTRANGEIRA DE LINK NA TABELA LINK_STYLES
ALTER TABLE dbcdb.link_styles ADD CONSTRAINT link_fk FOREIGN KEY (id_link) REFERENCES dbcdb.links(id);

-- CHAVE ESTRANGEIRA DE STYLE NA TABELA LINK_STYLES
ALTER TABLE dbcdb.link_styles ADD CONSTRAINT style_fk FOREIGN KEY (id_style) REFERENCES dbcdb.styles(id);

-- CHAVE ESTRANGEIRA DE ACTION_BUTTON NA TABELA ACTION_BUTTON_STYLE
ALTER TABLE dbcdb.action_button_styles ADD CONSTRAINT action_button_fk FOREIGN KEY (id_action_button) REFERENCES dbcdb.action_buttons(id);

-- CHAVE ESTRANGEIRA DE STYLE NA TABELA ACTION_BUTTON_STYLE
ALTER TABLE dbcdb.action_button_styles ADD CONSTRAINT style_fk FOREIGN KEY (id_style) REFERENCES dbcdb.styles(id);

-- CHAVE ESTRANGEIRA DE USER NA TABELA ACTION_BUTTONS
ALTER TABLE dbcdb.action_buttons ADD CONSTRAINT user_fk FOREIGN KEY (id_usuario) REFERENCES dbcdb."users"(id);

-- CHAVE ESTRANGEIRA DE USER NA TABELA CONTACT_LINKS
ALTER TABLE dbcdb.contact_links ADD CONSTRAINT user_fk FOREIGN KEY (id_usuario) REFERENCES dbcdb."users"(id);

-- CHAVE ESTRANGEIRA DE USER NA TABELA OPTIONAL_BUTTONS
ALTER TABLE dbcdb.optional_buttons ADD CONSTRAINT user_fk FOREIGN KEY (id_usuario) REFERENCES dbcdb."users"(id);

-- CHAVE ESTRANGEIRA DE USER NA TABELA LINKS
ALTER TABLE dbcdb.links ADD CONSTRAINT user_fk FOREIGN KEY (id_usuario) REFERENCES dbcdb."users"(id);

-- CHAVE ESTRANGEIRA DE OPTIONAL_BUTTON NA TABELA OPTIONAL_BUTTON_STYLES
ALTER TABLE dbcdb.optional_button_styles ADD CONSTRAINT optional_button_fk FOREIGN KEY (id_optional_button) REFERENCES dbcdb.optional_buttons(id);

-- CHAVE ESTRANGEIRA DE STYLE NA TABELA OPTIONAL_BUTTON_STYLES
ALTER TABLE dbcdb.optional_button_styles ADD CONSTRAINT style_fk FOREIGN KEY (id_style) REFERENCES dbcdb.styles(id);