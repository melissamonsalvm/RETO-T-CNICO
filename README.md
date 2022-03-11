### RETO TÉCNICO T-Evolvers 

Este proyecto es la solución al reto técnico planteado por la empresa T-Evolvers, la cual consta de dos pruebas automatizadas, la primera consiste en una API con diversos endpoints y la segunda es una página demo de una tienda virtual.

#### Clonar el proyecto:

Para clonar este repositorio se debe ejecutar el siguiente comando:

```bash
    git clone https://github.com/melissamonsalvm/RETO-T-CNICO.git
```

### PRUEBA DE AUTOMATIZACIÓN API

### restful-booker
Restful-booker es una API web de creación, lectura, actualización y eliminación que viene con características de autenticación y un montón de errores.
La API viene precargada con 10 registros y se restablece cada 10 minutos a ese estado por defecto.

#### Requisitos previos:

- Java y JDK (variables de entorno configuradas)
- Eclipse IDE o IntelliJ IDEA
- Gradle (variable de entorno configurada)

#### Herramientas utilizadas:
La automatización restful-booker-karate fue desarrollada con:

- **Karate BDD** - Marco de pruebas
- **Gradle** - Gestor de dependencias
- **Cucumber** - Reportes
- **Gherkin** - Lenguaje DLS legible por el negocio (lenguaje especifico de dominio legible por el negocio)
- ** Java**
- **Lombok** - Anotaciones

**Versionado:**
- Se utilizo Git para el control de versiones

#### Contenido de la automatización:

**Crear una reserva:**
- Crear correctamente una nueva reserva en la API
- Crear una reserva con datos no válidos

**Obtener una reserva por ID:**
- Obtener la reserva por ID con éxito
- Obtener una reserva por ID con datos incorrectos

**Crear Token de autenticación:** crea un nuevo token de autentificación que se utilizará para acceder a la función actualizar

- Crear con éxito un nuevo token de autenticación
- Crear un token de autenticación con datos incorrectos

**Actualizar una reserva:**
- Actualizar correctamente una reserva por id
- Actualizar una reserva sin token de autenticación

### Ejecución del proyecto

Para ejecutar el proyecto se debe abrir el ejecutor de tareas de Gradle, posterior a esto de debe escribir:

**Ejecutar en paralelo todas las pruebas y generar el reporte de Cucumber:**

    gradle test --tests karate.booking.TestParallel

**Ejecutar la prueba de creación de reserva:**

    gradle test --tests karate.booking.runners.CreateBookingRunner

**Ejecutar la prueba de busqueda de reserva por ID:**

    gradle test --tests karate.booking.runners.GetBookingRunner

**Ejecutar la prueba de creación para token de autenticación:**

    gradle test --tests karate.booking.runners.CreateTokenRunner

**Ejecutar la prueba de actualización de reserva por ID:**

    gradle test --tests karate.booking.runners.UpdateBookingRunner

o simplemente, clic derecho en la prueba que se desea ejecutar.

