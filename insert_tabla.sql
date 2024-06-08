/**********************************************Insertar ***************************************************************/
INSERT INTO `proyecto`.`cliente`
(`nombre`,`apellido`,`telefono`,`domicilio`,`estado_civil`,`pais_residencia`)
VALUES
("kevin","McStone","11898237484","av.San justo 234, Bs As","SOLTERO","Argentina"),
("Fernando","Ponse","11234905967","av. san bernando 344, San justo, Bs As","CASADO","Argentina"),
("Lucrecia","Pactal","2323-45678","av. falsa 123, San Martin, Bs As","	CASADA","Argentina"),
("Matias","Honter","2323-220998","av. caseros 209, Moreno, Bs As","SOLTERO","Argentina"),
("Jack","Loren","11898237484","av. La cruz 233, Moron, San juan","SOLTERO","Argentina"),
("Pedro","Lorenzo","11898237484","av. Paz 900, Moron, Bariloche","SOLTERO","Argentina"),
("Lorena","Gomez","2323-45532","av. Perez 444, Loren , Neuquen","SOLTERA","Argentina"),
("Darla","Gomez","2323-9898","av.San justo 234, Bs As","SOLTERA","Argentina"),
("Sol","Morales","2323-454532","av. Perez 444, Loren , Neuquen","SOLTERA","Argentina"),
("Karen","Rosales","2323-23324","av. Gutirrez 222, BsAs","SOLTERA","Argentina");

INSERT INTO `proyecto`.`cuenta`
(`estado`,`saldoDisponible`,`cuenta_cliente`)
VALUES
("ACTIVO",200000,1),
("ACTIVO",167000,2),
("ACTIVO",990000,3),
("ACTIVO",340000,4),
("ACTIVO",788000,5),
("ACTIVO",200400,6),
("ACTIVO",767000,7),
("ACTIVO",344000,8),
("ACTIVO",120000,9),
("ACTIVO",88800,10);

INSERT INTO `proyecto`.`poliza`
(`nombre`,`descripcion`,`monto`,`fechaActiva`,`estado`,`pais`,`poliza_cuenta`)
VALUES

("SEGURO DE VIDA","Seguro de vida las 24 Hs",100,"2001-06-24","ACTIVA","ARGENTINA"	1),
("SEGURO DE CASA","Seguro ante robo",300,"2001-06-24","ACTIVA","ARGENTINA",1),
("SEGURO DE AUTO","Seguro ante robo",450,"2001-06-24","ACTIVA","ARGENTINA",1)
("SEGURO DE VIDA","Seguro de vida las 24 Hs",100,"2001-06-24","ACTIVA","ARGENTINA"	1),
("SEGURO DE AUTO","Seguro ante robo",450,"2001-06-24","ACTIVA","ARGENTINA",2),
("SEGURO DE CASA","Seguro ante robo",300,"2001-06-24","ACTIVA","ARGENTINA",3),
("SEGURO DE AUTO","Seguro ante robo",450,"2001-06-24","ACTIVA","ARGENTINA",3),
("SEGURO DE VIDA","Seguro de vida las 24 Hs",100,"2001-06-24","ACTIVA","ARGENTINA"	4),
("SEGURO DE AUTO","Seguro ante robo",450,"2001-06-24","ACTIVA","ARGENTINA",4),
("SEGURO DE AUTO","Seguro ante robo",450,"2001-06-24","ACTIVA","ARGENTINA",5),
("SEGURO DE VIDA","Seguro de vida las 24 Hs",100,"2001-06-24","ACTIVA","ARGENTINA"	6),
("SEGURO DE CASA","Seguro ante robo",300,"2001-06-24","ACTIVA","ARGENTINA",7),
("SEGURO DE AUTO","Seguro ante robo",450,"2001-06-24","ACTIVA","ARGENTINA",8),
("SEGURO DE VIDA","Seguro de vida las 24 Hs",100,"2001-06-24","ACTIVA","ARGENTINA"	9),
("SEGURO DE CASA","Seguro ante robo",300,"2001-06-24","ACTIVA","ARGENTINA",10);


INSERT INTO `proyecto`.`solicitud`
(`fecha_registro`,`descripcion_motivo`,`estado_solicitud`,`solicitud_poliza`,`solicitud_cuenta`)
VALUES
("2008-06-24","Descontento del servicio de la poliza","EN ESTUDIO",1,1),
("2008-09-24","No conforme con el servicio","EN ESTUDIO",2,2),
("2008-06-09","Salida del pais","EN ESTUDIO",3,3),
("2008-03-24","No requerido","EN ESTUDIO",4,4),
("2008-06-10","No requerido","EN ESTUDIO",5,5),
("2008-06-09","Deuda acomulada sin poder pagar","EN ESTUDIO",6,6),
("2008-03-24","Cambio de servicio","EN ESTUDIO",7,7),
("2008-06-09","No conforme con el servicio","EN ESTUDIO",8,8)
("2008-06-09","No conforme con el servicio","EN ESTUDIO",9,9)
("2008-06-09","No conforme con el servicio","EN ESTUDIO",10,10);