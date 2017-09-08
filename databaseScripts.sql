CREATE TABLE T_ENTIDAD (
	numero_entidad character varying(255) NOT NULL,
	tipo_doc_entidad character varying(255) NOT NULL,
	razon_social_entidad character varying(255) NOT NULL,
	razon_comercial_entidad character varying(255) NOT NULL,
	direccion_fiscal_entidad character varying(255) NOT NULL,
	email_main_entidad character varying(255),
	email_a_entidad character varying(255),
	email_b_entidad character varying(255),
	movil_entidad character varying(20),
	fijo_entidad character varying(20),
	num_cuenta_detraccion_entidad character varying(255),
	detalle_entidad character varying(255),
	CONSTRAINT PK_T_ENTIDAD_ID PRIMARY KEY (numero_entidad)
	);
CREATE TABLE T_USUARIO (
	id_user INT NOT NULL,
	user_name character varying(50 ) NOT NULL,
	user_pass character varying ( 500) NOT NULL,
	nombre_usuario character varying ( 500 ) NOT NULL,
	email_usuario character varying ( 255 ),
	telefono_usuario character varying (20),
	celular_usuario character varying ( 20 ),
	rol_control_usuarios BOOLEAN NOT NULL,
	rol_configurar BOOLEAN NOT NULL,
	rol_locales BOOLEAN NOT NULL,
	rol_generar_comprobante BOOLEAN NOT NULL,
	rol_consultar_comprobante BOOLEAN NOT NULL,
	rol_generar_resumenes BOOLEAN NOT NULL,
	rol_consultar_resumenes BOOLEAN NOT NULL,
	rol_generar_bajas BOOLEAN NOT NULL,
	rol_consultar_bajas BOOLEAN NOT NULL,
	rol_catalogos BOOLEAN NOT NULL,
	rol_consultar_catalogos BOOLEAN NOT NULL,
	rol_entidades BOOLEAN NOT NULL,
	rol_certificado_digital BOOLEAN NOT NULL,
	rol_cuentas BOOLEAN NOT NULL,
	rol_api_integracion BOOLEAN NOT NULL,
	CONSTRAINT PK_T_USUARIO_ID PRIMARY KEY (id_user)
	);

CREATE TABLE T_NOTA_DEBITO (
	numero_debito INTEGER NOT NULL,
	serie_debito character varying ( 50 ) NOT NULL,
	doc_modificar character varying ( 255 ),
	serie_doc_modificar character varying( 20 ),
	numero_doc_modificar character varying,
	tipo_nota_debito character varying ( 255 ) NOT NULL,
	codigo_comprobante character varying (255) NOT NULL,
	CONSTRAINT PK_T_NOTA_DEBITO PRIMARY key (codigo_comprobante)
	);
CREATE TABLE T_LOCAL (
	codigo_local INT NOT NULL,
	nombre_local VARCHAR ( 255 ) NOT NULL,
	ubigeo_inei INT NOT NULL,
	departamento VARCHAR ( 255 ) NOT NULL,
	provincia character varying ( 255 ) NOT NULL,
	distrito character varying ( 255 ) NOT NULL,
	direccion character varying ( 255 ) NOT NULL,
	CONSTRAINT PK_T_LOCAL_ID PRIMARY KEY (codigo_local)
	);
CREATE TABLE T_USUARIOS_LOCAL (
	iduserlocal serial not null,
	codigo_local INT NOT NULL,
	id_user INT NOT NULL,
	CONSTRAINT PK_T_USUARIOS_LOCAL PRIMARY KEY(iduserlocal)
	);
CREATE TABLE T_SERIE (
	id_serie INT NOT NULL,
	tipo_documento character varying ( 255 ) NOT NULL,
	serie_documento character varying ( 255 ) NOT NULL,
	codigo_local INT NOT NULL,
	CONSTRAINT PK_T_SERIE PRIMARY KEY  (id_serie)
	);
CREATE TABLE T_PRODUCTO (
	codigo_producto character varying( 255 ) NOT NULL,
	codigo_tipo character varying ( 255 ) NOT NULL,
	nombre_producto character varying ( 255 ) NOT NULL,
	moneda_producto character varying ( 100 ) NOT NULL,
	valor_u_producto DECIMAL,
	precio_u_producto DECIMAL,
	CONSTRAINT PK_T_PRODUCTO PRIMARY KEY (codigo_producto)
	);
CREATE TABLE T_IGV (
	codigo_igv INT NOT NULL,
	tipo_igv VARCHAR ( 255 ) NOT NULL,
	porcentaje_igv DECIMAL NOT NULL,
	CONSTRAINT PK_T_IGV PRIMARY KEY  (codigo_igv)
	);
CREATE TABLE T_FACTURA (
	numero_factura INT NOT NULL,
	serie_factura character varying ( 50 ) NOT NULL,
	detraccion_factura BOOLEAN,
	codigo_comprobante character varying (255) NOT NULL,
	CONSTRAINT PK_T_FACTURA PRIMARY key (codigo_comprobante)
	);
