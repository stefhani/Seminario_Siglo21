/**********************************************Crear ***************************************************************/

CREATE TABLE `proyecto`.`cliente` (
    id_cliente int not null auto_increment,
   nombre varchar(255),
  apellido varchar(255),
   telefono varchar(255),
   domicilio varchar(255),
   estado_civil varchar(255),
  pais_residencia varchar(255),
  primary key (id_cliente)
);

CREATE TABLE `proyecto`.`cuenta` (
   id_cuenta int not null auto_increment,
   estado varchar(255),
   saldoDisponible varchar(255),
   cuenta_cliente int,
   primary key(id_cuenta),
   foreign key (cuenta_cliente) references cliente(id_cliente)
   ON DELETE CASCADE
);
CREATE TABLE `proyecto`.`poliza` (
   id_poliza int not null auto_increment,
   nombre varchar(255),
   descripcion varchar(255),
   monto double,
   estado varchar(255),
   fechaActiva date,
   pais varchar(255),
   poliza_cuenta int,
   primary key(id_poliza),
   foreign key (poliza_cuenta) references cuenta(id_cuenta)
   ON DELETE CASCADE
);
CREATE TABLE `proyecto`.`solicitud` (
   id_solicitud int not null auto_increment,
   fecha_registro date,
   descripcion_motivo varchar(255),
   estado_solicitud  varchar(255),
   solicitud_poliza int,
   solicitud_cuenta int,
   primary key(id_solicitud),
   foreign key (solicitud_poliza) references poliza(id_poliza)
    ON DELETE CASCADE,
   foreign key (solicitud_cuenta) references cuenta(id_cuenta)
   ON DELETE CASCADE
);