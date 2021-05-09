#language: es

Característica: Crear y elimimar registros
  Como un nuevo usuario
  Quiere ingresar a la pagina opensource
  Para validar los datos del usuario

  @EscenarioLogin
  Escenario: Acceso al panel de control usuario
    Dado  que Paul accede a la web de Orange
    Cuando el introduce su credenciales
    Entonces el vera su nombre en panel inicial

  @EscenarioCrearRegistro
  Escenario: Crear nuevo registro
    Dado  que Paul accede a la web de Orange
    Cuando el introduce su credenciales
    Y crea el usuario
      | nombre | segNombre | apellido | id   | licenciaCond | fExpLicencia | ssn       | sin       | estadoCivil | nacionalidad | fechaCumpleanos | apodo  | libMilitar | jobTitle    | detalleContrato    | categoria     | fechaContrato | subCategoria | ubicacion            | inicioContrato | finalContrato |
      | Jose   | Tercero   | Marrugo  | 0340 | 987987       | 2018-09-21   | 123456789 | 987654321 | Married     | Colombian    | 1992-11-29      | Pepito | 555323     | QA Engineer | Full-Time Contract | Professionals | 2021-05-05    | Engineering  | Canadian Regional HQ | 2021-05-06     | 2022-05-06    |
    Entonces el valida que se creo un nuevo resgistro

  @EscenarioEliminarRegistro
   Escenario: Eliminar Registro
      Dado  que Paul accede a la web de Orange
      Cuando el introduce su credenciales
      Y elimina el registro
        | nombre | segNombre | apellido | id   |
        | Jose   | Tercero   | Marrugo  | 0340 |
      Entonces el visualiza el mensaje success delete

  @EscenarioEliminarRegistroFallido
  Escenario: Eliminar Registro
    Dado  que Paul accede a la web de Orange
    Cuando el introduce su credenciales
    Y elimina el registro
      | nombre | segNombre | apellido | id   |
      | Jose   | Tercero   | Marrugo  | 0535 |
    Entonces el visualiza el mensaje success delete