CREATE TABLE T_VENTA (
	id_venta INT NOT NULL,
	codigo_producto character varying ( 255 ) NOT NULL,
	detalle_adicional_venta character varying ( 255 ),
	cantidad_venta INT NOT NULL,
	codigo_igv INT NOT NULL,
	valor_u_venta DECIMAL NOT NULL,
	subtotal_venta DECIMAL NOT NULL,
	total_venta DECIMAL NOT NULL,
	codigo_comprobante character varying (255) NOT NULL,
	CONSTRAINT PK_T_VENTA PRIMARY KEY  (id_venta)
	);
CREATE TABLE T_TIPO_UNIDAD (
	codigo_tipo character varying ( 255 ) NOT NULL,
	nombre_tipo character varying ( 255 ) NOT NULL,
	CONSTRAINT PK_T_TIPO_UNIDAD PRIMARY KEY  (codigo_tipo)
	);
CREATE TABLE T_COMPROBANTE (
	codigo_comprobante character varying (255) NOT NULL,
	tipo_doc_comprob character varying ( 100 ) NOT NULL,
	tipo_opera_comprob character varying ( 255 ) NOT NULL,
	moneda_comprob character varying ( 50 ) NOT NULL,
	tipo_cambio_comprob decimal,
	fecha_emision_comprob date NOT NULL,
	fecha_vencimiento_comprob date NOT NULL,
	enviado_sunat_comprob BOOLEAN NOT NULL,
	estado_pago_comprob BOOLEAN NOT NULL,
	numero_entidad character varying ( 255 ) NOT NULL,
	observacion_comprob character varying ( 500 ) NOT NULL,
	estado_comprob BIT NOT NULL,
	descuento_comprob DECIMAL,
	otros_cargos_comprob DECIMAL,
	id_user INT NOT NULL,
	ruc_principal character varying ( 255 ) NOT NULL,
	CONSTRAINT PK_T_COMPROBANTE PRIMARY KEY  (codigo_comprobante)
	);
CREATE TABLE T_PRINCIPAL (
	ruc_principal character varying ( 255 ) NOT NULL,
	razon_social_principal character varying ( 255 ),
	telefono_principal character varying ( 50 ),
	email_principal character varying ( 255 ),
	razon_comercial_principal character varying ( 255 ),
	web_principal character varying ( 255 ),
	logo_principal bytea,
	formato_facturas_principal character varying ( 50 ) NOT NULL,
	formato_boletas_principal character varying ( 50 ) NOT NULL,
	color_comprobante_principal character varying ( 50 ) NOT NULL,
	datos_cabecera_principal character varying ( 255 ) NOT NULL,
	codigo_local INT NOT NULL,
	CONSTRAINT PK_T_PRINCIPAL PRIMARY KEY (ruc_principal)
	);
CREATE TABLE T_CUENTAS (
	codigo_cuenta INT NOT NULL,
	moneda_cuenta character varying ( 255 ) NOT NULL,
	tipo_cuenta character varying ( 255 ) NOT NULL,
	nombre_banco_cuenta character varying ( 255 ) NOT NULL,
	titular_cuenta character varying ( 255 ) NOT NULL,
	numero_cuenta character varying ( 255 ) NOT NULL,
	cci_cuenta character varying ( 255 ),
	descripcion_cuenta character varying ( 255 ),
	estado_cuenta BOOLEAN NOT NULL,
	codigo_local int not null,
	CONSTRAINT PK_T_CUENTAS PRIMARY KEY  (codigo_cuenta)
	);
CREATE TABLE T_COMPRA (
	fecha_emision_compra DATE NOT NULL,
	fecha_vencimiento_compra DATE NOT NULL,
	tipo_compra character varying ( 255 ),
	serie_compra character varying ( 50 ) NOT NULL,
	numero_compra INT NOT NULL,
	numero_entidad character varying (255) NOT NULL,
	denominacion_compra character varying ( 255 ) NOT NULL,
	moneda_compra character varying ( 50 ) NOT NULL,
	tc_compra decimal NOT NULL,
	gravada_compra DECIMAL,
	exonerada_compra DECIMAL,
	inafecta_compra DECIMAL,
	isc_compra DECIMAL,
	igv_compra DECIMAL NOT NULL,
	otros_compra DECIMAL,
	total_compra DECIMAL NOT NULL,
	detraccion_bool_compra BOOLEAN NOT NULL,
	importe_detraccion_compra BOOLEAN NOT NULL,
	detalle_compra character varying  ( 500 ),
	anulado_bool BOOLEAN NOT NULL,
	fecha_doc_modificado_compra DATE,
	tipo_doc_modificado_compra character varying  ( 255 ),
	serie_doc_modificado_compra character varying  ( 255 ),
	numero_doc_modificado_compra character varying  ( 255 ),
	observaciones_compra character varying  ( 255 ),
	codigo_compra INT NOT NULL,
	CONSTRAINT PK_T_COMPRA PRIMARY KEY (codigo_compra)
	);
