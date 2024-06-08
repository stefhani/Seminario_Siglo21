/**********************************************Consultas ***************************************************************/
SELECT `cliente`.`id_cliente`,
    `cliente`.`nombre`,
    `cliente`.`apellido`,
    `cliente`.`telefono`,
    `cliente`.`domicilio`,
    `cliente`.`estado_civil`,
    `cliente`.`pais_residencia`,
	`cuenta`.`id_cuenta`,
    `cuenta`.`estado`,
    `cuenta`.`saldoDisponible`,
    `cuenta`.`cuenta_cliente`
FROM `proyecto`.`cliente`,
     `proyecto`.`cuenta`
WHERE 
  `proyecto`.`cliente`.id_cliente = `proyecto`.`cuenta`.cuenta_cliente


SELECT `cuenta`.`id_cuenta`,
    `cuenta`.`estado`,
    `cuenta`.`saldoDisponible`,
    `cuenta`.`cuenta_cliente`,
    `poliza`.`id_poliza`,
    `poliza`.`nombre`,
    `poliza`.`descripcion`,
    `poliza`.`monto`,
    `poliza`.`fechaActiva`,
    `poliza`.`estado`,
    `poliza`.`pais`,
    `poliza`.`poliza_cuenta`
FROM `proyecto`.`cuenta`,
     `proyecto`.`poliza`
WHERE `proyecto`.`cuenta`.id_cuenta= `proyecto`.`poliza`.poliza_cuenta

SELECT `poliza`.`id_poliza`,
    `poliza`.`nombre`,
    `poliza`.`descripcion`,
    `poliza`.`monto`,
    `poliza`.`fechaActiva`,
    `poliza`.`estado`,
    `poliza`.`pais`,
    `poliza`.`poliza_cuenta`,
    `solicitud`.`id_solicitud`,
    `solicitud`.`fecha_registro`,
    `solicitud`.`descripcion_motivo`,
    `solicitud`.`estado_solicitud`,
    `solicitud`.`solicitud_poliza`,
    `solicitud`.`solicitud_cuenta`
FROM `proyecto`.`poliza`,
     `proyecto`.`solicitud`
WHERE  `proyecto`.`poliza`.id_poliza =  `proyecto`.`solicitud`.id_solicitud