CREATE TABLE T_NOTA_CREDITO (
	numero_credito INT NOT NULL,
	serie_credito character varying  ( 255 ) NOT NULL,
	doc_modificar character varying  ( 255 ) NOT NULL,
	serie_doc_modificar character varying  ( 255 ),
	numero_doc_modificar INT,
	tipo_nota_credito character varying  ( 255 ) NOT NULL,
	codigo_comprobante character varying (255) not null,
	CONSTRAINT PK_T_NOTA_CREDITO PRIMARY key (codigo_comprobante)
	);
CREATE TABLE T_BOLETA (
	numero_boleta int not null,
	serie_boleta character varying (255) not null,
	codigo_comprobante character varying (255) not null,
	constraint PK_T_BOLETA PRIMARY KEY(codigo_comprobante)
	);
CREATE TABLE T_UNIDAD_MEDIDA (
	codigo_tipo character varying  ( 255 ) NOT NULL,
	descripcion_unidad character varying  ( 255 ) NOT NULL,
	CONSTRAINT PK_T_UNIDAD_MEDIDA PRIMARY KEY (codigo_tipo)
	);
ALTER TABLE T_PRODUCTO ADD CONSTRAINT FK_T_PRODUCTO_UNIDAD FOREIGN KEY (codigo_tipo) REFERENCES T_UNIDAD_MEDIDA (codigo_tipo);
ALTER TABLE T_FACTURA ADD CONSTRAINT FK_T_FACTURA_COMPROBANTE FOREIGN KEY (codigo_comprobante) REFERENCES T_COMPROBANTE (codigo_comprobante) ;
ALTER TABLE T_SERIE ADD CONSTRAINT FK_T_SERIE_LOCAL FOREIGN KEY (codigo_local) REFERENCES T_LOCAL (codigo_local) ;
ALTER TABLE T_VENTA ADD CONSTRAINT FK_T_VENTA_COMPROBANTE FOREIGN KEY (codigo_comprobante) REFERENCES T_COMPROBANTE (codigo_comprobante) ;
ALTER TABLE T_VENTA ADD CONSTRAINT FK_T_VENTA_IGV FOREIGN KEY (codigo_igv) REFERENCES T_IGV (codigo_igv) ;
ALTER TABLE T_VENTA ADD CONSTRAINT FK_T_VENTA_PRODUCTO FOREIGN KEY (codigo_producto) REFERENCES T_PRODUCTO (codigo_producto) ;
ALTER TABLE T_USUARIOS_LOCAL ADD CONSTRAINT FK_T_USUARIOS_LOCAL_LOCAL FOREIGN KEY (codigo_local) REFERENCES T_LOCAL (codigo_local);
ALTER TABLE T_USUARIOS_LOCAL ADD CONSTRAINT FK_T_USUARIOS_LOCAL_USERS FOREIGN KEY (id_user) REFERENCES T_USUARIO (id_user);
ALTER TABLE T_NOTA_CREDITO ADD CONSTRAINT FK_T_NOTA_CREDITO_COMPROBANTE FOREIGN KEY (codigo_comprobante) REFERENCES T_COMPROBANTE (codigo_comprobante);
ALTER TABLE T_PRINCIPAL ADD CONSTRAINT FK_T_PRINCIPAL_LOCAL FOREIGN KEY (codigo_local) REFERENCES T_LOCAL (codigo_local);
ALTER TABLE T_CUENTAS ADD CONSTRAINT FK_T_CUENTAS_LOCAL FOREIGN KEY (codigo_local) REFERENCES T_LOCAL (codigo_local)  ;
ALTER TABLE T_NOTA_DEBITO ADD CONSTRAINT FK_T_NOTA_DEBITO_COMPROBANTE FOREIGN KEY (codigo_comprobante) REFERENCES T_COMPROBANTE (codigo_comprobante) ;
ALTER TABLE T_COMPROBANTE ADD CONSTRAINT FK_T_COMPROBANTE_PRINCIPAL FOREIGN KEY (ruc_principal) REFERENCES T_PRINCIPAL (ruc_principal) ;
ALTER TABLE T_COMPROBANTE ADD CONSTRAINT FK_T_COMPROBANTE_ENTIDAD FOREIGN KEY (numero_entidad) REFERENCES T_ENTIDAD (numero_entidad) ;
ALTER TABLE T_UNIDAD_MEDIDA ADD CONSTRAINT FK_T_UNIDAD_MEDIDA_TIPO FOREIGN KEY (codigo_tipo) REFERENCES T_TIPO_UNIDAD(codigo_tipo);
ALTER TABLE T_BOLETA ADD CONSTRAINT FK_T_BOLETA_COMPROBANTE FOREIGN KEY (codigo_comprobante) REFERENCES T_COMPROBANTE(codigo_comprobante);
ALTER TABLE T_COMPRA ADD CONSTRAINT FK_T_COMPRA_ENTIDAD FOREIGN KEY (numero_entidad) REFERENCES T_ENTIDAD(numero_entidad);